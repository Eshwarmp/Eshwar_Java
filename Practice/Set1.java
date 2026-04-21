package Practice;

import java.util.Arrays;
import java.util.Scanner;

public class Set1 {
    public static void main(String[] args) {
        // 1. Take 5 integers in array and print
        Scanner in = new Scanner(System.in);
        int[] arr = new int[5];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = in.nextInt();
        }
        for (int num : arr) { // Enhanced for loop
            System.out.print(num + " ");
        }
        System.out.println("\n" + Arrays.toString(arr));
        int sumOfnum = sum(arr);
        System.out.println("The sum of elements in the array is " + sumOfnum);
        int maxElement = max(arr);
        System.out.println("The maximum element of the given array is " + maxElement);
        int[] rev = reverse(arr);
        System.out.println(Arrays.toString(rev));
        in.close();

    }

    static int sum(int[] num) {
        // 2. find sum of array
        int sum = 0;
        for (int element : num) {
            sum = sum + element;
        }
        return sum;
    }

    static int max(int[] num) {
        // Maximum element of the array
        int max = num[0];
        for (int element : num) {
            if (element > max) {
                max = element;
            }
        }
        return max;
    }

    static int[] reverse(int[] num) {
        int start = 0;
        int end = num.length - 1;
        while (start < end) {
            int temp = num[start];
            num[start] = num[end];
            num[end] = temp;
            start++;
            end--;
        }
        return num;
    }
}
