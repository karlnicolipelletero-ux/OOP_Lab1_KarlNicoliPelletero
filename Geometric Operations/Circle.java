package mainclass1;

public class Circle extends GeometricOperation {

    private double radius;

    public Circle(double radius) {
        setRadius(radius);
    }

    public void setRadius(double radius) {
        if (Validity(radius)) {
            this.radius = radius;
        } else {
            this.radius = 0;
        }
    }

    @Override
    public void calculate() {
        double Area = Math.PI * Math.pow(radius, 2);
        setResult(Area);
    }

    public void calculateCircumference() {
        double Circumference = 2 * Math.PI * radius;
        setResult(Circumference);
    }

}
