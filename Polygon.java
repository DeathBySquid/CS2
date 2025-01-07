public class Polygon {
    private int sides;

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
