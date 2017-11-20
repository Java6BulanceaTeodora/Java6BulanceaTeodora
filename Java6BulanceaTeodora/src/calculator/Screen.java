/*
 * Screen of computer;
 */
package calculator;

/**
 *Class Screen implements behavior of the screen
 * @author bulan
 */
public class Screen {
 
    private int valoareAfisata = 0;

    /**
     * 
     * @return the value of valoareAfisata
     */
    public int getValoareAfisata() {
        return valoareAfisata;
    }

    /**
     * set the value of valoareAfisata
     * @param valoareAfisata 
     */
    public void setValoareAfisata(int valoareAfisata) {
        this.valoareAfisata = valoareAfisata;
    }
    
    /**
     * Method display specified parameter value 
     * @param valueToDisplay
     */
    public void display(int valueToDisplay){
        valoareAfisata = valueToDisplay;
        System.out.println(valueToDisplay);
    }
    
    /**
     * Method clears the screen and displays 0
     */
    public void clear(){
        System.out.println(0);
        valoareAfisata = 0;
    }
    
    /**
     * Method display a specified message
     * @param message 
     */
    public void displayMessage(String message){
        System.out.println(message);
    }
    
    
   
}
