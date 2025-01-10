package Shape;
public class Triangle extends Polygon{
    private double base;
    private double height;

    public double area() {
        return 0.5 * base * height;
    }

    public double perimeter() {
        return base + base + height;
    }

    public Triangle(double base, double height) {
        super(3); // A triangle always has 3 sides
        this.base = base;
        this.height = height;
    }

    public double calculateArea() {
        return 0.5 * base * height;
    }

    @Override
    public void describe() {
        System.out.println("I am a triangle with base " + base + " and height " + height + ".");
    }
}
