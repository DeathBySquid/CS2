public class Main {
    public static void main(String[] args) {
        Shape[] shapes = {
                new Rectangle(5, 10),
                new Triangle(4, 6),
                new Square(7),
                new Ellipse(3, 4),
                new Circle(5)
        };

        for (Shape shape : shapes) {
            shape.describe();
            if (shape instanceof Rectangle) {
                System.out.println("Area: " + ((Rectangle) shape).calculateArea());
            }
            System.out.println();
        }
//        System.out.println((Polygon)shapes[3]);
    }
}