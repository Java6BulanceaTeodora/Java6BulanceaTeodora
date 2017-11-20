/*
 * Test of the class Screen
 */
package calculator;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author bulan
 */
public class ScreenTest {
    
    public ScreenTest() {
    }

    /**
     * Test of getValoareAfisata method, of class Screen.
     */
    @Test
    public void testGetValoareAfisata() {
        System.out.println("getValoareAfisata");
        Screen instance = new Screen();
        int expResult = 0;
        int result = instance.getValoareAfisata();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of setValoareAfisata method, of class Screen.
     */
    @Test
    public void testSetValoareAfisata() {
        System.out.println("setValoareAfisata");
        int valoareAfisata = 13;
        Screen instance = new Screen();
        instance.setValoareAfisata(valoareAfisata);
        int expResult = instance.getValoareAfisata();
        assertEquals(valoareAfisata, expResult);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of display method, of class Screen.
     */
    @Test
    public void testDisplay() {
        System.out.println("display");
        int valueToDisplay = 15;
        Screen instance = new Screen();
        instance.display(valueToDisplay);
        int expResult = instance.getValoareAfisata();
        assertEquals(valueToDisplay, expResult);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of clear method, of class Screen.
     */
    @Test
    public void testClear() {
        System.out.println("clear");
        Screen instance = new Screen();
        instance.clear();
        
        // TODO review the generated test code and remove the default call to fail.
       // fail("The test case is a prototype.");
    }

    /**
     * Test of displayMessage method, of class Screen.
     */
    @Test
    public void testDisplayMessage() {
        System.out.println("displayMessage");
        String message = "Catavencu";
        Screen instance = new Screen();
        instance.displayMessage(message); 
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
}
