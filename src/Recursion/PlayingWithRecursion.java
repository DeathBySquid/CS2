package Recursion;

public class PlayingWithRecursion {

    // https://www.codestepbystep.com/r/problem/view/java/bjp5/chapter12/e2-writeNums
    public static void writeNumbers(int n) {
        // 1, 2, 3, 4, 5, 6, 7, 8, 9, 10
        // 10, 9, 8, 7, 6, 5, 4, 3, 2, 1
        if (n == 1) System.out.print(1); // base case
        else { // recursive case
            System.out.print(n + ", ");
            writeNumbers(n - 1);
            System.out.print(", " + n);
        }
    }

    // https://www.codestepbystep.com/r/problem/view/java/bjp5/chapter12/e3-writeSequence
    public static void writeSequence(int n) {
        if (n < 1) throw new IllegalArgumentException();
        if (n == 1) System.out.print("1");
        else if (n == 2) System.out.print("1 1");
        else {
            int numToPrint = (n + 1)/2;
            System.out.print(numToPrint + " ");
            writeSequence(n - 2);
            System.out.print(" " + numToPrint);
        }
    }

    public static void main(String[] args) {
//        writeNumbers(3);
//        System.out.println();
        writeSequence(3);
        System.out.println();
        writeSequence(4);
    }

}
