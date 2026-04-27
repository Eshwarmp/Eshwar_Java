package Arrays;

import java.util.Arrays;

public class SmallestGreater {
    public static void main(String[] args) {
        // 744. Find Smallest Letter Greater Than Target
        char[] letters = { 'c', 'f', 'j' };
        char target = 'c';
        char result = great(letters, target);
        System.out.println(result);
    }

    static char great(char[] letters, char target) {
        char[] arr = new char[letters.length];
        for (int i = 0; i < letters.length; i++) {
            if (letters[i] > target) {
                arr[i] = letters[i];
            }
        }
        char small = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < small) {
                small = arr[i];
            }
        }
        System.out.println(Arrays.toString(arr));
        return small;
    }
}
