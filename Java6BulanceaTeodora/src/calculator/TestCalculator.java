/*
 * Tests Calculator
 */

package calculator;
/**
 *
 * @author bulan
 */
public class TestCalculator {

    static Frame calculator = new Frame();
    
    /**
     * Class TestCalculator tests Calculator
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        //run the computer
        calculator.start();
        
        //read first operand on a line (enter confirms the number is ready)
        calculator.displayMessageOnScreen("Please insert your first operand: ");
        
        //read first operand
        calculator.pushButtonsForOperand();
        
        //read operator
        calculator.displayMessageOnScreen("Please insert the operator: ");
        
        //read operation
        calculator.pushButtonForOperator();
        
        //read second operand on a line (enter confirms the number is ready)
        calculator.displayMessageOnScreen("Please insert your second operand: ");
        
        //read the second operand
        calculator.pushButtonsForOperand();
        
        //read "="
        calculator.displayMessageOnScreen("Please insert = : ");
        
        //please push the equal sign
        calculator.pushButtonEqual();
    }
}

