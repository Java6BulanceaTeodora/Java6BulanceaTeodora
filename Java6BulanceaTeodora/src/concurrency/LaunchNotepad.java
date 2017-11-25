/*
 * Class opens 3 Notepad files
 */
package concurrency;

import java.io.File;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Teodora
 */
public class LaunchNotepad {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try{
            ProcessBuilder pb = new ProcessBuilder("Notepad");
            pb.directory(new File("C:\\Users\\bulan\\Desktop"));

            Process p1 = pb.start();
            Process p2 = pb.start();
            Process p3 = pb.start();
           } catch (IOException ex) {         
                Logger.getLogger(LaunchNotepad.class.getName()).log(Level.SEVERE, "An IO exception is here!", ex);   
           }    
    } 
}
