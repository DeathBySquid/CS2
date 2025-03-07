package ArrayIntList;

import java.util.*;

public class ArrayListIntegerRemove {
    public static void main(String... args) {
		ArrayList<Integer> list = new ArrayList<>(Arrays.asList(2, 7, 1, 8, 2, 8));

		System.out.println(list);
		list.remove((Integer)1);
		System.out.println(list);
    }
}
