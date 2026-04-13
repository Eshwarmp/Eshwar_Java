import java.util.Arrays;

public class VarArgs {
    public static void main(String[] args) {
        System.out.println("Variable Length Arguments : ");
        fun(4, 5, 6, 3, 2, 1, 5, 6, 9);
        multiple(2, 3, "Ab","Bc","CD");
    }

    static void fun(int... v) { // This means we can give any number of arguments and it stores those
        // values in terms of array.
        System.out.println(Arrays.toString(v));
    }

    // Mixed variable integers
    // Let's say we are gonna print two integers first and variable length of Strings
    static void multiple(int a, int b, String... c) {
        System.out.println(a + " " + b + " " + Arrays.toString(c));
    }
    // Always the variable length arguments should be at last..
}