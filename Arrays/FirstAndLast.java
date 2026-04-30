package Arrays;

import java.util.Arrays;

public class FirstAndLast {
    public static void main(String[] args) {
        int[] arr = { 5, 7, 7, 7, 7, 8, 8 };
        int target = 5;
        int[] res = first(arr, target);
        System.out.println(Arrays.toString(res));
    }

    static int[] first(int[] arr, int target) {
        int[] ans = { -1, -1 };
        boolean findStart;
        ans[0] = search(arr, target, true);
        if (ans[0] != -1) {
            ans[1] = search(arr, target, false);
        }
        return ans;
    }

    static int search(int[] arr, int target, boolean findStart) {
        int ans = -1;
        int start = 0;
        int end = arr.length - 1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (arr[mid] == target) {
                ans = mid;
                if (findStart == true) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            } else if (target > arr[mid]) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return ans;
    }
}
