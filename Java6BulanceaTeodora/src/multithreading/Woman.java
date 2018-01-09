/*
 * Woman character
 */
package multithreading;

/**
 *
 * @author Teodora
 */
public class Woman extends Thread{
   
    private  final  Cigar tigara;
    private  Tv televizor;
    private  Man barbat;
    
    private boolean isSleeping = true;

    public void setIsSleeping(boolean isSleeping) {
        this.isSleeping = isSleeping;
    }
    
    public Woman(Cigar trabuc){
        tigara = trabuc;   
    }
    
    @Override
    public  void run(){
        sleeping();
    }

    private synchronized void sleeping(){
        while(true){
            if(isSleeping == false){
                System.out.println("Femeia s-a trezit si isi urmareste emisiunea preferata.");
                break;
            } else {
                System.out.println("Femeia doarme si sforaie.");
            }
        }
    }
  
}
