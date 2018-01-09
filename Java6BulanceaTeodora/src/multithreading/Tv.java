/*
 * Tv
 */
package multithreading;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Teodora
 */
public class Tv extends Thread{
    private boolean favouriteShow = false;
    private Woman femeie;

    public boolean isFavouriteShow() {
        return favouriteShow;
    }
    
    @Override 
    public synchronized void run(){
        try{
            System.out.println("Totul la televizor este plictisitor.");
            Thread.sleep(1000);
            
            favouriteShow = true;
            receiving();
            //System.out.println("Favourite show starts!");
            
            
        } catch(InterruptedException e){
            Logger.getLogger(Tv.class.getName()).log(Level.SEVERE, null, e);
        }
    }
    
    private synchronized void receiving(){
        while(true){
            if (favouriteShow == true){
                System.out.println("Emisiunea preferata a inceput.");
                
            break;
            }
        
        }
    }
}
