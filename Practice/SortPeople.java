
import java.util.Arrays;

/*You are given an array of strings names, and an array heights that consists of distinct positive integers. Both arrays are of length n.

For each index i, names[i] and heights[i] denote the name and height of the ith person.

Return names sorted in descending order by the people's heights. */ 

public class SortPeople {
    public static void main(String[] args) {
        String[] names = { "Marry", "John", "Emma" };
        int[] heights = { 180, 165, 170 };
        selection(heights, names);
        System.out.println(Arrays.toString(heights));
        System.out.println(Arrays.toString(names));
    }

    static void selection(int[] arr, String[] names) {
        for (int i = arr.length; i > 0; i--) {
            int first = arr.length - i;
            int max = getMax(arr, first, arr.length);
            swap(arr, max, first);
            swap1(names, max, first);
        }
    }
    
    static int getMax(int[] arr, int start, int end) {
        int max = start;
        for (int i = start; i < end; i++) {
            if (arr[i] > arr[max]) {
                max = i;
            }
        }
        return max;
    }

    static void swap1(String[] names, int first, int second) {
        String temp = names[first];
        names[first] = names[second];
        names[second] = temp;
    }

    static void swap(int[] arr, int first, int second) {
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}
