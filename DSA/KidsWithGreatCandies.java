
import java.util.Arrays;

public class KidsWithGreatCandies {
    public static void main(String[] args) {
        int[] candies = { 4,2,1,2,1 };
        int extraCandies = 1;
        boolean[] ans = answer(candies, extraCandies);
        System.out.println(Arrays.toString(ans));
    }

    public static boolean[] answer(int[] arr, int n) {
        boolean[] ans = new boolean[arr.length];
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
            if (arr[i] + n >= max) {
                ans[i] = true;
            } else {
                ans[i] = false;
            }
        }
        return ans;
    }
}
