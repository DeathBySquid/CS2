package Chapter12SearchingAndSorting;

import java.awt.*;

public class PokemonTester {
    public static void main(String[] args) {
        int width = 500, height = 500;
        DrawingPanel panel = new DrawingPanel(width, height);
        Graphics g = panel.getGraphics();

        PokeDex pokeDex = new PokeDex();
        System.out.println(pokeDex);

        String filename = "sugimori/" + pokeDex.remove().id + ".png";
        Image image = panel.loadImage(filename);
        g.drawImage(image, 0, 0, width, height, panel);

        System.out.println(pokeDex);
        pokeDex.sort();
        System.out.println(pokeDex);

    }
}
