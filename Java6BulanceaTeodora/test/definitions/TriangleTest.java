/*
 * Tests the class Triangle
 */
package definitions;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author bulan
 */
public class TriangleTest {
    
    public TriangleTest() {
    }

    /**
     * Test of getDefinition method, of class Triangle.
     */
    @Test
    public void testGetDefinition() {
        System.out.println("getDefinition");
        Triangle instance = new Triangle();
        String expResult = "TRIANGLE: a plane figure with three straight sides and three angles.";
        String result = instance.getDefinition();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
}
