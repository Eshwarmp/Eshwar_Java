
import java.util.Arrays;

public class KthSmallest {
    public static void main(String[] args) {
        int[] arr = { 2, 3, 1, 4, 5 };
        int k = 2;
        KthSmall(arr, k);
        System.out.println(Arrays.toString(arr));
        int small = KthSmall(arr, k);
        System.out.println(small);
    }

    static int KthSmall(int[] arr, int k) {
        for (int i = arr.length; i > 0; i--) {
            int first = arr.length - i;
            int min = getMin(arr, first, i);
            swap(arr, first, min);
        }
        return arr[k-1];
    }

    static int getMin(int[] arr, int start, int end) {
        int min = start;
        for (int i = start; i < end; i++) {
            if (arr[i] < arr[min]) {
                min = i;
            }
        }
        return min;
    }

    static void swap(int[] arr, int first, int second) {
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}
