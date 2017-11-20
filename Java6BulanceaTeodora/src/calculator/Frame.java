/*
 * TComputer frame
 */
package calculator;

import java.util.Scanner;

/**
 *calculator Frame
 * @author bulan
 */
public class Frame {
    
    private Screen ecran;
    private Button[] butoane;
    private final Character markupOfButtons[] = {'0','1','2','3','4','5','6','7','8','9','+','-','*','/','='};
    private Processor procesor;

    public Screen getEcran() {
        return ecran;
    }

    public void setEcran(Screen ecran) {
        this.ecran = ecran;
    }

    public Button[] getButoane() {
        return butoane;
    }

    public void setButoane(Button[] butoane) {
        this.butoane = butoane;
    }

    public Processor getProcesor() {
        return procesor;
    }

    public void setProcesor(Processor procesor) {
        this.procesor = procesor;
    }

            
    public Frame() {
        ecran = new Screen();//aici s-a montat ecranul, cand se construieste calculatorul
        procesor = new Processor();
        butoane = new Button[15];
        int i = 0;
        
        for(Character CurrentMarkup : markupOfButtons){
            Button newButton = new Button();
            newButton.drawOnButton(CurrentMarkup);
            butoane[i] = newButton;
        }
    }
    
     /**
      * starts the computer - displays 0 on the Screen
      */
     public void start(){
         ecran.display(0);
     }
     
     public void displayMessageOnScreen(String message){
         ecran.displayMessage(message);
     }
     
     public void pushButtonsForOperand(){
         Scanner scanner = new Scanner(System.in);
         String readIt = scanner.nextLine();
         Double operand = Double.valueOf(readIt);
         ecran.displayMessage("You introduced operand: ");
         ecran.displayMessage(readIt);
         
         if(procesor.getPrimulOperand() == null){
             procesor.setPrimulOperand(operand);
         } else {
             procesor.setAlDoileaOperand(operand);
         }
     }
     
     public void pushButtonForOperator(){
         Scanner scanner = new Scanner(System.in);
         String readIt = scanner.nextLine();
         Character operand = readIt.charAt(0);
         ecran.displayMessage("You introduced operand: ");
         ecran.displayMessage(operand.toString());
         procesor.setOperator(operand);
     }
     
     public void pushButtonEqual(){
         Double result = procesor.calculeaza();
         ecran.displayMessage(result.toString());
     }
     
}
