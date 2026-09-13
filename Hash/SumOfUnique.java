package Hash;

import java.util.HashMap;

public class SumOfUnique {
    public static void main(String[] args) {
        int[] arr = { 1,2,3,2 };
        int ans = sumOfUnique(arr);
        System.out.println(ans);
    }

    public static int sumOfUnique(int[] arr) {
        HashMap<Integer, Integer> count = new HashMap<>();
        int sum = 0;
        for (int num : arr) {
            count.put(num, count.getOrDefault(num, 0) + 1);
        }
        System.out.println(count);
        for (int key : count.keySet()) {
            if (count.get(key) == 1) {
                sum += key;
            }
        }
        return sum;
    }
}
