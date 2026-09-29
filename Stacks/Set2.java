package Stacks;

import java.util.ArrayDeque;
import java.util.Deque;

public class Set2 {
    public static void main(String[] args) {
        Deque<Integer> stack = new ArrayDeque<>();
        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.push(40);
        stack.push(50);
        boolean found = false;
        for (int x : stack) {
            if (x == 30) {
                found = true;
                break;
            }
        }
        if (found) {
            System.out.println("Found");
        }
        else {
            System.out.println("Not found");
        }
        int count = count();
        System.out.println(count);
    }

    public static int count() {
        int[] arr = { 10, 20, 10, 30, 10, 40 };
        Deque<Integer> stack = new ArrayDeque<>();
        for (int x : arr) {
            stack.push(x);
        }
        int count = 0;
        for (int x : stack) {
            if (x == 10) {
                count++;
            }
        }
        return (count);
    }
}
