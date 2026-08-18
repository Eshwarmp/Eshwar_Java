public class AddDigits {
    public static void main(String[] args) {
        int n = 999;
        int ans = sum(n);
        while (ans >= 10) {
            ans = sum(ans);
        }
        System.out.println(ans);
    }

    public static int sum(int n) {
        if (n % 10 == n) {
            return n;
        }
        return (n % 10) + sum(n / 10);
    }
}
