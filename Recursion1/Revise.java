package Recursion1;

public class Revise {
    public static void main(String[] args) {
        int n = 5;
        for (int i = 0; i <= n; i++) {
            int ans = fibonacci(i);
            System.out.print(ans + " ");
        }
        System.out.println();
        System.out.println("Factorial of " + n + " is " + factorial(n));
    }

    public static int factorial(int n) {
        if (n == 0) {
            return 1;
        }
        return n * factorial(n - 1);
    }

    public static int fibonacci(int n) {
        if (n < 2) {
            return n;
        }
        return fibonacci(n - 1) + fibonacci(n - 2);
    }
}
