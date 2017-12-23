/*
 * Family scene
 */
package multithreading;

/**
 *
 * @author Teodora
 */
public class FamilyScene {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        // Create instances of all actors
        Cigar tigara = new Cigar();
        Woman femeie = new Woman(tigara);
        VacuumCleaner aspirator = new VacuumCleaner();
        Tv televizor = new Tv();
        Man barbat = new Man(aspirator, femeie, televizor);
        
         
        // Start the threads
        tigara.start();
        aspirator.start();
        televizor.start();
        femeie.start();
        barbat.start();
        
    }
    
}
