package mainclass1;

public class OddOrEven extends NumberAnalysis {

    public OddOrEven(int number) {
        super(number);
    }
    
    @Override
    public void calculate(){
        
        int n = getNumber();
        
        if(n % 2 ==0){
            setResult(1.0);
    } else {
            setResult(0.0);
        }
        
    }

}
