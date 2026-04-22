package Arrays;

public class Min {
    public static void main(String[] args) {
        int[] arr = { 10, -7, 20, 30 };
        int small = min(arr);
        System.out.println("The minimum element in the array is "+ small);
    }

    static int min(int[] arr) {
        int small = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < small) {
                small = arr[i];
            }
        }
        return small;
    }
}
