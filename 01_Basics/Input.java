import java.util.Scanner;

public class Input {
    public static void main(String[] args) {
        Scanner user = new Scanner(System.in);
        System.out.println(user.nextLine());
        System.out.println("Enter the roll number: ");
        int rollno = user.nextInt();
        System.out.println("The rollno is " + rollno);
        int a = 322_000_33;
        System.out.println(a);
        System.out.println("Enter your name");
        user.nextLine(); // bcz nextint() only takes one integer and leaves the newline character
        // which eventually skips the next line hence we are adding one extra nextline() to avoid the case
        String name = user.nextLine();
        System.out.println(name);
        user.close();   
    }
}
