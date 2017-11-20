/*
 * Tests the class Figure
 */
package definitions;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author bulan
 */
public class FigureTest {
    
    public FigureTest() {
    }

    /**
     * Test of getDefinition method, of class Figure.
     */
    @Test
    public void testGetDefinition() {
        System.out.println("getDefinition");
        Figure instance = new Figure();
        String expResult = "a plane figure ";
        String result = instance.getDefinition();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
}
