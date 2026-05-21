package Arrays;

public class RotationCount {
    public static void main(String[] args) {
        int[] arr = {6, 7, 8, 1, 2, 3, 4 };
        int pivotElement = pivot(arr);
        System.out.println(pivotElement);
        System.out.println("Rotation Count is "+ (pivotElement+1));
    }

    static int pivot(int[] arr) {
        int start = 0;
        int end = arr.length - 1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (arr[mid] > arr[mid + 1]) {
                return mid;
            } else if (arr[mid] < arr[mid - 1]) {
                return mid - 1;
            } else if (arr[start] > arr[mid]) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        return -1;
    }
}
