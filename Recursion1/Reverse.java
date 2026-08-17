package Recursion1;

public class Reverse {
    static int rev = 0;
    public static void main(String[] args) {
        int n = 1234;
        int reversed = reverse(1234);
        System.out.println(reversed);
        reverseRecur(n);
        System.out.println(rev);
    }
    
    public static int reverse(int n) {
        int rev = 0;
        while (n > 0) {
            int digit = n % 10;
            rev = rev * 10 + digit;
            n /= 10;
        }
        return rev;
    }

    public static void reverseRecur(int n) {
        if(n == 0){
            return;
        }
        int digit = n % 10;
        rev = rev * 10 + digit;
        reverseRecur(n / 10);
    }
}
