package mainclass1;

public class FactorialComputation extends NumberAnalysis{
    public FactorialComputation(int number){
        super(number);
    }

    @Override
    public void calculate(){
        int n = getNumber();
        
        if (n<0){
            System.out.println("Error: Cannot calculate the Factorial of Negative Numbers");
            setResult(0.0);
            return;
        }
        
        if (n == 0){
            setResult(1.0);
            return;
        }
        
        double Factorial = 1;
        
        for(int i =1; i <= n; i++){
            Factorial = Factorial * i;
        }
        
        setResult(Factorial);
        
    }
    
}
