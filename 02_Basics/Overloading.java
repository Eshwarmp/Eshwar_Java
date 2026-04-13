import java.util.Arrays;

public class Overloading {
    public static void main(String[] args) {
        // Method overloading means, when the two or more methods having same name, but different
        // types of arguments or the different number of arguments.
        fun(2);
        fun(4, 3);
        fun("April");
        int sum = sum(4, 3);
        System.out.println("Sum is "+ sum);
        demo(4, 3, 2, 5, 5);
        demo("A", "B", "C");
    }

    static void fun(int a) {
        System.out.println(a);
    }

    static void fun(int a, int name) {
        System.out.println(a + " " + name);
    }
    
    static void fun(String name) {
        System.out.println(name);
    }

    static int sum(int a, int name) {
        return a + name;
    }

    static void demo(int... v) {
        System.out.println(Arrays.toString(v));
    }

    static void demo(String... v) {
        System.out.println(Arrays.toString(v));
    }
}