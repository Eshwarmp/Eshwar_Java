
import java.util.Arrays;

public class swap {
    public static void main(String[] args) {
        int a = 5;
        int b = 6;
        swaps(a, b);
        System.out.println(a + " " + b);
        int[] arr = { 1, 2, 3, 4, 5 };
        change(arr);
        System.out.println("The values of array are :" + Arrays.toString(arr));

    }

    static void swaps(int x, int y) {
        int temp = x; // Here the x and y contains the copies of the value a and b, so change is 
        // sticked to x and y and doesn't affect to a and b
        x = y;
        y = temp;
    }

    static void change(int[] num) {
        num[0] = 11; // here both the num and arr are pointing for the same values (arr), so changing
        // values at one side, changes in other too.
    }
}
