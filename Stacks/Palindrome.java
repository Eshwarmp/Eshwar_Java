package Stacks;

import java.util.ArrayDeque;
import java.util.Deque;

public class Palindrome {
    public static void main(String[] args) {
        String str = "madam";
        boolean isPalindrome = palindrome(str);
        System.out.println(isPalindrome);
    }

    public static boolean palindrome(String str) {
        Deque<Character> stack = new ArrayDeque<>();
        for (char c : str.toCharArray()) {
            stack.push(c);
        }
        for (char c : str.toCharArray()) {
            if (c != stack.pop()) {
                return false;
            }
        }
        return true;
    }
}
