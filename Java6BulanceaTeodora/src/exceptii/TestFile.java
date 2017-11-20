/*
 *Create a file and write in it
 */

package exceptii;

import java.util.Scanner;
import java.io.*;
import java.util.logging.Level;
import java.util.logging.Logger;


/**
 *
 * @author bulan
 */
public class TestFile {

    /**
     * @param args the command line arguments
     * @throws java.io.IOException
     */
    public static void main(String[] args){
        // TODO code application logic here
        BufferedWriter output = null;
        
        String text;
        Scanner scan = new Scanner(System.in);
        
            text = scan.nextLine();
 
            try{
              File file = new File("Tema Exceptions");
            try {
                output = new BufferedWriter(new FileWriter(file));
            } catch (IOException ex) {
                Logger.getLogger(TestFile.class.getName()).log(Level.SEVERE, null, ex);
            }
            try {
                output.write(text);
            } catch (IOException ex) {
                Logger.getLogger(TestFile.class.getName()).log(Level.SEVERE, null, ex);
            }

            } finally{
                
                if (output != null){
                    try {
                        output.close();
                    } catch (IOException ex) {
                        Logger.getLogger(TestFile.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }
            }   
    
    }
}

