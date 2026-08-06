package BitManipulation;

public class OddEven {
    public static void main(String[] args) {
        int n = 56;
        if ((n & 1) == 0) {
            System.out.println("Even");
        }
        else {
            System.out.println("Odd");
        }
    }
}
