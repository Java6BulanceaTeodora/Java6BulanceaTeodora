/*
 *Processing the operations
 */
package calculator;

/**
 *Memorized theintroduced operands and operators and at the end computes the results
 * @author bulan
 */
public class Processor {
    private Double primulOperand;
    private Double alDoileaOperand;
    private Double rezultat;
    private Character operator;

    public Double getPrimulOperand() {
        return primulOperand;
    }

    public void setPrimulOperand(Double primulOperand) {
        this.primulOperand = primulOperand;
    }

    public Double getAlDoileaOperand() {
        return alDoileaOperand;
    }

    public void setAlDoileaOperand(Double alDoileaOperand) {
        this.alDoileaOperand = alDoileaOperand;
    }

    public Double getRezultat() {
        return rezultat;
    }

    public void setRezultat(Double rezultat) {
        this.rezultat = rezultat;
    }

    public Character getOperator() {
        return operator;
    }

    public void setOperator(Character operator) {
        this.operator = operator;
    }
    
     /**
    * Methods adds 2 digits introduced by the user from keyboard
    */
    private Double add(){
        rezultat = primulOperand + alDoileaOperand;
        return rezultat;
    }
    
    /**
      * Methods substracts 2 digits introduced by the user
      */
    private Double decrease(){
        rezultat = primulOperand - alDoileaOperand;
        return rezultat;
    }
    
    /**
      * Multiply two numbers introduced by the user
      */
    private Double multiply(){
        rezultat = primulOperand * alDoileaOperand;
        return rezultat;
    }
    
    /**
      * Divide two numbers by the user
      */
    private Double divide(){
        rezultat = primulOperand / alDoileaOperand;
        return rezultat;
    }
    
    public Double calculeaza(){
        switch(operator){
            
            case '+':
                add();
            break;
            
            case '-':
                decrease();
            break;
            
            case '*':
                multiply();
            break;
            
            case '/':
                divide();
            break;
        }
        return rezultat;
    }
}
