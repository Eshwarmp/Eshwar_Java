
import java.util.*;

public class SetMisMatch {
    public static void main(String[] args) {
        // When in an array, one element is missing and one is repeating
        int[] arr = { 2, 1, 2, 4 };
        cyclic(arr);
        System.out.println(Arrays.toString(arr));
        List<Integer> answer = cyclic(arr);
        System.out.println(answer);
    }

    static List<Integer> cyclic(int[] arr) {
        int i = 0;
        while (i < arr.length) {
            int correct = arr[i] - 1;
            if (arr[i] <= arr.length && arr[i] != arr[correct]) {
                swap(arr, i, correct);
            } else {
                i++;
            }
        }
        List<Integer> ans = new ArrayList<>();
        for (int j = 0; j < arr.length; j++) {
            if (arr[j] != j + 1) {
                ans.add(arr[j]); // Which one is duplicating and which one is missing
                ans.add(j + 1); // Which one is missing
            }
        }
        return ans;
    }
    
    static void swap(int[] arr, int first, int second) {
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}
