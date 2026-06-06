package Sorting;

import java.util.Arrays;

public class CyclicSort {
    // Cyclic Sort : Mainly used when the given numbers are in range 1 to N.
    public static void main(String[] args) {
        int[] arr = {3,2,1,4,5,6};
        sort(arr);
        System.out.println(Arrays.toString(arr));
    }
    
    static void sort(int[] arr) {
        int i = 0;
        while (i < arr.length) {
            int correct = arr[i] - 1;
            if (arr[i] != arr[correct]) {
                swap(arr, i, correct);
            } else {
                i++;
            }
        }
    }
    
    static void swap(int[] arr, int first, int second) {
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}
