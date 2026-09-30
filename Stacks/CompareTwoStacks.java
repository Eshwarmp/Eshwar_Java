package Stacks;

import java.util.ArrayDeque;
import java.util.Deque;

public class CompareTwoStacks {
    public static void main(String[] args) {
        int[] arr = { 10, 20, 30 };
        Deque<Integer> a = new ArrayDeque<>();
        Deque<Integer> b = new ArrayDeque<>();
        for (int x : arr) {
            a.push(x);
            b.push(x);
        }
        System.out.println(a);
        System.out.println(b);
        if (a.size() != b.size()) {
            System.out.println("Not equal");
            return;
        }
        Deque<Integer> duplicateB = new ArrayDeque<>();
        for (int x : b) {
            duplicateB.push(x);
        }
        for (int x : a) {
            if (x != b.pop()) {
                System.out.println("Not equal");
                return;
            }
        }
        System.out.println("equal");
        for (int x : duplicateB) {
            b.push(x);
        }
        System.out.println(a);
        System.out.println(b);
    }
}
