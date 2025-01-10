package Shape;

public class Square extends Rectangle{
    public Square(double side) {
        super(side, side); // A square has equal length and width
    }

    @Override
    public void describe() {
        System.out.println("I am a square with area " + super.calculateArea() + ".");
    }
}
