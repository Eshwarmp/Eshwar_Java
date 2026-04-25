package Arrays;

import java.util.Scanner;

public class BinarySearch {
    // Binary Search only applicable when the given is in sorted form.
    public static void main(String[] args) {
        // Scanner in = new Scanner(System.in);
        Scanner in = new Scanner(System.in);
        int[] arr = { 1, 2, 3, 4, 5, 6 }; // Make sure the array is sorted in ascending order
        int[] desArr = { 6, 5, 4, 3, 2, 1 }; // the array is in descending order
        int[] equArr = { 3, 3, 3, 3 }; // all the array elements are same
        System.out.println("Enter the elment to search");
        int target = in.nextInt();
        choice(arr,target);
        choice(desArr,target);
        choice(equArr, target);
        in.close();
    }
    
    static void choice(int[] arr, int target) {

        int start = 0;
        int end = arr.length - 1;
        if (arr[start] > arr[end]) {
            int ans = desBinary(arr, target);
            System.out.println("The target is at index (Descending) "+ ans);
        }
        else if (arr[start] < arr[end]) {
            int ans = binary(arr, target);
            System.out.println("The target is at index (Ascending) " + ans);
        }
        else {
            System.out.println("The target is present at index (Equal elements) " + 0);
        }
    }

    static int binary(int[] arr, int target) {
        // If array is in ascending order
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
    
    static int desBinary(int[] arr, int target) {
        // If array is in descending order
        int start = 0;
        int end = arr.length - 1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (arr[mid] == target) {
                return mid;
            } else if (arr[mid] < target) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        return -1;
    }
}
