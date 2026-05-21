package Arrays;

public class SearchInRBS_Duplicates {
    public static void main(String[] args) {
        int[] arr = { 3, 3, 3, 4, 5, 0, 1, 2 };
        int target = 3;
        int pivot = pivotElement(arr);
        if (pivot == -1) {
            int ans = binary(arr, 0, target, arr.length - 1);
            System.out.println(ans);
        }
        else if (arr[pivot] == target) {
            System.out.println(pivot);
        }
        else if (arr[0] > target) {
            int ans = binary(arr, target, pivot + 1, arr.length - 1);
            System.out.println(ans);
        }
        else {
            int ans = binary(arr, target, 0, pivot);
            System.out.println(ans);
        }

    }

    static int pivotElement(int[] arr) {
        int start = 0;
        int end = arr.length - 1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (mid < end && arr[mid] > arr[mid + 1]) {
                return mid;
            } else if (mid > start && arr[mid] < arr[mid - 1]) {
                return mid - 1;
            }
            // Checking for duplicate items
            else if (arr[start] == arr[mid] && arr[mid] == arr[end]) {
                if (arr[start] > arr[start + 1]) {
                    return start;
                }
                start++;
                if (arr[end] < arr[end - 1]) {
                    return end - 1;
                }
                end--;
            } else if (arr[start] < arr[mid] || (arr[start] == arr[mid] && arr[mid] > arr[end])) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return -1;
    }

    static int binary(int[] arr, int target, int start, int end) {
        int a = -1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (arr[mid] == target) {
                a = mid; // holds the value
                end = mid - 1; // search again for left for the first occurance..
            } else if (arr[mid] > target) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        return a;
    }
}
