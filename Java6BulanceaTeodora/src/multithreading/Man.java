/*
 * Man character
 */
package multithreading;

/**
 *
 * @author Teodora
 */
public class Man extends Thread{
   
    private final VacuumCleaner vc;
    private final Woman femeie;
    private final Tv televizor;
    
    public Man(VacuumCleaner aspirator, Woman sotie, Tv tv){
       vc = aspirator;
       femeie = sotie; 
       televizor = tv;
    }
    
    @Override
    public synchronized void run(){
        cleaning(vc);
        watchingTv(televizor, femeie);    
    }
    
    private void cleaning(VacuumCleaner vc){
       vc.setVcCleaning(true);
    }
    
    private void watchingTv(Tv tv, Woman woman){
       while(true){
           if(tv.isFavouriteShow() == true){
               woman.setIsSleeping(false);
               System.out.println("Barbatul isi trezeste sotia.");
               break;
               
           } else {
               System.out.println("Barbatul isi lasa sotia sa doarma si sa sforaie.");
           }
        
       }
    }
}
