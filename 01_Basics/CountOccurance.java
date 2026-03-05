
import java.util.Scanner;

public class CountOccurance {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        // By converting it into string
        System.out.println("Enter the number:");
        String number = in.next();
        System.out.println("Enter the digit of which the occurance is to find");
        char n = in.next().charAt(0);
        int count = 0;
        for (int i = 0; i < number.length(); i++) {
            if (number.charAt(i) == n) {
                count++;
            }
        }
        System.out.println(count);
        
        // Other way (Without converting it into string)
        System.out.println("Enter the number:");
        int num = in.nextInt();
        System.out.println("Enter the digit to find");
        int key = in.nextInt();
        int occurance = 0;
        while (num > 0) {
            int lastDigit = num % 10;
            if (lastDigit == key) {
                occurance++;
            }
            num /= 10;
        }
        System.out.println(occurance);
        in.close();
    }
}
