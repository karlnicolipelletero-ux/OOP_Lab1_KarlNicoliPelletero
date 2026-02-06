
package mainclass1;


public class GeometricOperation extends MathOperation {
    
    public boolean Validity(double dimension){
        if(dimension < 0){
            System.out.println("Error: Dimensions cannot be negative");
            return false;
        }
        return true;
    }
    
}
