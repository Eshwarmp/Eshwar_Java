import java.util.*;

// Given an integer array nums of 2n integers, group these integers into n pairs 
// (a1, b1), (a2, b2), ..., (an, bn) such that the sum of min(ai, bi) for all i is maximized. 
// Return the maximized sum.

public class ArrayPartition {
    public static void main(String[] args) {
        int[] arr = { 6, 2, 6, 5, 1, 2 };
        // Arrays.sort(arr);
        sort(arr);
        System.out.println(Arrays.toString(arr));
        int ans = 0;
        for (int i = 0; i < arr.length - 1; i += 2) {
            ans = ans + arr[i];
        }
        // System.out.println(Arrays.toString(arr));
        System.out.println(ans);
    }
    
    public static void sort(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            int last = arr.length - i - 1;
            int max = maxElement(arr, 0, last);
            swap(arr, max, last);
        }
    }
    
    public static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static int maxElement(int[] arr, int start, int end) {
        int big = start;
        for (int i = start; i <= end; i++) {
            if (arr[i] > arr[big]) {
                big = i;
            }
        }
        return big;
    }
}
