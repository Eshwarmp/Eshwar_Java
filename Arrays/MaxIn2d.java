package Arrays;

public class MaxIn2d {
    public static void main(String[] args) {
        int[][] arr = {
                { 1, 2, 3 },
                { 4, 5, 9 }
        };
        int big = max(arr);
        System.out.println("The maximum element in the given 2d array is "+big);

    }

    static int max(int[][] arr) {
        int max = arr[0][0];
        for (int[] num : arr) {
            for (int element : num) {
                if (element > max) {
                    max = element;
                }
            }
        }
        return max;
    }
}
