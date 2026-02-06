
package mainclass1;


public class Subtraction extends ArithmeticOperation {
    
    public Subtraction(double operand1, double operand2){
       super(operand1,operand2);
      
       
    }
    
    public void calculate(){
        
        double Difference = getOperand1() - getOperand2();
        
        setResult(Difference);
        
    }
    
}
