/*
 * Button of the computer
 */
package calculator;

/**
 *class Button implements the characteristics of the button
 * @author bulan
 */
public class Button {
    
    private Character markup;
    
    /**
     * 
     * @return the markup of the button
     */
    public Character pushButton(){
        return markup;
    }
    
    /**
     * Method draw the character on the button
     * @param markup 
     */
    public void drawOnButton (Character markup){
        this.markup = markup;
    }

}
