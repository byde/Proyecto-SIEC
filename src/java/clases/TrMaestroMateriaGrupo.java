
package clases;

import MovimientosBD.ConexionBD;
import java.sql.*;


public class TrMaestroMateriaGrupo {


    private int maestroMateriaGrupo_ID;
    private int grupoGrupo_ID;
    private int maestroMateria_ID;

   
    public TrMaestroMateriaGrupo(int maestroMateriaGrupo_ID,int grupoGrupo_ID, int maestroMateria_ID)
    {
     this.setGrupoGrupo_ID(grupoGrupo_ID);
     this.setMaestroMateriaGrupo_ID(maestroMateriaGrupo_ID);
     this.setMaestroMateria_ID(maestroMateria_ID);
    }

    /**
     * @return the maestroMateriaGrupo_ID
     */
    public int getMaestroMateriaGrupo_ID() {
        return maestroMateriaGrupo_ID;
    }

    /**
     * @param maestroMateriaGrupo_ID the maestroMateriaGrupo_ID to set
     */
    public void setMaestroMateriaGrupo_ID(int maestroMateriaGrupo_ID) {
        this.maestroMateriaGrupo_ID = maestroMateriaGrupo_ID;
    }

    /**
     * @return the grupoGrupo_ID
     */
    public int getGrupoGrupo_ID() {
        return grupoGrupo_ID;
    }

    /**
     * @param grupoGrupo_ID the grupoGrupo_ID to set
     */
    public void setGrupoGrupo_ID(int grupoGrupo_ID) {
        this.grupoGrupo_ID = grupoGrupo_ID;
    }

    /**
     * @return the maestroMateria_ID
     */
    public int getMaestroMateria_ID() {
        return maestroMateria_ID;
    }

    /**
     * @param maestroMateria_ID the maestroMateria_ID to set
     */
    public void setMaestroMateria_ID(int maestroMateria_ID) {
        this.maestroMateria_ID = maestroMateria_ID;
    }

    public TrMaestroMateriaGrupo obtenerMaestroMateriaGrupo (int id){
        try {
            ConexionBD nuevaConexion = new ConexionBD();
            nuevaConexion.conectarBD("root", "13450811");
            Connection con = nuevaConexion.getCon();
            Statement stmt = null;
            ResultSet rs = null;
            TrMaestroMateriaGrupo mmg = null;
            //SQL query command
            String SQL = "SELECT * FROM Tr_Maestro_Materia_Grupo WHERE Tr_Maestro_Materia_Grupo_ID="+id;
            stmt = con.createStatement();
            rs = stmt.executeQuery(SQL);
            while(rs.next()){
                mmg = new TrMaestroMateriaGrupo(rs.getInt("Maestro_Materia_Grupo_ID"), rs.getInt("Grupo_ID"), rs.getInt("Maestro_Materia_ID"));
            }
            return mmg;
        } catch (SQLException ex) {
            System.out.println("SQL Exception: "+ ex.toString());
        }
        return null;
    }
}
