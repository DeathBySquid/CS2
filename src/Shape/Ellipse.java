import java.sql.SQLOutput;

public class Ellipse implements Shape {
    double a; // semi-major axis
    double b; // semi-minor axis

    public double area() {
        return Math.PI*a*b;
    }

    public double perimeter() {
        double h = Math.pow(a - b, 2)/Math.pow(a + b, 2);
        return Math.PI*(a + b)*(1 + 3*h/(10 + Math.sqrt(4 - 3*h)));
    }

    @Override
    public void describe() {
        System.out.println("I am an ellipse with semi-major axis " + a + " and semi-minor axis " + b + ".");
    }

    public Ellipse(double a,double b) {
        this.a = a;
        this.b = b;
    }
}
