
import java.util.Scanner;

public class StrongNumber {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Strong number or not");
        int number = in.nextInt();
        int temp = number;
        int sum = 0;
        while (temp > 0) {
            int fact = 1;
            int last = temp % 10;
            while (last > 0) {
                fact = fact * last;
                last--;
            }
            sum = sum + fact;
            temp /= 10;
        }
        if (sum == number) {
            System.out.println("Strong number");
        }
        else {
            System.out.println("Not strong number");
        }
        
    }
}