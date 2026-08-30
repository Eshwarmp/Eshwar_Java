package Recursion;

import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        int[] arrTradition = { 5, 4, 3, 2, 1 };
        bubble(arrTradition);
        System.out.println("Iteration " + Arrays.toString(arrTradition));
        int[] arrRecursion = { 5, 4, 3, 2, 1 };
        bubbleRecursion(arrRecursion, arrRecursion.length-1, 0);
        System.out.println("Recursion " + Arrays.toString(arrRecursion));
    }

    public static void bubble(int[] arr) {
        boolean swapped;
        for (int i = 0; i < arr.length; i++) {
            swapped = false;
            for (int j = 1; j < arr.length - i; j++) {
                if (arr[j] < arr[j - 1]) {
                    swap(arr, j, j - 1);
                    swapped = true;
                }
            }
            if (!swapped) {
                break;
            }
        }
    }

    public static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static void bubbleRecursion(int[] arr, int row, int col) {
        if (row == 0) {
            return;
        }
        if (col < row) {
            if (arr[col] > arr[col + 1]) {
                swap(arr, col, col + 1);
            }
            bubbleRecursion(arr, row, col + 1);
        }
        else {
            bubbleRecursion(arr, row-1, 0);
        }
    }
}
