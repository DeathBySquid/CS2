package Chapter12SearchingAndSorting;

import java.util.*;

public class PlayingWithSorting {
    // return an array of n random integers
    public static int[] randomArray(int n) {
        int[] array = new int[n];
        Random random = new Random();
        for (int i = 0; i < n; i++) {
            array[i] = random.nextInt(100);
        }
        return array;
    }

    public static int binarySearch(int[] array, int target) {
        return binarySearch(array, target, 0, array.length - 1);
    }

    private static int binarySearch(int[] array, int target, int min, int max) {
        // [6, 7, 22, 28, 38, 48, 62, 80, 84, 89]
        // base case
        int mid = (min + max) / 2; // min + (max - min)/2
        if (array[mid] == target) return mid;
        if (min > max) return - mid - 1; // -(mid + 1)
        // recursive case
        if (array[mid] < target) return binarySearch(array, target, min + 1, max); // right half
        else return binarySearch(array, target, min, mid - 1); // left half
    }

    public static void bubbleSort(int[] array) {
        // {22, 7, 48, 80, 6, 89, 28, 62, 84, 38}
        for (int i = array.length - 1; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                if (array[j] > array[j + 1]) {
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }
    }

    public static void main(String[] args) {
        int[] array = randomArray(10);

        int[] array2 = {22, 7, 48, 80, 6, 89, 28, 62, 84, 38};
        System.out.println(Arrays.toString(array2));
//        for (int i = 0; i < array.length; i++) {
//            for (int j = 0; j < array.length; j++) {
//                System.out.print(i + ":" + j + " ");
//            }
//            System.out.println();
//        }
        bubbleSort(array2);
        System.out.println(Arrays.toString(array2));
        System.out.println(binarySearch(array2, 2));

        List<Integer> array3 = new ArrayList<>(List.of(22, 7, 48, 80, 6, 89, 28, 62, 84, 38));
        Collections.shuffle(array3);
        System.out.println(array3);
        Collections.sort(array3);
        System.out.println(array3);
    }

}
