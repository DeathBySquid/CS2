public class Rectangle extends Polygon{
    private double length;
    private double width;

    public Rectangle(double length, double width) {
        super(4); // A rectangle always has 4 sides
        this.length = length;
        this.width = width;
    }

    public double calculateArea() {
        return length * width;
    }

    @Override
    public void describe() {
        System.out.println("I am a rectangle with length " + length + " and width " + width + ".");
    }
}
