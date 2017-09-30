/*
 *Simple calculator
 */
package temacurs3calculator;

import java.util.Scanner;

/**
 *Class TestCalculator tests Calculator
 * @author bulan
 */
public class TestCalculator {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         
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
