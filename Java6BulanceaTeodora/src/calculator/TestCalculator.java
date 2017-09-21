/*
 * Tests Calculator
 */

package calculator;
import java.util.*;
/**
 *
 * @author bulan
 */
public class TestCalculator {

    /**
     * Class TestCalculator tests Calculator
     * @param args the command line arguments
     */
    public static void main(String[] args) {

// create a Calculator instance90
        Calculator computer = new Calculator();
        //start the Calculator
        computer.start();
        //test the add of 123 * 223
        computer.add();//metoda add va citi din consola operanzii - daca nu pun parametri
        //test 233 - 122
        computer.decrease();
        // test 123 * 12
        computer.multiply();
        //test 24:6
        computer.divide();
        
        int numar1;
        int numar2;
        String operator;
       
       Scanner numeric = new Scanner(System.in);
       
       System.out.println("Please introduce your first number:");
       numar1 = Integer.parseInt(numeric.nextLine());
       
       System.out.println(" Please introduce operator(+/-/*//)");
       operator = numeric.nextLine();
       
       System.out.println("Please introduce second number:");
       numar2 = Integer.parseInt(numeric.nextLine());
       
       System.out.println("=");
       
       
       switch(operator){
       
           case "+":
               System.out.println("Result is : " + (numar1 + numar2));
           break;
           
           case "-":
               System.out.println("Result is: " + (numar1 - numar2));
           break;
           
           case "*":
                System.out.println("Result is: " + (numar1 * numar2));
           break;
           
           case "/":
               System.out.println("Result is: " + (numar1 / numar2));
           break;
           
           default:
               System.out.println("Sorry, you introduced wrong data. I quit :)");
           return;
       
       }
     
       
       }
    }
    

