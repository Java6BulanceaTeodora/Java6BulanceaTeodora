/*
 *Test of the class Processor
 */
package calculator;

import org.junit.Test;
import static org.junit.Assert.*;


/**
 *
 * @author bulan
 */
public class ProcessorTest {
    
    public ProcessorTest() {
    }
    
            
            /**
     * Test of getPrimulOperand method, of class Processor.
     */
    @Test
    public void testGetPrimulOperand() {
        System.out.println("getPrimulOperand");
        Processor instance = new Processor();
        
        Double expResult = 25.05;
        instance.setPrimulOperand(expResult);
        Double result = instance.getPrimulOperand();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of setPrimulOperand method, of class Processor.
     */
    @Test
    public void testSetPrimulOperand() {
        System.out.println("setPrimulOperand");
        Processor instance = new Processor();
        Double primulOperand = 25.05;
        instance.setPrimulOperand(primulOperand);
        Double result = instance.getPrimulOperand();
        assertEquals(result, primulOperand);
        
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getAlDoileaOperand method, of class Processor.
     */
    @Test
    public void testGetAlDoileaOperand() {
        System.out.println("getAlDoileaOperand");
        Processor instance = new Processor();
        Double expResult = 2.02;
        instance.setAlDoileaOperand(expResult);
        Double result = instance.getAlDoileaOperand();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of setAlDoileaOperand method, of class Processor.
     */
    @Test
    public void testSetAlDoileaOperand() {
        System.out.println("setAlDoileaOperand");
        Processor instance = new Processor();
        Double alDoileaOperand = 2.02;
        instance.setAlDoileaOperand(alDoileaOperand);
        Double expResult = instance.getAlDoileaOperand();
        assertEquals(alDoileaOperand, expResult);
        // TODO review the generated test code and remove the default call to fail.
       // fail("The test case is a prototype.");
    }

    /**
     * Test of getRezultat method, of class Processor.
     */
    @Test
    public void testGetRezultat() {
        System.out.println("getRezultat");
        Processor instance = new Processor();
        
        Double expResult = 50.60;
        instance.setRezultat(expResult);
        Double result = instance.getRezultat();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of setRezultat method, of class Processor.
     */
    @Test
    public void testSetRezultat() {
        System.out.println("setRezultat");
        Double rezultat = 50.60;
        Processor instance = new Processor();
        instance.setRezultat(rezultat);
        Double expResult = instance.getRezultat();
        assertEquals(rezultat, expResult);
        // TODO review the generated test code and remove the default call to fail.
       // fail("The test case is a prototype.");
    }

    /**
     * Test of getOperator method, of class Processor.
     */
    @Test
    public void testGetOperator() {
        System.out.println("getOperator");
        Processor instance = new Processor();
        Character expResult = '*';
        instance.setOperator(expResult);
        Character result = instance.getOperator();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of setOperator method, of class Processor.
     */
    @Test
    public void testSetOperator() {
        System.out.println("setOperator");
        Character operator;
        operator = '*';
        Processor instance = new Processor();
        instance.setOperator(operator);
        Character expResult = instance.getOperator();
        assertEquals(operator, expResult);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of calculeaza method, of class Processor.
     */
    @Test
    public void testCalculeaza() {
        System.out.println("calculeaza");
        Processor instance = new Processor();
        Double expResult = 50.601;
        instance.setPrimulOperand(25.05);
        instance.setAlDoileaOperand(2.02);
        instance.setOperator('*');
        Double result = instance.calculeaza();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
}
