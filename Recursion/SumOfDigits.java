package Recursion;

public class SumOfDigits {
    public static void main(String[] args) {
        int n = 1234;
        int sum = 0;
        while (n > 0) {
            int digit = n % 10;
            sum += digit;
            n /= 10;
        }
        System.out.println(sum);
        int ans = sumDigits(1234);
        System.out.println(ans);
    }

    public static int sumDigits(int n) {
        if (n >=1) {
            int digit = n % 10;
            return digit + sumDigits(n/10);
        }
        return 0;
    }
}
