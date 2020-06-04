
package BD;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;


public class Cursose {
    
    public static void main(String... mitocode) throws SQLException {
    
     final String JDBC_DRIVER = "com.mysql.jdbc.Driver"; //com.mysql.jdbc.Driver
     final String DB_URL = "jdbc:mysql://localhost:5432/ejemplo";
    //credenciales db
     final String USER = "Admin";
     final String PASS = "123";
    
    Connection conexion = null;
   try{
            conexion = DriverManager.getConnection(DB_URL, USER, PASS);
            Class.forName(JDBC_DRIVER);
            
            PreparedStatement st = conexion.prepareStatement("INSERT INTO PERSONA(nombre) values('Matt')");
            
            st.executeUpdate();
            st.close();
            
        }catch(Exception e){
            e.getMessage();
        }finally
            {
              if(conexion != null)
              {
                 if(!conexion.isClosed()){
                     conexion.close();
                 } 
              }
            }
    }
}
