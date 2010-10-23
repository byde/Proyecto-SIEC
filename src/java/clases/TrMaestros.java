/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package clases;

import MovimientosBD.ConexionBD;
import java.sql.*;

/**
 *
 * @author Sandsower
 */
public class TrMaestros
{
    private int Maestro_ID;
    private String codigo;
    private int usuario_ID;

    public TrMaestros(int Maestro_ID, String codigo, int usuario_ID){
        this.setCodigo(codigo);
        this.setMaestro_ID(Maestro_ID);
        this.setUsuario_ID(usuario_ID);
    }

    /**
     * @return the Maestro_ID
     */
    public int getMaestro_ID() {
        return Maestro_ID;
    }

    /**
     * @param Maestro_ID the Maestro_ID to set
     */
    public void setMaestro_ID(int Maestro_ID) {
        this.Maestro_ID = Maestro_ID;
    }

    /**
     * @return the codigo
     */
    public String getCodigo() {
        return codigo;
    }

    /**
     * @param codigo the codigo to set
     */
    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    /**
     * @return the usuario_ID
     */
    public int getUsuario_ID() {
        return usuario_ID;
    }

    /**
     * @param usuario_ID the usuario_ID to set
     */
    public void setUsuario_ID(int usuario_ID) {
        this.usuario_ID = usuario_ID;
    }

    public TrMaestros obtenerMaestro (int id){
        try {
            ConexionBD nuevaConexion = new ConexionBD();
            nuevaConexion.conectarBD("root", "13450811");
            Connection con = nuevaConexion.getCon();
            Statement stmt = null;
            ResultSet rs = null;
            TrMaestros mae = null;
            //SQL query command
            String SQL = "SELECT * FROM Tc_Carrera WHERE Carrera_ID="+id;
            stmt = con.createStatement();
            rs = stmt.executeQuery(SQL);
            while(rs.next()){
                mae = new TrMaestros(rs.getInt("Maestro_ID"), rs.getString("Codigo"), rs.getInt("Usuario_ID"));
            }
            return mae;
        } catch (SQLException ex) {
            System.out.println("SQL Exception: "+ ex.toString());
        }
        return null;
    }
}