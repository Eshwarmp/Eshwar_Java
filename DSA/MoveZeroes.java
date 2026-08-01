
import java.util.Arrays;





public class MoveZeroes {
    public static void main(String[] args) {
        int[] arr = { 0, 1, 0, 3, 12 };
        int i = 0;
        int j = 0;
        while (i <= j && i < arr.length && j < arr.length) {
            if (arr[j] != 0) {
                swap(arr, i, j);
                i++;
            }
            j++;
        }
        System.out.println(Arrays.toString(arr));
    }

    public static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
