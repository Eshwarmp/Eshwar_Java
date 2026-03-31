
import java.util.Scanner;

public class Switch {
    public static void main(String[] args) {
        // Difference between == and .equals() 
        // == :- checks both value and the reference, if both are true then only it gives true,
        // .equals():- checks only for value, if value is true then the total value is true.

        // 1. Describing fruit
        Scanner in = new Scanner(System.in);
        String fruit = in.next();

        // switch (fruit) {
        //     case "Mango":
        //         System.out.println("King of fruits");
        //         break;
        //     case "Apple":
        //         System.out.println("A Sweet Red Fruit");
        //         break;
        //     default:
        //         System.out.println("Other than Mango and Apple");
        // }
        
        // Enhancced Switch

        switch (fruit) {
            case "Banana" -> System.out.println("It is banana");
            case "Grapes" -> System.out.println("It is grapes");
            default -> System.out.println("Enter valid fruit");
        }

        // 2. Weekday and Weekend
        int day = in.nextInt();
        switch (day) {
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
                System.out.println("Weekdays");
                break;
            case 6:
            case 7:
                System.out.println("Weekend");
                break;
            default:
                System.out.println("Invalid entry");
        }
        switch (day) {
            case 1, 2, 3, 4, 5 -> System.out.println("Weekdday");
            case 6, 7 -> System.out.println("Weekend");
            default -> System.out.println("Invalid");
        }

        // Nested Switch
        int empid = in.nextInt();
        String dep = in.next();
        switch (empid) {
            case 1:
                System.out.println("Employee number is 1");
                break;
            case 2:
                System.out.println("Employee number is 2");
                break;
            case 3:
                System.out.println("Employee number is 3");
                switch (dep) {
                    case "IT":
                        System.out.println("IT department");
                        break;
                    case "HR":
                        System.out.println("HR department");
                        break;
                    case "Management":
                        System.out.println("Management department");
                        break;
                    default:
                        System.out.println("Invalid");
                }
                break;
            default:
                System.out.println("Invalid empid");       
        }
    }

}
