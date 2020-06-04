
package DAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


public class Conexion {
    protected Connection conexion;
    
    private final String JDBC_DRIVER = "com.mysql.jdbc.Driver"; //com.mysql.jdbc.Driver
    private final String DB_URL = "jdbc:mysql://localhost:5432/ejemplo";
    //credenciales db
    private final String USER = "Admin";
    private final String PASS = "123";
    
    public void connectar() throws Exception{
        try{
            conexion = DriverManager.getConnection(DB_URL, USER, PASS);
            Class.forName(JDBC_DRIVER);
            
        }catch(Exception e){
            throw e;
        }              
    }
     public void cerrar()throws SQLException{
            if(conexion != null)
            {
                if (!conexion.isClosed())
                {
                    conexion.close();
                }
            }
        }
}
