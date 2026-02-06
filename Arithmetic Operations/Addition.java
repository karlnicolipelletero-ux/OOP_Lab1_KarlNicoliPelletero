
package mainclass1;

public class Addition extends ArithmeticOperation{
    
    public Addition(double operand1, double operand2){
        super(operand1,operand2);
        
        
        
    }
    @Override
    public void calculate(){
        
        double Sum = getOperand1()+getOperand2();
        
        setResult(Sum);
    }
    
}
