package Stacks;

import java.util.ArrayDeque;
import java.util.Deque;

public class RemoveAllOccurances {
    public static void main(String[] args) {
        Deque<Integer> stack = new ArrayDeque<>();
        stack.push(10);
        stack.push(20);
        stack.push(10);
        stack.push(30);
        stack.push(10);
        stack.push(40);
        System.out.println(stack);
        Deque<Integer> temp = new ArrayDeque<>();
        for (int x : stack) {
            if (x != 10) {
                temp.push(x);
            }
        }
        System.out.println(temp);
        System.out.println(stack);
        Deque<Integer> result = new ArrayDeque<>();
        for (int x : temp) {
            result.push(x);
        }
        System.out.println(result);
    }
}
