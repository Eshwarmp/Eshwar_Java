
import java.util.Arrays;



public class SingleNumber {
    public static void main(String[] args) {
        int[] arr = {4,1,2,1,2};
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < arr[i]) {
                    swap(arr, i, j);
                }
            }
        }
        System.out.println(Arrays.toString(arr));
        int i = 0;
        int j = 1;
        while (j < arr.length) {
            if (arr[i] == arr[j]) {
                i+=2;
            }
            j+=2;
        }
        // System.out.println(Arrays.toString(arr));
        System.out.println(arr[i]);
    }
    
    public static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
