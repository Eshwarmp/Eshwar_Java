package BitManipulation;

public class XOR {
    public static void main(String[] args) {
        int n = 5;
        int ans = 0;
        for (int i = 0; i <= n; i++) {
            ans ^= i;
        }
        System.out.println(ans);
        if (n % 4 == 0) {
            System.out.println(n);
        }
        else if (n % 4 == 1) {
            System.out.println(1);
        }
        else if (n % 4 == 2) {
            System.out.println(n + 1);
        }
        else {
            System.out.println(0);
        }
    }
}
