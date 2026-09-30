package Stacks;

import java.util.ArrayDeque;
import java.util.Deque;

public class CopyStack {
    public static void main(String[] args) {
        int[] arr = { 10, 20, 30, 40, 50 };
        Deque<Integer> stack = new ArrayDeque<>();
        for (int x : arr) {
            stack.push(x);
        }
        System.out.println("Original: " + stack);
        Deque<Integer> temp = new ArrayDeque<>();
        for (int x : stack) {
            temp.push(x);
        }
        // System.out.println("Temporary : " + temp);
        Deque<Integer> duplicate = new ArrayDeque<>();
        while (!temp.isEmpty()) {
            duplicate.push(temp.pop());
        }
        System.out.println("Duplicate : "+ duplicate);
    }
}
