package Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Search2d {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[][] arr = new int[3][3];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j] = in.nextInt();
            }
        }
        System.out.println(Arrays.deepToString(arr));
        System.out.println("Enter the element to find in the array");
        int target = in.nextInt();
        int[] index = search(arr, target);
        System.out.println("The index of the element in the array is " + Arrays.toString(index));
        // Printing 2d array elements using enhanced for loop
        for (int[] list : arr) {
            for (int num : list) {
                System.out.print(num + " ");
            }
        }
        in.close();
    }

    static int[] search(int[][] arr, int target) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (arr[i][j] == target) {
                    return new int[]{i,j};
                }
            }
        }
        return new int[] {-1,-1};
    }
}
