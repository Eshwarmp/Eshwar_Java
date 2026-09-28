package Stacks;

import java.util.Stack;

public class ImplementStack {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        stack.push(5);
        stack.push(6);
        System.out.println(stack);
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack);

        // Implementing stack using array
        MyStack stack1 = new MyStack(5);
        stack1.push(1);
        stack1.push(2);
        stack1.push(4);
        stack1.push(4);
        stack1.printElements();
        System.out.println(stack1.pop());
        System.out.println(stack1.peek());
        System.out.println(stack1.isEmpty());

    }
}
