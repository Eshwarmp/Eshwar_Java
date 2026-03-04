
import java.util.Scanner;

public class TypeCheck {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the character:");
        char ch = input.next().trim().charAt(0); // Taking only the first index of the string
        if (ch >= 'a' && ch <= 'z') {
            System.out.println("Lower Case");
        }
        else {
            System.out.println("Upper Case");
        }
        input.close();
    }
}
