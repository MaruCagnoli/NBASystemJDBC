import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.*;

public class Coneccion {

    private String JDBCdriver = "com.mysql.jdb.Driver";
    private String url = "jdbc:mysql://localhost/basquet_db";
    private String user = "root";
    private String password = "root";
    private Connection connection;

    public Coneccion(){

        try{
            Class.forName(JDBCdriver);
            this.connection = DriverManager.getConnection(url, user,password);


        }catch (ClassNotFoundException e){

            System.out.println("Falta la libreria SQL");

        }catch(SQLException s){
            s.printStackTrace();
            System.out.println("Problemas con sql");
        }





    }




}
