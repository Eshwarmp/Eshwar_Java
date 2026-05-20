package Arrays;

public class TargetInMountain {
    public static void main(String[] args) {
        /*
        Step 1 : Find the peak element in the mountain array
        Step 2 : Apply OrderAgonistic BinarySearch for first half (from start to peak)
        Step 3 : If target not found in first half, then apply OrderAgonistic BinarySearch for 
                Second half (from peak+1 to end).
        */
        int[] arr = { 1, 2, 4, 5, 3, 1 };
        int target = 3;
        int peak = peakElement(arr);
        int first = orderAgonisticBS(arr, 3, 0, peak);
        if (first == -1) {
            int second = orderAgonisticBS(arr, 3, peak + 1, arr.length - 1);
            System.out.println("The target element is at index " + second);
            return;
        }
        System.out.println("The target element is at index "+first);
    }

    static int peakElement(int[] arr) {
        int start = 0;
        int end = arr.length - 1;
        while (start < end) {
            int mid = start + (end - start) / 2;
            if (arr[mid] > arr[mid + 1]) {
                end = mid;
            } else {
                start = mid + 1;
            }
        }
        return start;
    }
    
    static int orderAgonisticBS(int[] arr, int target, int start, int end) {
        boolean isAscending = arr[start] < arr[end];
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (arr[mid] == target) {
                return mid;
            }
            if (isAscending == true) {
                if (arr[mid] > target) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            } else {
                if (arr[mid] > target) {
                    start = mid + 1;
                } else {
                    end = mid - 1;
                }
            }
        }
        return -1;
    }
}
