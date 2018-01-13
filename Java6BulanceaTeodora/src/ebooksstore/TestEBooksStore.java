/*
 * Creating the connection with the EBOOKSSTORE database
 */
package ebooksstore;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
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
        Statement statement = null;
        
        try{
            Class driverClass = Class.forName(driver);
            connection = DriverManager.getConnection(url, user, password);
            statement = connection.createStatement();
            //statement.execute("CREATE TABLE BOOK_TYPES(TYPE VARCHAR (25)PRIMARY KEY )");
            //statement.execute("CREATE TABLE BOOK_GENRES(GENRE VARCHAR (25)PRIMARY KEY )");
            //statement.execute("CREATE TABLE EBOOKS (ISBN VARCHAR (50) PRIMARY KEY, DENUMIRE VARCHAR (50), TYPE VARCHAR (25) , PAGES INTEGER, GENRE VARCHAR (25),PRICE DECIMAL (5,2),FOREIGN KEY (TYPE) REFERENCES BOOK_TYPES (TYPE),FOREIGN KEY (GENRE) REFERENCES BOOK_GENRES (GENRE))");
            //statement.execute("CREATE TABLE BOOK_AUTHORS (CNP VARCHAR (13) PRIMARY KEY,FIRST_NAME VARCHAR (30),FAMILY_NAME VARCHAR (30))");
            //statement.execute("CREATE TABLE EBOOKS_AUTHORS(ID INTEGER PRIMARY KEY, ISBN VARCHAR (50), CNP VARCHAR(13),FOREIGN KEY (ISBN) REFERENCES EBOOKS (ISBN),FOREIGN KEY (CNP) REFERENCES BOOK_AUTHORS (CNP) )");
            //statement.execute("CREATE TABLE RATINGS (RATING VARCHAR (5) PRIMARY KEY)");
            //statement.execute("CREATE TABLE USERS_ROLES (ROLE VARCHAR (25) PRIMARY KEY)");
            //statement.execute("CREATE TABLE USERS (CNP VARCHAR (13) PRIMARY KEY,NAME VARCHAR (50), PASSWORD VARCHAR (50), ROLE VARCHAR (25),FOREIGN KEY (ROLE) REFERENCES USERS_ROLES (ROLE))");
            //statement.execute("CREATE TABLE EBOOKS_RATINGS_USERS(ID INTEGER PRIMARY KEY,RATING VARCHAR (5), CNP VARCHAR (13), ISBN VARCHAR (50),FOREIGN KEY (RATING) REFERENCES RATINGS (RATING),FOREIGN KEY (CNP) REFERENCES USERS (CNP),FOREIGN KEY (ISBN) REFERENCES EBOOKS (ISBN))");
            //statement.execute("CREATE TABLE DOWNLOADS (ID_DOWNLOAD INTEGER PRIMARY KEY, DOWNLOAD_DATE DATE)");
            //statement.execute("CREATE TABLE PAYMENTS (ID_PAYMENT INTEGER PRIMARY KEY, PAYMENT_DATE DATE)");
            //statement.execute("CREATE TABLE ORDERS (ORDER_NO INTEGER PRIMARY KEY, ISBN VARCHAR (50), CNP VARCHAR (13), ID_DOWNLOAD INTEGER,ID_PAYMENT INTEGER, ORDER_DATE DATE,FOREIGN KEY (ISBN) REFERENCES EBOOKS (ISBN),FOREIGN KEY (CNP) REFERENCES USERS (CNP),FOREIGN KEY (ID_DOWNLOAD) REFERENCES DOWNLOADS (ID_DOWNLOAD),FOREIGN KEY (ID_PAYMENT) REFERENCES PAYMENTS (ID_PAYMENT))");
            //statement.execute("INSERT INTO BOOK_TYPES (TYPE) VALUES ('EBOOK')");
            //statement.execute("INSERT INTO BOOK_TYPES (TYPE) VALUES ('IBOOK')");
            //statement.execute("INSERT INTO BOOK_TYPES (TYPE) VALUES ('PDF')");
            //statement.execute("INSERT INTO BOOK_GENRES VALUES ('SF')");
            //statement.execute("INSERT INTO BOOK_GENRES VALUES ('Foreign book')");
            //statement.execute("INSERT INTO BOOK_GENRES VALUES ('Biographies & Memories')");
            //statement.execute("INSERT INTO BOOK_GENRES VALUES ('Beletristic')");
            //statement.execute("INSERT INTO BOOK_GENRES VALUES ('Specialty books')");
            //statement.execute("INSERT INTO RATINGS VALUES ('☆')");
            //statement.execute("INSERT INTO RATINGS VALUES ('☆☆')");
            //statement.execute("INSERT INTO RATINGS VALUES ('☆☆☆')");
            //statement.execute("INSERT INTO RATINGS VALUES ('☆☆☆☆')");
            //statement.execute("INSERT INTO RATINGS VALUES ('☆☆☆☆☆')");
        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(TestEBooksStore.class.getName()).log(Level.SEVERE, null, ex);
        }finally{
            if (statement != null){
                try{
                    statement.close();
                } catch (SQLException e){
                    System.out.println(e);
                }
            }
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
