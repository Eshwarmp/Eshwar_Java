package Stacks;

import java.util.ArrayDeque;
import java.util.Deque;

public class ReverseString {
    public static void main(String[] args) {
        String name = "hello";
        Deque<Character> reverse = new ArrayDeque<>();
        for (char c : name.toCharArray()) {
            reverse.push(c);
        }
        for (char c : reverse) {
            System.out.print(c);
        }
        System.out.println();
        while (!reverse.isEmpty()) {
            System.out.print(reverse.pop() + "");
        }
    }
}
