
public class Hanoi {
    public static void hanoi(int disk, int start, int end) {
        // base case
        if (disk == 1) System.out.println("move disk " + disk + " from peg " + start + " to peg " + end);
        else { // recursive case
            // 1 + 2 + 3 = 6... start + end + other = 6  -> other = 6 - start - end
            int other = 6 - start - end;
            hanoi(disk - 1, start, other);
            System.out.println("move disk " + disk + " from peg " + start + " to peg " + end);
            hanoi(disk - 1, other, end);
        }
    }

    // return the nth fibonacci number
    public static int fibonacci(int n) {
        // base cases
        if (n == 0) return 0;
        if (n == 1) return 1;
        return fibonacci(n - 1) + fibonacci(n - 2);
    }

    public static int fibonacci2(int n, int pprev, int prev) {
        if (n == 0) return pprev;
        return fibonacci2(n - 1, prev, pprev + prev);
    }

    public static void main(String[] args) {
//        hanoi(3, 1, 3);
//        System.out.println(fibonacci2(3, 0, 1));

    }

}
