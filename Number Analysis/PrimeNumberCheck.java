package mainclass1;

public class PrimeNumberCheck extends NumberAnalysis{
    public PrimeNumberCheck(int number){
        super(number);
    }
    
    @Override
    public void calculate(){
        int n = getNumber();
        boolean Prime = true;
        
        if(n<=1){
            Prime = false;
        }else {
            for(int i = 2; i <= Math.sqrt(n); i++){
                if(n % i == 0){
                    Prime = false;
                    break;
                }
            }
        }
        
        
        if(Prime){
            setResult(1.0);
        }else {
            setResult(0.0);
        }
        
    }
}
