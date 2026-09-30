package Stacks;

import java.util.ArrayDeque;
import java.util.Deque;

public class RemoveAdjacents {
    public static void main(String[] args) {
        String str = "azxxzy";
        Deque<Character> stack = new ArrayDeque<>();
        for (char c : str.toCharArray()) {
            if (stack.isEmpty()) {
                stack.push(c);
            }
            else if (c != stack.peek()) {
                stack.push(c);
            } else {
                stack.pop();
            }
        }
        System.out.println(stack);
        Deque<Character> store = new ArrayDeque<>();
        for (char c : stack) {
            store.push(c);
        }
        String result = "";
        while (!store.isEmpty()) {
            result += store.pop();
        }
        System.out.println(result);
    }
}
