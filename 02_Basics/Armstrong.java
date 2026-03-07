//  armstrog number
import java.util.Scanner;

public class Armstrong {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Armstrong number or not");
        int num = in.nextInt();
        int temp = num;
        int temp1 = num;
        int count = 0;
        int sum = 0;
        while (temp1 > 0) {
            int last = temp1 % 10;
            count++;
            temp1 /= 10;
        }
        
        while (temp > 0) {
            int digit = temp % 10;
            sum = sum + (int)Math.pow(digit, count);
            temp /= 10;
        }
        if (sum == num) {
            System.out.println("Number is armstrong number");
        }
        else {
            System.out.println("Number is not armstrong");
        }
        in.close();
    }
}
