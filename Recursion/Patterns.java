package Recursion;

public class Patterns {
    public static void main(String[] args) {
        System.out.println("Through iterative method ");
        pattern1(5);
        System.out.println("Through recursive method");
        pattern1Recursion(5, 0);
    }

    public static void pattern1(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n - i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    
    public static void pattern1Recursion(int row, int col) {
        if (row == 0) {
            return;
        }
        if (col < row) {
            System.out.print("* ");
            pattern1Recursion(row, col + 1);
        }
        else {
            System.out.println();
            pattern1Recursion(row-1, 0);
        }
    }
}
