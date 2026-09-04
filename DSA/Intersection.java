
import java.util.*;

public class Intersection {
    public static void main(String[] args) {
        int[] arr1 = { 1, 2, 3, 4 };
        int[] arr2 = { 2 };
        int[] answer = answer(arr1, arr2);
        System.out.println(Arrays.toString(answer));
    }

    public static int[] answer(int[] arr1, int[] arr2) {
        HashSet<Integer> set = new HashSet<>();
        for (int num : arr1) {
            set.add(num);
        }
        HashSet<Integer> result = new HashSet<>();
        for (int num : arr2) {
            if (set.contains(num)) {
                result.add(num);
            }
        }

        int[] ans = new int[result.size()];
        int i = 0;
        for (int num : result) {
            ans[i] = num;
            i++;
        }
        return ans;
    }
}
