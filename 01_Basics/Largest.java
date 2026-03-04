
import java.util.Scanner;

public class Largest {
    public static void main(String[] args) {
        // Find the largest of given three numbers:
        Scanner number = new Scanner(System.in);
        System.out.println("Enter the first number");
        int a = number.nextInt();
        System.out.println("Enter the second number");
        int b = number.nextInt();
        System.out.println("Enter the third number");
        int c = number.nextInt();
        int max = a;
        if (b > max) {
            max = b;
        }
        if (c > max) {
            max = c;
        }
        System.out.println("Largest number is : "+ max);
        number.close();
        
        // Other way
        int large = Math.max(a, b);
        if (c > large) {
            System.out.println(c + " is the largest");
        }
        else {
            System.out.println(large + " is the largest");
        }

        // Or
        int big = Math.max(c, Math.max(a, b));
        System.out.println(big + " is the largest ");
    }
}
