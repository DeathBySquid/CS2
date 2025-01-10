import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CSBS2 {

    public static int countInRange(ArrayList<Integer> v, int min, int max) {
        int count = 0;
        for (int i = 0; i < v.size(); i++) {
            if (v.get(i) >= min && v.get(i) <= max) {
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
//        ArrayList<Integer> list = new ArrayList<>(List.of(28, 1, 17, 4, 41, 9, 59, 8, 31, 30, 25));
        ArrayList<Integer> list = new ArrayList<>();
        int[] arr = {28, 1, 17, 4, 41, 9, 59, 8, 31, 30, 25};
        for (int n : arr) list.add(n);
        System.out.println(list);
    }
}
