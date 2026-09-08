
public class CountCommas {
    public static void main(String[] args) {
        // count commas for the numbers in range 1 to 100000
        int n = 55521;
        int ans = answer(n);
        System.out.println(ans);
    }

    public static int answer(int n) {
        if (n < 1000) {
            return 0;
        }
        return n - 999;
    }
}
