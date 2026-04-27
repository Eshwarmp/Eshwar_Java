package Arrays;

public class Ceiling {
    public static void main(String[] args) {
        int[] arr = { 2, 3, 5, 6, 9, 14, 16 };
        int target = 1 ;
        int ans = ceil(arr, target);
        System.out.println(ans);
    }

    static int ceil(int[] arr, int target) {
        if (target > arr[arr.length - 1]) {
            return -1; // No ceiling exists
        }
        int start = 0;
        int end = arr.length - 1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (arr[mid] == target) {
                return arr[mid];
            } else if (arr[mid] < target) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return arr[start];
    }
}
