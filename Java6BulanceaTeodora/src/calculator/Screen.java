/*
 * Screen of computer;
 */
package calculator;

/**
 *Class Screen implements behaviour of the screen
 * @author bulan
 */
public class Screen {
    
    String screenMemory = "Display: ";
    
    public void display(String deAfisat){
        screenMemory += deAfisat;
     
        System.out.println( screenMemory);
    }
   
}
