package Arrays;

public class Max {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 24, 5 , 6 , 7 ,8};
        max(arr);
        maxRange(arr, 4, 7);
    }

    static void max(int[] arr) {
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        System.out.println("Max of array is " + max);
    }
    
    static void maxRange(int[] arr, int start, int j) {
        int max = arr[start];
        for (int i = start; i <= j; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        System.out.println("Max element in the given range is "+ max);
    }
}
