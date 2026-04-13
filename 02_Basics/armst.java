import java.util.Scanner;

public class armst {
    public static void main(String[] args) {
        System.out.println("Enter a three digit number:");
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();
        int temp = num;
        int sum = 0;
        while (temp > 0) {
            int digit = temp % 10;
            sum = sum + (int) Math.pow(digit, 3);
            // for any number of digits, we have to calculate the length of number
            //int digits = String.valueOf(num).length();
            // sum += (int) Math.pow(digit,digits);
            temp /= 10;
        }
        if (sum == num) {
            System.out.println("Armstrong number");
        }
        else {
            System.out.println("Not a armstrong number");
        }
    }
}
