package Arrays;

public class LinearSearch {
    public static void main(String[] args) {
        // Time Complexity -> How our execution time grows as the input grows.
        int[] num = { 1, 2, 3, 4, 5, 69, 7, 8, 5 };
        int target = 69;
        int index = linearSearch(num, target); // returns the index
        System.out.println("Element present at the index "+ index);
        int element = lin(num, target);
        System.out.println(element + " is present in the array");
        boolean isPresent = present(num, target);
        System.out.println("Whether the target is present in the array : "+ isPresent);

    }

    static int linearSearch(int[] num, int target) {
        if (num.length == 0) {
            return -1;
        }
        for (int i = 0; i < num.length; i++) {
            int element = num[i];
            if (element == target) {
                return i;
            }
        }
        return -1;
    }

    static int lin(int[] num, int target) {
        if (num.length == 0) {
            return Integer.MAX_VALUE;
        }
        for (int element : num) {
            if (element == target) {
                return element;
            }
        }
        return Integer.MAX_VALUE;
    }

    static boolean present(int[] num, int target) {
        if (num.length == 0) {
            return false;
        }
        for (int element : num) {
            if (element == target) {
                return true;
            }
        }
        return false;
    }
}
