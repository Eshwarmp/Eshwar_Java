
import java.util.Scanner;

public class Sum {
    public static void main(String[] args) {
        Scanner num = new Scanner(System.in);
        System.out.println("Enter first number: ");
        int number1 = num.nextInt();
        System.out.println("Enter second number: ");
        int number2 = num.nextInt();
        int sum = number1 + number2;
        System.out.println("Sum is "+sum);
    }
}
