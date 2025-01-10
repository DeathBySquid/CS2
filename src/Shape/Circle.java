public class Circle extends Ellipse {

    @Override // optional
    public double perimeter() {
        return 2*Math.PI*a;
    }

    public double getRadius() {
        return a;
    }

    public Circle(double radius) {
        super(radius, radius);
    }
}
