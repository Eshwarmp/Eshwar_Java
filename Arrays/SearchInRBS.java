package Arrays;

public class SearchInRBS {
    public static void main(String[] args) {
        /* 
        Rotated Sorted Array : It is a sorted array that is rotated from some pivot point.
        Example : Normal Sorted Array : 1,2,3,4,5
        Rotated sorted array: 3,4,5,1,2
        In order to search for an element in the rotated sorted array, first we need to find the 
        pivot element, from which the array is rotated i.e., find the maximum element.
        */
        int[] arr = { 4,5,6,7,0,1,2};
        int target = 0;
        int pivot = pivotElement(arr);
        if (pivot == -1) {
            int a = binarySearch(arr, target, 0, arr.length - 1);
            System.out.println("The target is at index "+a);
        }
        else if (arr[pivot] == target) {
            System.out.println("The target is at index " + pivot);
        }
        else if (arr[0] > target) {
            int ans = binarySearch(arr, target, pivot + 1, arr.length - 1);
            System.out.println("The target is at index "+ans);
        }
        else {
            int ans = binarySearch(arr, target, 0, pivot);
            System.out.println("The target is at index "+ans);
        }

    }

    static int pivotElement(int[] arr) {
        int start = 0;
        int end = arr.length - 1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            // case 1 :
            if (mid < end && arr[mid] > arr[mid + 1]) {
                return mid;
            }
            // case 2:
            if (mid > start && arr[mid] < arr[mid - 1]) {
                return mid - 1;
            }
            // case 3:
            if (arr[start] >= arr[mid]) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        return -1;
    }

    static int binarySearch(int[] arr, int target, int start, int end) {
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (arr[mid] == target) {
                return mid;
            } else if (arr[mid] > target) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        return -1;

    }
}
