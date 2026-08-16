public class LeetCode69 {
    public static void main(String[] args) {
        int ans = 0;
        int n = 2147395600;
        int i = 1;
        int j = n;
        while (i <= j) {
            int mid = i + (j - i) / 2;
            if ((long) mid * mid <= n) {
                ans = mid;
                i = mid + 1;
            } else {
                j = mid - 1;
            }
        }
        System.out.println(ans);
    }
}
