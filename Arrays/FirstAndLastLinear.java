package Arrays;

import java.util.Arrays;

public class FirstAndLastLinear {
    public static void main(String[] args) {
        int[] arr = { 5, 7, 7, 7, 7, 8, 8 };
        int target = 5;
        int[] ans = { -1, -1 };
        boolean findStart;
        ans[0] = search(arr, target, true);
        if (ans[0] != -1) {
            ans[1] = search(arr, target, false);
        }
        System.out.println(Arrays.toString(ans));
    }

    static int search(int[] arr, int target, boolean findStart) {
        int ans = -1;
        if (findStart == true) {
            for (int i = 0; i < arr.length - 1; i++) {
                if (arr[i] == target) {
                    return i;
                }
            }
        }
        else {
            for (int i = arr.length - 1; i >= 0; i--) {
                if (arr[i] == target) {
                    return i;
                }
            }
        }
        return ans;
    }
}
