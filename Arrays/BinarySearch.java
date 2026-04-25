package Arrays;

import java.util.Scanner;

public class BinarySearch {
    // Binary Search only applicable when the given is in sorted form.
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] arr = { 1, 2, 3, 4, 5, 6 }; // Make sure the array is sorted in ascending order
        System.out.println("Enter the elment to search");
        int target = in.nextInt();
        int ans = binary(arr, target);
        System.out.println("The target is present at the index " + ans);
    }

    static int binary(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;
        while (start <= end) {
            // int mid = (start + end) / 2; // This may exceeds the range of integer storage, hence
            int mid = start + (end - start) / 2;
            if (arr[mid] == target) {
                return mid;
            } else if (arr[mid] < target) {
                start = mid + 1;
            } else {
                end = mid - 1;  
            }
        }
        return -1;
    }
}
