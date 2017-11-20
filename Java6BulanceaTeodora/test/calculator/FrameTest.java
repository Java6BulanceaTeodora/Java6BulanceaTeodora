/*
 *Test of the class Frame
 */
package calculator;


import org.junit.Test;
import static org.junit.Assert.*;
/**
 *
 * @author bulan
 */
public class FrameTest {
    
    public FrameTest() {
    }

    /**
     * Test of getEcran method, of class Frame.
     */
    @Test
    public void testGetEcran() {
        System.out.println("getEcran");
        Frame instance = new Frame();
        Screen expResult = null;
        instance.setEcran(expResult);
        Screen result = instance.getEcran();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    

    /**
     * Test of setEcran method, of class Frame.
     */
    @Test
    public void testSetEcran() {
        System.out.println("setEcran");
        Screen ecran = null;
        Frame instance = new Frame();
        instance.setEcran(ecran);
        Screen result = instance.getEcran();
        assertEquals(ecran, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    

    /**
     * Test of getButoane method, of class Frame.
     */
    @Test
    public void testGetButoane() {
        System.out.println("getButoane");
        Frame instance = new Frame();
        Button[] expResult = null;
        instance.setButoane(expResult);
        Button[] result = instance.getButoane();
        assertArrayEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    

    /**
     * Test of setButoane method, of class Frame.
     */
    
    
    @Test
    public void testSetButoane() {
        System.out.println("setButoane");
        Button[] butoane = null;
        Frame instance = new Frame();
        instance.setButoane(butoane);
        Button [] result  = instance.getButoane();
        assertArrayEquals(butoane, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
    /**
     * Test of getProcesor method, of class Frame.
     */
    
    @Test
    public void testGetProcesor() {
        System.out.println("getProcesor");
        Frame instance = new Frame();
        Processor expResult = null;
        instance.setProcesor(expResult);
        Processor result = instance.getProcesor();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
    /**
     * Test of setProcesor method, of class Frame.
     */
    
    @Test
    public void testSetProcesor() {
        System.out.println("setProcesor");
        Processor procesor = null;
        Frame instance = new Frame();
        instance.setProcesor(procesor);
        Processor result = instance.getProcesor();
        assertEquals(procesor, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
    /**
     * Test of start method, of class Frame.
     */
    @Test
    public void testStart() {
        System.out.println("start");
        Frame instance = new Frame();
        instance.start();
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
        int valAfisata = instance.getEcran().getValoareAfisata();
        assertEquals(0, valAfisata);
    }

    
    /**
     * Test of pushButtonsForOperand method, of class Frame.
     */
    /*
    @Test
    public void testPushButtonsForOperand() {
        System.out.println("pushButtonsForOperand");
        Frame instance = new Frame();
        instance.pushButtonsForOperand();
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    */
    /**
     * Test of pushButtonForOperator method, of class Frame.
     */
    /*
    @Test
    public void testPushButtonForOperator() {
        System.out.println("pushButtonForOperator");
        Frame instance = new Frame();
        instance.pushButtonForOperator();
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    */
    
    /**
     * Test of pushButtonEqual method, of class Frame.
     */
    @Test
    public void testPushButtonEqual() {
        System.out.println("pushButtonEqual");
        Frame instance = new Frame();
        Processor procesor = new Processor();
        Double expResult = 15.0;
        procesor.setPrimulOperand(30.0);
        procesor.setAlDoileaOperand(15.0);
        procesor.setOperator('-');
        Double result = procesor.calculeaza();
        assertEquals(expResult, result);
        
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

}
