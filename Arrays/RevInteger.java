package Arrays;

public class RevInteger {
    public static void main(String[] args) {
        int a = -123;
        int rev = 0;
        while (a != 0) {
            int digit = a % 10;
            if (rev > Integer.MAX_VALUE && (rev == Integer.MAX_VALUE && digit > 7)) {
                System.out.println(0);
            }
            if(rev < Integer.MIN_VALUE && (rev == Integer.MIN_VALUE && digit < -8)){
                System.out.println(0);
            }
            rev = rev * 10 + digit;
            a /= 10;
        }
        System.out.println(rev);
    }
}
