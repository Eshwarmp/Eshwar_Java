import java.util.Scanner;

public class Input {
    public static void main(String[] args) {
        Scanner user = new Scanner(System.in);
        System.out.println(user.nextLine());
        System.out.println("Enter the roll number: ");
        int rollno = user.nextInt();
        System.out.println("The rollno is "+rollno);
        user.close();
    }
}
