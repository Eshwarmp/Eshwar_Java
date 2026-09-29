package Stacks;

import java.util.ArrayDeque;
import java.util.Deque;

public class BottomElement {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5 };
        Deque<Integer> stack = new ArrayDeque<>();
        for (int x : arr) {
            stack.push(x);
        }
        // int size = stack.size();
        while (!stack.isEmpty()) {
            if (stack.size() == 1) {
                System.out.println("Bottom Element : " + stack.pop());
            } else {
                stack.pop();
            }
        }
        printSecondTop();
    }
    
    public static void printSecondTop() {
        int[] arr = { 1, 2, 3, 4, 5 };
        Deque<Integer> print = new ArrayDeque<>();
        for (int x : arr) {
            print.push(x);
        }
        print.pop();
        System.out.println("Second Top element : " + print.peek());
    }
}
