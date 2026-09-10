
import java.util.HashSet;

public class ContainDuplicates {
    public static void main(String[] args) {
        int[] arr = { 1111,1111};
        boolean isDuplicate = duplicate(arr);
        System.out.println(isDuplicate);
    }

    public static boolean duplicate(int[] arr) {
        HashSet<Integer> ans = new HashSet<>();
        for (int num : arr) {
            if (ans.contains(num)) {
                return true;
            }
            ans.add(num);
        }
        return false;
    }
}
