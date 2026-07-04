package Arrays;

import java.util.Arrays;

public class RemoveDuplicates {
    public static void main(String[] args) {
        int[] arr = { 0,0,1,1, 1,2 };
        int i = 0;
        int j = 1;
        while (i < j && i < arr.length && j < arr.length) {
            if (arr[i] != arr[j]) {
                i++;
                swap(arr, i, j);
            }
            j++;
        }
        System.out.println(Arrays.toString(arr));
        System.out.println(i+1);
    }

    public static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
