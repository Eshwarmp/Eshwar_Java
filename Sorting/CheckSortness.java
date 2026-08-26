package Sorting;

public class CheckSortness {
    public static void main(String[] args) {
        int[] arr = { 1, 2,2, 3,  4, 5 };
        answer(arr);
        boolean answer = ans(arr, 0);
        System.out.println(answer);
    }

    public static boolean ans(int[] arr, int index) {
        if (index == arr.length - 1) {
            return true;
        }
        return arr[index] <= arr[index + 1] && ans(arr, index + 1);
    }

    public static void answer(int[] arr) {
        int i = 0;
        while (i + 1 < arr.length) {
            if (arr[i] <= arr[i + 1]) {
                i++;
            }
            else {
                break;
            }
        }
        // System.out.println(i);
        if (i == arr.length - 1) {
            System.out.println("Array is sorted");
        }
        else {
            System.out.println("Array is not sorted");
        }
    }
}
