public abstract class Polygon implements Shape {
    private int sides;

    public abstract double area();
    public abstract double perimeter();
    public Polygon(int sides) {
        this.sides = sides;
    }

    public int getSides() {
        return sides;
    }

    public void describe() {
        System.out.println("I am a polygon with " + sides + " sides.");
    }
}
