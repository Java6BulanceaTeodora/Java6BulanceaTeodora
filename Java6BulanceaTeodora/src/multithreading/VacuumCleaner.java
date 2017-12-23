/*
 * Vacuum cleaner
 */
package multithreading;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Teodora
 */
public class VacuumCleaner extends Thread{
    
    private boolean vcCleaning = false;

    public boolean isVcCleaning() {
        return vcCleaning;
    }

    public void setVcCleaning(boolean vcCleaning) {
        this.vcCleaning = vcCleaning;
    }
    
    @Override
    public void run(){
        System.out.println("Aspiratorul este utilizat de catre barbat.");
        cleaning();
    }
    
    private void cleaning(){
        if(vcCleaning == true){
            try {
                Thread.sleep(MIN_PRIORITY);
            } catch (InterruptedException ex) {
                Logger.getLogger(VacuumCleaner.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
    
}
