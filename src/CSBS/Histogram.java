package CSBS;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.function.IntUnaryOperator;

// https://www.codestepbystep.com/r/problem/view/java/collections/arraylist/Histogram
public class Histogram {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner fileScanner = new Scanner(new File("midtermscores.txt"));
        Map<Character, Integer> bins = new HashMap<Character, Integer>();
        bins.put('A', 0);
        bins.put('B', 0);
        bins.put('C', 0);
        bins.put('D', 0);
        bins.put('F', 0);

        System.out.println(bins);


        while (fileScanner.hasNextInt()) {
            int score = fileScanner.nextInt();
            if (score < 60) {
                // increment the F counter (key)
                int oldFreq = bins.get('F');
                int newFreq = oldFreq + 1;
                bins.put('F', newFreq);
            } else if (score < 70) {
                int oldFreq = bins.get('D');
                int newFreq = oldFreq + 1;
                bins.put('D', newFreq);
            } else if (score < 80) {
                bins.put('C', bins.get('C') + 1);
            } else if (score < 90) {
                bins.put('B', bins.get('B') + 1);
            } else {
                bins.put('A', bins.get('A') + 1);
            }
        }

        System.out.println(bins);
    }
}
