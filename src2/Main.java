public class Main {
    public static void main(String[] args) {
        Polygon[] shapes = {
                new Rectangle(5, 10),
                new Triangle(4, 6),
                new Square(7)
        };

        for (Polygon shape : shapes) {
            shape.describe();
            if (shape instanceof Rectangle) {
                System.out.println("Area: " + ((Rectangle) shape).calculateArea());
            }
            System.out.println();
        }
    }
}
