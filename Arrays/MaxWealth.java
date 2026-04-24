package Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class MaxWealth {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[][] arr = new int[3][3];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j] = in.nextInt();
            }
        }
        System.out.println(Arrays.deepToString(arr));
        rich(arr);
    }

    static void rich(int[][] arr) {
        int[] sum = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            int add = 0;
            for (int j = 0; j < arr[i].length; j++) {
                add = add + arr[i][j];
            }
            sum[i] = add;
        }
        System.out.println(Arrays.toString(sum));
        int bigg = max(sum);
        System.out.println(bigg);
    }
    
    static int max(int[] arr) {
        int big = arr[0];
        int index = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > big) {
                big = arr[i];
                index = i;
            }
        }
        return index + 1;
        // return 0;
    }
}
