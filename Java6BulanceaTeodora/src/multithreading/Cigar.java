/*
 * Cigar
 */
package multithreading;

/**
 *
 * @author Teodora
 */
public class Cigar extends Thread{
    
    
    @Override
    public  void run(){
        burning();
    }
    
    private synchronized void burning(){
        System.out.println("Tigara arde.");
    }
}
