
import java.util.Scanner;

public class ArgumentParameter {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n1, n2;
        System.out.print("Enter first number: ");
        n1 = in.nextInt();
        System.out.print("Enter second number: ");
        n2 = in.nextInt();
        int ans = add(n1, n2);
        System.out.println("The sum of the two numbers is "+ans);
    }

    static int add(int a, int b) {
        int sum = a + b;
        return sum;
    }
}
