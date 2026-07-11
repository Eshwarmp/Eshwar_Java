
import java.util.Arrays;

public class Squares {
    public static void main(String[] args) {
        int[] arr = { -6, 0, 2, 4, 5 };
        int i = 0;
        int j = arr.length - 1;
        int[] ans = new int[arr.length];
        int p = arr.length - 1;
        while (i <= j) {
            if (Math.abs(arr[i]) > Math.abs(arr[j])) {
                ans[p] = arr[i] * arr[i];
                p--;
                i++;
            } else {
                ans[p] = arr[j] * arr[j];
                p--;
                j--;
            }
            // i++;
            // j--;
        }
        System.out.println(Arrays.toString(ans));
    }
}