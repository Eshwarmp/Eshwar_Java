
import java.util.HashMap;

public class MajorityElement {
    public static void main(String[] args) {
        int[] arr = { 3, 2, 3 };
        int answer = ans(arr);
        System.out.println(answer);
    }

    public static int ans(int[] arr) {
        HashMap<Integer, Integer> frequency = new HashMap<>();
        for (int num : arr) {
            frequency.put(num, frequency.getOrDefault(num, 0) + 1);
        }
        for (Integer key : frequency.keySet()) {
            if (frequency.get(key) > arr.length / 2) {
                return key;
            }
        }
        return 0;
    }
}
