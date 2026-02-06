package mainclass1;

public class Division extends ArithmeticOperation {

    public Division(double operand1, double operand2) {
        super(operand1, operand2);

    }

    public void calculate() {

        if (getOperand2() == 0) {
            System.out.println("Error: Undefined");
            

        } else {

            double Quotient = getOperand1() / getOperand2();
            setResult(Quotient);
        }

    }

}
