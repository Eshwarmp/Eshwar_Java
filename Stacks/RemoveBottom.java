package Stacks;

import java.util.ArrayDeque;
import java.util.Deque;

public class RemoveBottom {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5 };
        Deque<Integer> stack = new ArrayDeque<>();
        for (int x : arr) {
            stack.push(x);
        }
        Deque<Integer> temp = new ArrayDeque<>();
        while (stack.size() > 1) {
            temp.push(stack.pop());
        }
        stack.pop();
        System.out.println("Stack before : " + stack);
        System.out.println("Temp before : " + temp);
        while (!temp.isEmpty()) {
            stack.push(temp.pop());
        }
        System.out.println("Stack after: " + stack);
        System.out.println("Temp after: " + temp);
    }
}
