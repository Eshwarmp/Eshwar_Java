package Stacks;

// import java.lang.reflect.Array;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Stack;

public class BasicProgram {
    public static void main(String[] args) {
        // Problem 1 — Push and Print
        // Stack class extends legacy vector class, which also inherits the unnecessary methods
        // like get(), remove() etc which doesn't shows the behavior of stack
        Stack<Integer> s = new Stack<>();
        s.push(2);
        s.push(2);
        s.push(5);
        System.out.println(s);
        Deque<Integer> stack = new ArrayDeque<>();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        stack.push(5);
        System.out.println(stack);
        System.out.println("The top element of the Stack is " + stack.peek());
        System.out.println("Remove the top element from the Stack " + stack.pop());
        System.out.println("Check emptiness of the Stack: " + stack.isEmpty());
        System.out.println("The size of the Stack is: " + stack.size());
        System.out.println("Simple Traveral over the Stack ");
        for (int x : stack) {
            System.out.print(x + " ");
        }
        System.out.println();

        // Print every element while removing it.
        System.out.println("Print every element while removing it.");
        while (!stack.isEmpty()) {
            System.out.print(stack.pop() + " ");
        }
        System.out.println();
        System.out.println(stack);

        // Push numbers 1 to 5 into a stack and then remove all of them.
        System.out.println("Push numbers 1 to 5 into a stack and then remove all of them.");
        for (int i = 1; i < 6; i++) {
            stack.push(i);
        }
        System.out.println(stack);
        while (!stack.isEmpty()) {
            System.out.print(stack.pop() + " ");
        }
        System.out.println();
        // Reverse Numbers Using a Stack
        System.out.println("Reverse Numbers Using a Stack");
        int[] arr = {  1 ,  2,  3 , 4, 5 };
        Deque<Integer> stacks = new ArrayDeque<>();
        for (int x : arr) {
            stacks.push(x);
        }
        System.out.println(stacks);
        // Removing the from the stack while printing
        while (!stacks.isEmpty()) {
            System.out.print(stacks.pop() + " ");
        }
    }
}
