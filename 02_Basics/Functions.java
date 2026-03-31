
import java.util.Scanner;

public class Functions {
    public static void main(String[] args) {
        sum();
        int ans = add(); // Returning the value from the add() function and storing it in ans.
        System.out.println("The sum of the two numbers is "+ans);
    }
    
    static void sum() {
        Scanner in = new Scanner(System.in);
        int num1, num2, sum;
        System.out.print("Enter first number: ");
        num1 = in.nextInt();
        System.out.print("Enter second number: ");
        num2 = in.nextInt();
        sum = num1 + num2;
        System.out.println("The sum is " + sum);
    }
    
    // Returning the value
    static int add (){
        Scanner in = new Scanner(System.in);
        int n1, n2, sum ;
        System.out.print("Enter first number: ");
        n1 = in.nextInt();
        System.out.println("Enter second number: ");
        n2 = in.nextInt();
        sum = n1 + n2;
        return sum;
    }
}
