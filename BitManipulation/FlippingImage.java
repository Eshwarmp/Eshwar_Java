package BitManipulation;

import java.util.Arrays;

public class FlippingImage {
    public static void main(String[] args) {
        int[] arr = { 1, 1, 0 };
        int i = 0;
        int j = arr.length - 1;
        while (i < j) {
            swap(arr, i, j);
            i++;
            j--;
        }
        
        for (int k = 0; k < arr.length; k++) {
            arr[k] = arr[k] ^ 1;
        }
        System.out.println(Arrays.toString(arr));
    }

    public static void swap(int[] arr, int i, int j) {
        int temp = arr[i]  ;
        arr[i] = arr[j]  ;
        arr[j]  = temp ;
    }

}
