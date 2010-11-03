/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller.AutoEvaluacion;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import clases.*;
import MovimientosBD.*;
import java.util.ArrayList;
import java.util.Iterator;
import javax.servlet.RequestDispatcher;

/**
 *
 * @author sands
 */
public class crearAE extends HttpServlet {
    //Inicializamos metodos de obtencion

    private ObtenerIndividuo obti = new ObtenerIndividuo();
    private ObtenerConjunto obtc = new ObtenerConjunto();

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //Obtenemos ID de la competencia seleccionada
        int id = Integer.parseInt(req.getParameter("ID"));
        //Llenamos nuestra lista de la tabla CriterioCompetencias
        ArrayList listaCriCo = obtc.obtenerCriterioCompetenciasbyCompetenciaID(id);
        //Obtenemos el alumno con el ID del usuario
        //TODO: Cambiar valor estatico por variable de sesion
        TrAlumnos alumno = obti.obtenerAlumnobyUsuarioID(5);
        //Obtenemos lista de MaestroMateriasGrupos por el ID de grupo sacado del alumno
        ArrayList listaMMG = obtc.obtenerMaestrosMateriasGruposbyGrupo(alumno.getGrupo_ID());
        //Llenamos nuestra lista de presesiones con coincidencia en nuestra lista criterioCompetencia seleccionada
        ArrayList listaPresesiones = this.llenarPresesiones(listaCriCo);
        //Filtramos las sesiones disponibles de acuerdo a las listas de presesiones y de maestroMateriaGrupo disponibles
        TrSesion sesion = this.filtrarSesiones(listaPresesiones, listaMMG);
        //Comprobamos la existencia de valores de autoevaluacion en nuestra tabla de evaluaciones parciales
        //De no ser asi, creamos el campo con valores nulos
        //Si no, avanzamos al siguiente paso (modificacion de valores)
        TrEvaluacionParcial eva = null;
        if (!this.evaluadaAE(sesion,alumno)) {
            eva = new TrEvaluacionParcial(0, 0, 0, 1, 1, sesion.getMaestroMateriaGrupoSesion_ID(), alumno.getAlumnos_ID());
            InsertarNuevo ins = new InsertarNuevo();
            if(!ins.insertarNuevaEvaluacionParcial(eva)){
                RequestDispatcher view = req.getRequestDispatcher("../../Error.jsp");
                view.forward(req, resp);
            }
        } else {
             //TODO: Cambiar valor estatico por variable de sesion
            eva = obti.obtenerEvaluacionParcialFilter(sesion.getMaestroMateriaGrupoSesion_ID(), 1, alumno.getAlumnos_ID());
        }
        req.setAttribute("Evaluacion", eva);
        RequestDispatcher view = req.getRequestDispatcher("AutoEva.jsp");
        view.forward(req, resp);
    }

    protected ArrayList llenarPresesiones(ArrayList listaCriCo) {
        ArrayList listaPresesiones = new ArrayList();
        Iterator it = listaCriCo.iterator();
        while (it.hasNext()) {
            TrCriterioCompetencia crico = (TrCriterioCompetencia) it.next();
            Iterator temp = obtc.obtenerPreSesionesbyCriterioCompetenciaID(crico.getCriterioCompetencia_ID()).iterator();
            while (temp.hasNext()) {
                TrPreSesion pres = (TrPreSesion) temp.next();
                listaPresesiones.add(pres);
            }
        }
        return listaPresesiones;
    }

    protected TrSesion filtrarSesiones(ArrayList listaPresesiones, ArrayList listaMMG) {
        ArrayList listaSesiones = obtc.obtenerSesiones();
        Iterator it1 = listaSesiones.iterator();
        while (it1.hasNext()) {
            TrSesion sesion = (TrSesion) it1.next();
            Iterator it2 = listaPresesiones.iterator();
            while (it2.hasNext()) {
                TrPreSesion presesion = (TrPreSesion) it2.next();
                Iterator it3 = listaMMG.iterator();
                while (it3.hasNext()) {
                    TrMaestroMateriaGrupo mmg = (TrMaestroMateriaGrupo) it3.next();
                    if (sesion.getMaeMatGrp_ID() == mmg.getMaestroMateriaGrupo_ID() && sesion.getPreSesion_ID() == presesion.getSesion_ID()) {
                        return sesion;
                    }
                }
            }
        }
        return null;
    }

    protected boolean evaluadaAE(TrSesion sesion,TrAlumnos alumno) {
        //TODO: Cambiar valor estatico por variable de sesion
        TrEvaluacionParcial eva = obti.obtenerEvaluacionParcialFilter(sesion.getMaestroMateriaGrupoSesion_ID(), 1, alumno.getAlumnos_ID());
        if (eva != null) {
            return true;
        }
        return false;
    }
}