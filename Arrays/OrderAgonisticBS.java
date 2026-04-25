package Arrays;

public class OrderAgonisticBS {
    public static void main(String[] args) {
        int[] arr = { 90,70,69,67,66,65 };
        int target = 65;
        int ans = binary(arr, target);
        System.out.println("The element is present at the index "+ ans);
    }

    static int binary(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;
        boolean isAscending = arr[start] < arr[end];
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (arr[mid] == target) {
                return mid;
            }
            if (isAscending == true) {
                if (arr[mid] < target) {
                    start = mid + 1;
                } else {
                    end = mid - 1;
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
