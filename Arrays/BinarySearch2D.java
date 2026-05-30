package Arrays;

import java.util.Arrays;

public class BinarySearch2D {
    public static void main(String[] args) {
        int[][] arr = {
                { 10, 20, 30, 40 },
                { 15, 25, 35, 45 },
                { 24, 27, 38, 46 },
                { 26, 28, 39, 49 }
        };
        int target = 49;
        System.out.println(Arrays.toString(search(arr, target)));
    }
    
    public static int[] search(int[][] arr, int target) {
        int r = 0;
        int c = arr.length - 1;
        while (r < arr.length && c >= 0) {
            if (arr[r][c] == target) {
                return new int[] { r, c };
            } else if (arr[r][c] < target) {
                r++;
            } else {
                c--;
            }
        }
        return new int[] { -1, -1 };
    }
}
