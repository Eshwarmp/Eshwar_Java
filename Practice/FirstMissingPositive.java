
import java.util.Arrays;

public class FirstMissingPositive {
    public static void main(String[] args) {
        /* 
        Given an unsorted integer array nums. Return the smallest positive integer that is not present in nums.
        
        You must implement an algorithm that runs in O(n) time and uses O(1) auxiliary space.
        */

        int[] arr = {  1, 1000};
        cyclic(arr);
        System.out.println(Arrays.toString(arr));
        int firstMissing = cyclic(arr);
        System.out.println(firstMissing);
    }
    
    static int cyclic(int[] arr) {
        int i = 0;
        while (i < arr.length) {
            int correct = arr[i] - 1;
            if (arr[i] > 0 && arr[i] <= arr.length && arr[i] != arr[correct] ) {
                swap(arr, i, correct);
            } else {
                i++;
            }
        }
        
        for (int j = 0; j < arr.length; j++) {
            if (arr[j] != j + 1 && j > 0) {
                return j + 1;
            }
        }
        return arr.length + 1;
    }
    
    
    static void swap(int[] arr, int first, int second) {
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}
