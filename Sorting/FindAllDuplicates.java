package Sorting;

import java.util.ArrayList;
import java.util.Arrays;

public class FindAllDuplicates {
    public static void main(String[] args) {
        int[] arr = { 4, 3, 2, 7, 8, 2, 3, 1 };
        int[] ans = cyclic(arr);
        System.out.println(Arrays.toString(ans));
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < ans.length; i++) {
            if (arr[i] != i + 1) {
                list.add(arr[i]);
            }
        }
        System.out.println(list);
    }

    public static int[] cyclic(int[] arr) {
        int i = 0;
        while (i < arr.length) {
            int correct = arr[i] - 1;
            if (arr[i] != arr[correct]) {
                swap(arr, i, correct);
                // System.out.println(arr[i]);
            } else {
                i++;
            }
        }
        return arr;
    }

    public static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
