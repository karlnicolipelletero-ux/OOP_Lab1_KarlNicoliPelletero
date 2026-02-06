package mainclass1;

public class ArithmeticOperation extends MathOperation {

    private double operand1;
    private double operand2;

    public ArithmeticOperation(double operand1, double operand2) {

        this.operand1 = operand1;
        this.operand2 = operand2;

    }
    
    public double getOperand1(){
        return this.operand1;
    }
    
    public double getOperand2(){
        return this.operand2;
    }
    
}
