/*
 *Create a file and write in it
 */

package exceptii;

import java.util.Scanner;
import java.io.*;


/**
 *
 * @author bulan
 */
public class TestFile {

    /**
     * @param args the command line arguments
     * @throws java.io.IOException
     */
    public static void main(String[] args) throws IOException {
        // TODO code application logic here
        BufferedWriter output = null;
        
        String text;
        Scanner scan = new Scanner(System.in);
        
            text = scan.nextLine();
 
            try{
              File file = new File("Tema Exceptions");
              output = new BufferedWriter(new FileWriter(file));
              output.write(text);

            } finally{
                
                if (output != null){
                    output.close();
                }
            }   
    
    }
}

