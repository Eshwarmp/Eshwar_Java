package Recursion;

import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) {
        int[] arr = { 2, 3, 1, 4, 5 };
        int[] answer = selection(arr);
        System.out.println("Iterative : " + Arrays.toString(answer));
        int[] ans = { 3, 4, 5, 2, 1 };
        selectionRecurive(ans, ans.length, 0, 0);
        System.out.println("Recursive : " + Arrays.toString(ans));
    }

    public static int[] selection(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            int last = arr.length - i-1;
            int max = getMax(arr, 0, last);
            swap(arr, max, last);
        }
        return arr;
    }

    public static int getMax(int[] arr, int start, int end) {
        int big = start;
        for (int i = start; i <= end; i++) {
            if (arr[i] > arr[big]) {
                big = i;
            }
        }
        return big;
    }

    public static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static void selectionRecurive(int[] arr, int row, int col, int max) {
        if (row == 0) {
            return;
        }
        if (col < row) {
            if (arr[col] > arr[max]) {
                selectionRecurive(arr, row, col + 1, col);
            } else {
                selectionRecurive(arr, row, col + 1, max);
            }
        }
        else {
            swap(arr, max, row - 1);
            selectionRecurive(arr, row-1, 0, 0);
        }
    }
}
