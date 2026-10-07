package Stacks;

import java.util.ArrayDeque;
import java.util.Deque;

public class RPN {
    public static void main(String[] args) {
        // Given a string array tokens representing an arithmetic expression in Reverse Polish Notation (RPN), 
        // evaluate the expression and return the result.
        String[] tokens = { "4", "13", "5", "/", "+" };
        Deque<Integer> stack = new ArrayDeque<>();
        for (String token : tokens) {
            if (token.equals("+")) {
                int a = stack.pop();
                int b = stack.pop();
                stack.push(b + a);
            } else if (token.equals("-")) {
                int a = stack.pop();
                int b = stack.pop();
                stack.push(b - a);
            } else if (token.equals("*")) {
                int a = stack.pop();
                int b = stack.pop();
                stack.push(b * a);
            } else if (token.equals("/")) {
                int a = stack.pop();
                int b = stack.pop();
                stack.push(b / a);
            } else {
                stack.push(Integer.parseInt(token));
            }
        }
        System.out.println(stack.peek());
    }
}
