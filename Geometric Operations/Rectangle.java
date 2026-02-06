
package mainclass1;


public class Rectangle extends GeometricOperation {
    private double length;
    private double width;
    
    public Rectangle(double length, double width){
        setDimension(length,width);
    }
    
    public void setDimension(double length,double width){
        if (Validity(length) && Validity(width)){
            this.length=length;
            this.width=width;
        }else{
            this.length=0;
            this.width=0;
        }
    }
    
    @Override
    public void calculate(){
        double Area = length*width;
        setResult(Area);
    }
    
    public void  calculatePerimeter(){
        double Perimeter = 2*length + 2*width;
        setResult(Perimeter);
    }
    
}
