
import java.util.Scanner;

public class Conditionals {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the salary :");
        int salary = input.nextInt();
        
        // If - Else Statement
        if (salary > 10000) {
            salary = salary + 5000;
        }
        else {
            salary = salary + 3000;
        }
        System.out.println("The updated salary is :" + salary);
        
        // Multiple If-Else statements
        System.out.println("Enter the marks :");
        int marks = input.nextInt();
        if (marks > 85) {
            System.out.println("Distinction");
        }
        else if (marks > 60) {
            System.out.println("Second Class");
        }
        else if (marks > 35) {
            System.out.println("Pass");
        }
        else {
            System.out.println("Fail");
        }
        input.close();
    }
}
