
import java.util.HashMap;

public class LuckyNumber {
    public static void main(String[] args) {
        int[] arr = { 1,1, 2,2, 2, 3, 3 };
        int ans = lucky(arr);
        System.out.println(ans);
    }

    public static int lucky(int[] arr) {
        HashMap<Integer, Integer> frequency = new HashMap<>();
        for (int num : arr) {
            frequency.put(num, frequency.getOrDefault(num, 0) + 1);
        }
        int max = -1;
        for (Integer key : frequency.keySet()) {
            if (key.equals(frequency.get(key))) {
                if (key > max) {
                    max = key;
                }
            }
        }
        return max;
    }
}
