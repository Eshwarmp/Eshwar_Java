
import java.util.Scanner;

public class Warmup {
    public static void main(String[] args) {

        // 1. Area of a Circle
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the radius of the circle:");
        float radius = in.nextFloat();
        float area = 3.14f * radius * radius;
        System.out.println("The area of the circle is " + area);
        
        // 2. Even or Odd
        System.out.println("Enter the number to find even or odd");
        int number = in.nextInt();
        if (number % 2 == 0) {
            System.out.println("Even number");
        }
        else {
            System.out.println("Odd number");
        }
        
        // 3. Print Numbers 1 to N
        System.out.println("Enter the value of n ");
        int n = in.nextInt();
        for (int i = 1; i <= n; i++) {
            System.out.println(i);
        }

        // 4. Sum of First N Numbers
        System.out.println("Enter the value of N");
        int N = in.nextInt();
        int sum = 0;
        for (int i = 1; i <= N; i++) {
            sum = sum + i;
        }
        System.out.println("The sum of first " + N + " numbers is " + sum);
        
        // 5. Factorial of a Number
        System.out.println("Enter the number to find its factorial");
        int num = in.nextInt();
        int fact = 1;
        while (num > 0) {
            fact = fact * num;
            num--;
        }
        System.out.println("The factorial of the given number is " + fact);
        
        // 6. Count Digits in a Number
        System.out.println("Enter the number ");
        int value = in.nextInt();
        int count = 0;
        while (value>0) {
            int lastDigit = value % 10;
            count++;
            value /= 10;
        }
        System.out.println(count);

        // 7. Sum of digits in a number
        System.out.println("Enter the number to find the sum of digits in number");
        int digit = in.nextInt();
        int add = 0;
        while (digit>0) {
            int endDigit = digit % 10;
            add = add + endDigit;
            digit /= 10;
        }
        System.out.println("The sum of digits is " +add);

        // 8. Product of digits
        System.out.println("Enter the number to print the product of the digits");
        int product = in.nextInt();
        int multiply = 1;
        while (product > 0) {
            int endDigit = product % 10;
            multiply = multiply * endDigit;
            product /= 10;
        }
        System.out.println("Product of digits is " + multiply);
        
        // 9. Check whether number is palindrome or not
        System.out.println("Enter the number to check whether it is palindrome or not");
        int original = in.nextInt();
        int temp = original;
        int rev = 0;
        while (temp > 0) {
            int lastDigit = temp % 10;
            rev = rev * 10 + lastDigit;
            temp /= 10;
        }
        if (rev == original) {
            System.out.println("Number is palindrome");
        }
        else {
            System.out.println("Number is not palindrome");
        }

        // 10. Largest digit in a number
        System.out.println("Enter the number to find largest digit in it");
        int numb = in.nextInt();
        int large = numb % 10;
        while (numb > 0) {
            int last = numb % 10;
            if (last > large) {
                large = last;
            }
            numb /= 10;
        }
        System.out.println(large);
    }
}
