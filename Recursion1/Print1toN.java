package Recursion1;

public class Print1toN {
    public static void main(String[] args) {
        // Two methods of printing numbers from 1 to N
        print(1);
        System.out.println();
        print1(5);
    }
    
    public static void print(int n) {
        if (n == 6) {
            return;
        }
        System.out.print(n + " ");
        print(n + 1);
    }
    
    public static void print1(int n) {
        if (n == 0) {
            return;
        }
        print1(n - 1);
        System.out.print(n + " ");
    }
}
