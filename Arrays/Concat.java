package Arrays;

import java.util.Arrays;

public class Concat {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 3 };
        int[] ans = new int[2 * arr.length];
        for (int i = 0; i < arr.length; i++) {
            ans[i] = arr[i];
            ans[i + arr.length] = arr[i];
        }
        System.out.println(Arrays.toString(ans));
    }
}
