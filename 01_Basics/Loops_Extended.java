import java.util.Scanner;

public class Loops_Extended {
    public static void main(String[] args) {
        // Do while loop : It executes the body of the loop atleast once, no matter what the condition
        // is, then it checks for the condition.
        int n = 1;
        do { 
            System.out.println(n);
            n++;
        } while (n < 6);


        Scanner letter = new Scanner(System.in);
        while (true) {
            System.out.println("Enter the character :");
            String ch = letter.next();
            if (ch.equals("x")) {
                System.out.println("x found");
                break;
            }
            System.out.println(ch);
        }
        letter.close();
        
    }
}
