package Stacks;

import java.util.ArrayDeque;
import java.util.Deque;

public class ValidParenthesis {
    public static void main(String[] args) {
        String str = "(){}[]";
        boolean isValid = valid(str);
        System.out.println(isValid);
    }

    public static boolean valid(String str) {
        Deque<Character> stack = new ArrayDeque<>();
        for (char c : str.toCharArray()) {
            if (c == '(' || c == '[' || c == '{') {
                stack.push(c);
            } else if (c == ']' || c == '}' || c == ')') {
                if (stack.isEmpty()) {
                    return false;
                }
                char top = stack.pop();
                if (c == ']' && top != '[') {
                    return false;
                } else if (c == '}' && top != '{') {
                    return false;
                } else if (c == ')' && top != '(') {
                    return false;
                }
            }
        }
        return stack.isEmpty();
    }
}
