package mainclass1;

public class Multiplication extends ArithmeticOperation {
    
     public Multiplication(double operand1, double operand2){
        super(operand1,operand2);
        
     
        
     }
     
     public void calculate(){
         
         double Product = getOperand1() * getOperand2();
         
         setResult(Product);
         
     }
     
}
