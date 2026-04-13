
import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();
        prime(num);
    }

    static void prime(int n) {
        if (n > 1) {
            for (int i = 2; i * i <=n; i++) {
                if (n % i == 0) {
                    System.out.println("Not a prime number");
                    return;
                }
            }
            System.out.println("Prime Number");
        }
        else {
            System.out.println("Please enter a valid number");
        }
    }
}
