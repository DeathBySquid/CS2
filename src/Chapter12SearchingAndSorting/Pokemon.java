package Chapter12SearchingAndSorting;

public class Pokemon implements Comparable<Pokemon> {
    int id;
    String name;
    String color;
    int height;
    int evolutionStage;

    public int compareTo(Pokemon other) {
        return this.name.compareTo(other.name);
    }

    public Pokemon(int id, String name, String color, int height, int evolutionStage) {
        this.id = id;
        this.name = name;
        this.color = color;
        this.height = height;
        this.evolutionStage = evolutionStage;

    }
}
