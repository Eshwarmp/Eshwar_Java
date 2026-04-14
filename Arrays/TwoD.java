package Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class TwoD {
    public static void main(String[] args) {
        // Array is mutable, but String is not mutable
        // Multidimensional array is nothing but arrays inside an array.
        Scanner in = new Scanner (System.in);
        // System.out.println("2-D arrays:");
        int[][] matrix = new int[3][3];
        // int[][] arr = {
        //     {1,2,3},{4,5},{6,7,8,9}
        // };
        // System.out.println(Arrays.deepToString(arr));
        // System.out.println(arr[0][1]);// Accessing the elements 
        // System.out.println(Arrays.toString(arr[0]));// First element of TwoD array which is also an array

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = in.nextInt();
            }
        }
        System.out.println(matrix.length);// results number of rows in that array.

        System.out.println("Printing two dimensional array");
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println("\n");
        }
        System.out.println(Arrays.deepToString(matrix));

        System.out.println("Through enhanced for loop");
        for (int num[] : matrix) {
            System.out.println(Arrays.toString(num));
        }
    }
}
