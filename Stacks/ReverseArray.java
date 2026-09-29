package Stacks;

import java.util.ArrayDeque;
import java.util.Deque;

public class ReverseArray {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5 };
        Deque<Integer> stack = new ArrayDeque<>();
        for (int x : arr) {
            stack.push(x);
        }
        while (!stack.isEmpty()) {
            System.out.print(stack.pop() + " ");
        }
        System.out.println();

        Deque<Integer> max = new ArrayDeque<>();
        max.push(10);
        max.push(25);
        max.push(5);
        max.push(40);
        max.push(15);
        int maximum = Integer.MIN_VALUE;
        while (!max.isEmpty()) {
            int x = max.pop();
            if (x > maximum) {
                maximum = x;
            }
        }
        System.out.println(maximum);

        int minimum = Integer.MAX_VALUE;
        Deque<Integer> min = new ArrayDeque<>();
        int[] mini = { 10, 25, 5, 40, 15 };
        for (int x : mini) {
            min.push(x);
        }
        while (!min.isEmpty()) {
            int x = min.pop();
            if (x < minimum) {
                minimum = x;
            }
        }
        System.out.println(minimum);

        int[] sum = { 10, 20, 30, 40, 50 };
        int add = 0;
        
        Deque<Integer> summation = new ArrayDeque<>();
        for (int x : sum) {
            summation.push(x);
        }
        int size = summation.size();
        while (!summation.isEmpty()) {
            int x = summation.pop();
            add += x;
        }
        System.out.println("Sum is " + add);
        System.out.println("Average is " + add / size);

        Deque<Integer> print = new ArrayDeque<>();
        print.push(1);
        print.push(2);
        print.push(3);
        print.push(4);
        print.push(5);
        System.out.println(print);
        for (int i = 1; i <= 2; i++) {
            print.pop();
        }
        System.out.println(print);

        // Push only even number and pop them
        int[] even = { 1, 2, 3, 4, 5, 6 };
        Deque<Integer> evenNumbers = new ArrayDeque<>();
        for (int x : even) {
            if (x % 2 == 0) {
                evenNumbers.push(x);
            }
        }
        System.out.println("Only even numbers: "  + evenNumbers);
    }
}
