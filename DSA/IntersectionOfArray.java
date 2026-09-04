
import java.util.*;



public class IntersectionOfArray {
    public static void main(String[] args) {
        int[] nums1 = { 4,9,5};
        int[] nums2 = { 9,4,9,8,4 };
        ArrayList<Integer> ans = ans(nums1, nums2);
        System.out.println((ans));
        int[] answer = ans.stream().mapToInt(i -> i).toArray();
        System.out.println(Arrays.toString(answer));
        int[] result = arr(answer);
        System.out.println(Arrays.toString(result));
    }

    public static int[] arr(int[] answer) {
        int i = 0;
        int j = 0;
        while (j < answer.length) {
            if (answer[i] != answer[j]) {
                i++;
                swap(answer, i, j);
            }
            j++;
        }
        System.out.println(i);
        int[] res = new int[i + 1];
        for (int k = 0; k <= i; k++) {
            res[k] = answer[k];
            // i++;
        }
        return res;
    }

    public static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static ArrayList<Integer> ans(int[] nums1, int[] nums2) {
        ArrayList<Integer> ans = new ArrayList<>();
        for (int i = 0; i < nums1.length; i++) {
            for (int j = 0; j < nums2.length; j++) {
                if (nums1[i] == nums2[j]) {
                    ans.add(nums1[i]);
                }
                
            }
        }
        return ans;
    }
}
