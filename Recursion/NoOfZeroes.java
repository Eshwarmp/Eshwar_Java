package Recursion;

public class NoOfZeroes {
    public static void main(String[] args) {
        int num = 1001200;
        int count = 0;
        while (num > 0) {
            int digit = num % 10;
            if (digit == 0) {
                count++;
            }
            num /= 10;
        }
        System.out.println(count);
        int a = 100120;
        if (a == 0) {
            System.out.println(1);
        }
        else {
            int ans = zero(a);
            System.out.println(ans);
        }
    }

    public static int zero(int n) {
        if (n == 0) {
            return 0;
        }
        int digit = n % 10;
        if (digit == 0) {
            return 1 + zero(n / 10);
        }
        return zero(n/10);
    }
}
