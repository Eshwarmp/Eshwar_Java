public class SingleNumber1 {
    public static void main(String[] args) {
        int[] arr = { 4, 1, 2, 1, 2 };
        int ans = 0;
        for (int n : arr) {
            ans = ans ^ n;
        }
        System.out.println(ans);
    }
}
