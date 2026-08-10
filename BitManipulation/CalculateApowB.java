package BitManipulation;

public class CalculateApowB {
    public static void main(String[] args) {
        int a = 2;
        int b = 0;
        int ans = 1;
        while (b > 0) {
            if ((b & 1) == 1) {
                ans = ans * a;
            }
            b = b >> 1;
            a = a * a;
        }
        System.out.println(ans);
    }
}
