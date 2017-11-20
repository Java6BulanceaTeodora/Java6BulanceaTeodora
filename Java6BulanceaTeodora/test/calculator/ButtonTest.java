/*
 * Test of the class Button
 */
package calculator;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author bulan
 */
public class ButtonTest {
    
    public ButtonTest() {
    }

    /**
     * Test of pushButton method, of class Button.
     */
    @Test
    public void testPushButton() {
        System.out.println("pushButton");
        Button instance = new Button();
        instance.drawOnButton('a');
        Character expResult = 'a';
        Character result = instance.pushButton();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of drawOnButton method, of class Button.
     */
    @Test
    public void testDrawOnButton() {
        System.out.println("drawOnButton");
        Character markup = 'b';
        Button instance = new Button();
        instance.drawOnButton(markup);
        Character result;
        result = instance.pushButton();
         
        Character expResult = 'b';
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
}
