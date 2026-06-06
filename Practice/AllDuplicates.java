
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

// Finding all duplicates in the given array from range 1 to n;

public class AllDuplicates {
    public static void main(String[] args) {
        int[] arr = { 4, 3, 2, 7, 8, 2, 3, 1 };
        cyclic(arr);
        System.out.println(Arrays.toString(arr));
        List<Integer> ans = cyclic(arr);
        System.out.println(ans);
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
        List<Integer> list = new ArrayList<>();
            for (int j = 0; j < arr.length; j++) {
                if (arr[j] != j + 1) {
                    list.add(arr[j]);
                }
            }
        return list;
    }

    static void swap(int[] arr, int first, int second) {
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}
