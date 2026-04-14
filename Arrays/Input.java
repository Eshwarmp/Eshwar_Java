package Arrays;

import java.util.Arrays;
import java.util.Scanner;
public class Input {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] arr = new int[5];
        System.out.println("Getting values from user");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = in.nextInt();
        }
        System.out.println("Printing array elements");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println("\nThrough enhanced for loop");
        for (int num : arr) {
            // Here num is a reference variable which prints the values of the array
            System.out.print(num + " ");
        }
        System.out.println("\nThrough toString() method");
        System.out.println(Arrays.toString(arr));

        System.out.println("String array:");
        String[] str = new String[5];
        for (int i = 0; i < str.length; i++) {
            str[i] = in.next();
        }
        System.out.println(Arrays.toString(str));
        in.close();
    }
}
