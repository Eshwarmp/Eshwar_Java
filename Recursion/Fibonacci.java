package Recursion;

public class Fibonacci {
    public static void main(String[] args) {
        int n = 4;
        for (int i = 0; i <= n; i++) {
            int ans = fibo(i);
            System.out.print(ans + " ");
        }
    }

    public static int fibo(int n) {
        if (n < 2) {
            return n;
        }
        return fibo(n - 1) + fibo(n - 2);
    }
}
