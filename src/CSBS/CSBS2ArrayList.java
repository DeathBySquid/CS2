package CSBS;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class CSBS2ArrayList {

    public static int countInRange(ArrayList<Integer> v, int min, int max) {
        int count = 0;
        for (int i = 0; i < v.size(); i++) {
            if (v.get(i) >= min && v.get(i) <= max) {
                count++;
            }
        }
        return count;
    }
    public static LinkedList<Integer> getDigits(int n) {
        LinkedList<Integer> digits = new LinkedList<>();
        // Handle single digit case
        if (n < 10) {
            digits.add(n);
            return digits;
        }
        // Convert number to digits using ArrayList
        while (n > 0) {
            digits.add(0, n % 10);  // add(int index, E element)
            n /= 10;
        }
        return digits;
    }
    public static List<Integer> keithSequence(int n) {
        List<Integer> sequence = getDigits(n);
//        System.out.println(sequence);
        int numOfDigits = sequence.size();
        while (sequence.get(sequence.size() - 1) < n) {
            int next = 0;
            for (int i = 0; i < numOfDigits; i++) {
                next += sequence.get(sequence.size() - 1 - i);
            }
            sequence.add(next);
//            System.out.println(sequence);
        }
        return sequence;
    }
    public static boolean isKeithNumber(int n) {
         return keithSequence(n).get(keithSequence(n).size() - 1) == n;
    }
    public static void findKeithNumbers(int min, int max) {
        for (int n = min; n <= max; n++) {
            List<Integer> sequence = keithSequence(n);
            if (sequence.get(sequence.size() - 1) == n) {
                System.out.println(n + ": " + sequence);
            }
        }
    }
    public static void removeAll(ArrayList<String> list, String s) {
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).equals(s)) {
                list.remove(i);
                i--;
            }
        }
    }

    public static void main(String[] args) {
//        ArrayList<Integer> list = new ArrayList<>(List.of(28, 1, 17, 4, 41, 9, 59, 8, 31, 30, 25));
        ArrayList<Integer> list = new ArrayList<>();
        int[] arr = {28, 1, 17, 4, 41, 9, 59, 8, 31, 30, 25};
        for (int n : arr) list.add(n);
        System.out.println(list);
        System.out.println(isKeithNumber(7385));
        findKeithNumbers(47, 742);
        ArrayList<String> list1 = new ArrayList<>(List.of("a", "b", "c", "b", "b", "a", "b"));
        System.out.println(list1);
        list1.remove("b");
//        removeAll(list1, "b");
        System.out.println(list1);
    }
}
