

public class RBS {
    public static void main(String[] args) {
        int[] arr = {  3,4,5,1,2 };
        int target = 2;
        int answer = search(arr, target, 0, arr.length   - 1);
        System.out.println("Answer by recursion " +answer);
        int pivot = pivotElement(arr);
        if (pivot == -1) {
            int ans = binarySearch(arr, target, 0, arr.length-1);
            System.out.println("Answer by traditional method " + ans);
        }
        else if (arr[pivot] == target) {
            System.out.println("The element is at the index by traditional method " + pivot);
        }
        else if (arr[0] > target) {
            int ans = binarySearch(arr, target, pivot + 1, arr.length-1);
            System.out.println("By traditional method " +ans);
        }
        else {
            int ans = binarySearch(arr, target, 0, pivot);
            System.out.println("By traditional method " +ans);
        }
    }

    public static int pivotElement(int[] arr) {
        int start = 0;
        int end = arr.length - 1;
        while (start < end) {
            int mid = start + (end - start) / 2;
            if (mid < end && arr[mid] > arr[mid + 1]) {
                return mid;
            }
            if (mid > start && arr[mid] < arr[mid - 1]) {
                return mid - 1;
            }
            if (arr[start] > arr[mid]) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        return -1;
    }

    public static int binarySearch(int[] arr, int target, int start, int end) {
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
    
    public static int search(int[] arr, int target, int start, int end) {
        if (start > end) {
            return -1;
        }
        int mid = start + (end - start) / 2;
        if (arr[mid] == target) {
            return mid;
        }
        if (arr[start] <= arr[mid]) {
            if (target >= arr[start] && target <= arr[mid]) {
                return search(arr, target, start, mid - 1);
            } else {
                return search(arr, target, mid + 1, end);
            }
        }
        
        if (target >= arr[mid] && target >= arr[start]) {
            return search(arr, target, start, mid - 1);
        }
        return search(arr, target, mid + 1, end);
    }
}
