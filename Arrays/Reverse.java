package Arrays;

import java.util.Arrays;

public class Reverse {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5 };
        // reverse(arr);
        // swap(arr, 0, 1);
        int[] rever = reverseShort(arr);
        System.out.println(Arrays.toString(rever));
        // System.out.println(Arrays.toString(arr));
    }

    static int[] reverseShort(int[] num) {
        int[] rev = new int[num.length];
        for (int i = 0; i < num.length; i++) {
            rev[i] = num[num.length - 1 - i];
        }
        return rev;
    }

    static void reverse(int[] arr) {
        int start = 0;
        int end = arr.length-1;

        while (start < end) {
            swap(arr, start, end);
            start++;
            end--;
        }
    }

    static void swap(int[] arr, int start, int end) {
        int temp = arr[start];
        arr[start] = arr[end];
        arr[end] = temp;
    }
}
