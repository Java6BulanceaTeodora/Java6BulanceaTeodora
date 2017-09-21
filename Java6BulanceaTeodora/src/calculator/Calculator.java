/*
 * TComputer frame
 */
package calculator;

/**
 *calculator Frame
 * @author bulan
 */
public class Calculator {
    
    private Screen ecran;

    public Calculator() {
        this.ecran = new Screen();//aici s-a montat ecranul, cand se construieste calculatorul
    }
    
    
    
   /**
    * Methods adds 2 digits introduced by the user from keyboard
    */
     public void add(){
         
     }
     /**
      * Methods substracts 2 digits introduced by the user
      */
     public void decrease(){
     
     }
     /**
      * Multiply two numbers introduced by the user
      */
     public void multiply(){
     
     }
     /**
      * Divide two numbers by the user
      */
     public void divide(){
     
     }
     /**
      * starts the computer - displays 0 on the Screen
      */
     public void start(){
         ecran.display("0");
     }
     
     
}
