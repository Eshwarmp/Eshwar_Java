package BitManipulation;

public class FindithBit {
    public static void main(String[] args) {
        int n = 6;
        int i = 2;
        int ans = n & (1 << (i - 1));
        if (ans == 0) {
            System.out.println(  0);
        }
        else {
            System.out.println( 1);
        }
    }
}
