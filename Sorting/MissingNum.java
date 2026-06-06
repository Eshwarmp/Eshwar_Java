package Sorting;

import java.util.Arrays;

public class MissingNum {
    public static void main(String[] args) {
        int[] arr = { 4,0,2,1};
        int ans = miss(arr);
        System.out.println(Arrays.toString(arr));
        System.out.println(ans);

    }

    static int miss(int[] arr) {
        int i = 0;
        while (i < arr.length) {
            int correct = arr[i];
            if (arr[i] < arr.length && arr[i] != arr[correct]) {
                swap(arr, i, correct);
            } else {
                i++;
            }
        }
        for (int n = 0; n < arr.length; n++) {
            if (arr[n] != n) {
                return n;
            }
        }
        return arr.length;
    }

    static void swap(int[] arr, int first, int second) {
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}
