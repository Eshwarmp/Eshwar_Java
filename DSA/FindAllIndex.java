
import java.util.ArrayList;

// import Arrays.ArrayLis;

public class FindAllIndex {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 4, 5 };
        int target = 4;
        // ArrayList<Integer> ans = new ArrayList<>();
        answer(arr, target, 0);
        System.out.println(list);
    }

    static ArrayList<Integer> list = new ArrayList<>();

    public static void answer(int[] arr, int target, int index) {
        if (index == arr.length) {
            return;
        }
        if (arr[index] == target) {
            list.add(index);
        }
        answer(arr, target, index+1);
    }
}
