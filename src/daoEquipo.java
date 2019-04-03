import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.sql.*;

public class daoEquipo implements Crud {

    private Coneccion conexion;
    public daoEquipo(){

        this.conexion = new Coneccion();
    }
    @Override
    public List<Equipo> listar(){

        String sql = "SELECT * FROM equipos";

       try {

           Statement st = ((Connection) this.conexion).createStatement();
           ResultSet result = st.executeQuery(sql);
           List<Equipo> equipos = new ArrayList<>();

           while(result.next()){
               Equipo e = new  Equipo();
               e.setIdEquipo(result.getInt("id_equipo"));
               e.setNombreEquipo(result.getString("nombre_equipo"));
               //e.setFundacion(result.getDate("fundacion"));
               e.setAntiguedad(result.getInt("antiguedad"));
               equipos.add(e);
           }
           return equipos;



       }catch(SQLException e){
           e.printStackTrace();
           System.out.println("Tenemos un problema con la conexion");
           return null;
       }/*finally{
           try{
               if(st != null){
                   st.close();
               }
           }catch(SQLException e){
               System.out.println("No se genero el statement");
           }
           try{
               if(conexion!= null){
                   conexion.close();
               }
           }catch(SQLException e){
               System.out.println("No se  ha generado ninguna conexion");
           }
       }*/


    }
}
