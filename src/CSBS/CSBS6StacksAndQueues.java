package CSBS;

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Stack;

public class CSBS6StacksAndQueues {
    public static void stutter(Queue<Integer> q) {
        int size = q.size();
        for (int i = 0; i < size; i++) {
            int temp = q.remove();
            q.add(temp);
            q.add(temp);
        }
    }

    public static void flipHalf(Queue<Integer> q) {
        int size = q.size();
        Stack<Integer> stack = new Stack<>();
        for (int i = 0; i < size; i++) {
            if (i%2==0) q.add(q.remove());
            else stack.push(q.remove());
        }
        while (!stack.isEmpty()) {
            q.add(q.remove());
            q.add(stack.pop());
        }
        if (size%2==1) q.add(q.remove());
    }

    public static void main(String[] args) {
        Queue<Integer> q = new LinkedList<>(List.of(1, 2, 3));
//        q.add(1);
//        q.add(2);
//        q.add(3);
        System.out.println(q);
        stutter(q);
        System.out.println(q);
    }
}
