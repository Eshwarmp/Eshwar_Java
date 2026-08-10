package BitManipulation;

public class NumberOfSetBits {
    public static void main(String[] args) {
        int n = 45;
        System.out.println("Binary Format : " + Integer.toBinaryString(n));
        int count = 0;
        while (n > 0) {
            if ((n & 1) == 1) {
                count++;
            }
            n = n >> 1;
        }
        System.out.println("Number of SetBits : " + count);
    }
}
