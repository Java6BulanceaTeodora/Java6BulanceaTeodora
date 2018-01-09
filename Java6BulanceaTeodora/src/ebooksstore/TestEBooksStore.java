/*
 * Creating the connection with the EBOOKSSTORE database
 */
package ebooksstore;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Teodora
 */
public class TestEBooksStore {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        String url = "jdbc:derby://localhost:1527/EBOOKSTORE";
        String user = "teodora";
        String password = "teodora";
        String driver = "org.apache.derby.jdbc.ClientDriver";
        
        Connection connection = null;
        
        try{
            Class driverClass = Class.forName(driver);
            connection = DriverManager.getConnection(url, user, password);
        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(TestEBooksStore.class.getName()).log(Level.SEVERE, null, ex);
        }finally{
            if (connection != null){
                try{
                    connection.close();
                }catch(SQLException e){
                    System.out.println(e);
                }
            }
        }
    }
    
}
