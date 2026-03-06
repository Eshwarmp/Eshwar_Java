// 3 digit armstrog number
import java.util.Scanner;

public class Armstrong {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Armstrong number or not");
        int num = in.nextInt();
        int temp = num;
        int sum = 0;
        while (temp > 0) {
            int digit = temp % 10;
            sum = sum + (digit * digit * digit);
            temp /= 10;
        }
        if (sum == num) {
            System.out.println("Number is armstrong number");
        }
        else {
            System.out.println("Number is not armstrong");
        }
    }
}
