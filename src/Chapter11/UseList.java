package Chapter11;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class UseList {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner input = new Scanner(new File("mobydick.txt"));
        List<String> words = new LinkedList<>();

        while (input.hasNextLine()) {
            String word = input.nextLine();
            words.add(word);
        }

        long start = System.currentTimeMillis();
        System.out.println("Removing " + words.size() + " words.");
        while(!words.isEmpty()) {
            words.remove(0);
        }
        long end = System.currentTimeMillis();
        System.out.println("Time taken: " + (end - start) + "ms");

        System.out.println("Done.");

    }
}
