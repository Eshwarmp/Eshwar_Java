package Stacks;

import java.util.*;

public class SumOfElements {
    public static void main(String[] args) {
        Deque<Integer> stack = new ArrayDeque<>();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        stack.push(5);
        int sum = 0;
        while (!stack.isEmpty()) {
            sum += stack.pop();
        }
        System.out.println(sum);

        // Find the maximum
        Deque<Integer> s = new ArrayDeque<>();
        s.push(10);
        s.push(40);
        s.push(30);
        s.push(20);
        int max = Integer.MIN_VALUE;
        for (int x : s) {
            if (x > max) {
                max = x;
            }
        }
        System.out.println(max);

        // Reverse an array
        int[] arr = { 1, 2, 3, 4, 5 };
        Deque<Integer> reversedArray = new ArrayDeque<>();
        for (int x : arr) {
            reversedArray.push(x);
        }
        System.out.println(reversedArray);

        // Push and Pop repeatedly until empty
        Deque<Integer> push = new ArrayDeque<>();
        for (int i = 1; i < 8; i++) {
            push.push(i);
        }
        while (!push.isEmpty()) {
            System.out.print(push.pop() + " ");
        }
        System.out.println();

        Deque<Integer> logic = new ArrayDeque<>();
        logic.push(10);
        logic.push(20);
        logic.push(30);
        logic.push(40);
        logic.push(50);
        logic.pop();
        logic.pop();
        logic.push(100);
        System.out.println(logic.peek());
        System.out.println(logic);
    }
}
