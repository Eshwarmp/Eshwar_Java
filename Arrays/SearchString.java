package Arrays;

import java.util.Arrays;

public class SearchString {
    public static void main(String[] args) {
        String name = "Eshwar";
        char target = 'r';
        int index = search(name, target);
        char[] arr = name.toCharArray();
        char key = searchArray(arr, target);
        System.out.println("The key character "+ key + " is present in the array");
        System.out.println(Arrays.toString(arr));
        System.out.println("The character present at the index " + index);
        int range = searchRange(name, target);
        System.out.println("The character is present at the index "+ range);
    }

    static int search(String name, char target) {
        for (int i = 0; i < name.length(); i++) {
            if (target == name.charAt(i)) {
                return i;
            }
        }
        return -1;
    }

    static char searchArray(char[] arr, char target) {
        for (char key : arr) {
            if (key == target) {
                return key;
            }
        }
        return '\0';
    }

    static int searchRange(String name, char target) {
        for (int i = 2; i < 5; i++) {
            if (target == name.charAt(i)) {
                return i;
            }
        }
        return -1;
    }
}
