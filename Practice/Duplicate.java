
import java.util.Arrays;

// Finding a duplicate number in a arr from range 1 to n;

public class Duplicate {
    public static void main(String[] args) {
        int[] arr = { 1, 3, 4, 2, 2 };
        cyclic(arr);
        System.out.println(Arrays.toString(arr));
        int duplicate = cyclic(arr);
        System.out.println(duplicate);
    }

    static int cyclic(int[] arr) {
        int i = 0;
        while (i < arr.length) {
            int correct = arr[i] - 1;
            if (arr[i] != arr[correct]) {
                swap(arr, i, correct);
            } else {
                i++;
            }
        }
        
        for (int j = 0; j < arr.length; j++) {
            if (arr[j] != j + 1) {
                return arr[j];
            }
        }
        return 0;
    }

    static void swap(int[] arr, int first, int second) {
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}
