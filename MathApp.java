package mainclass1;

public class MathApp {

    public static void main(String[] args) {

        //Problem 1:///////////////////////////////////////////////////////////
        MathOperation A = new Addition(10, 5);
        MathOperation S = new Subtraction(10, 5);
        MathOperation M = new Multiplication(10, 5);
        MathOperation D = new Division(10, 0);

        A.calculate();
        S.calculate();
        M.calculate();
        D.calculate();

        System.out.println("Addition Answer: " + A.getResult());
        System.out.println("Subtraction Answer: " + S.getResult());
        System.out.println("Multiplication Answer: " + M.getResult());
        System.out.println("Division Answer: " + D.getResult());

        System.out.println("");
        System.out.println("");

        //Problem 2:///////////////////////////////////////////////////////////
        MathOperation C = new Circle(-4);
        MathOperation R = new Rectangle(4, 3);
        Circle circ = new Circle(4);
        Rectangle rect = new Rectangle(4, 3);

        C.calculate();
        R.calculate();
        circ.calculateCircumference();
        rect.calculatePerimeter();

        System.out.println("Area: " + C.getResult());
        System.out.println("Area: " + R.getResult());
        System.out.println("Circumference: " + circ.getResult());
        System.out.println("Perimeter: " + rect.getResult());

        System.out.println("");
        System.out.println("");

        //Problem 3:///////////////////////////////////////////////////////////
        PrimeNumberCheck P = new PrimeNumberCheck(-2);
        FactorialComputation F = new FactorialComputation(0);
        OddOrEven OE = new OddOrEven(5);

        P.calculate();
        F.calculate();
        OE.calculate();

        //Prime Number Check
        if (P.getResult() == 1.0) {
            System.out.println(P.getNumber() + " is a Prime number");
        } else {
            System.out.println(P.getNumber() + " is not a Prime number");
        }

        //Factorial Computation
        System.out.println("Factorial: " + F.getResult());

        //Odd and Even Determination
        if (OE.getResult() == 1.0) {
            System.out.println(OE.getNumber() + " is an Even Number");
        } else {
            System.out.println(OE.getNumber() + " is an Odd Number");
        }

        /*    
        Justification:
        
        Inheritance is the optimal design for the Core Math Library because it eliminates code duplication by defining shared attributes
        and validation logic once in parent classes (like MathOperation and ArithmeticOperation) rather than repeating them in every child
        class. It enforces a consistent structure by requiring all operations to implement the same calculate() interface, ensuring that the
        main program interacts with every tool uniformly. In other words, it is extensible, and provides a conventional, cohesive way of coding.
         */
    }

}
