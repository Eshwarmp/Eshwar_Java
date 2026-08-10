package BitManipulation;

public class XOR_Range {
    public static void main(String[] args) {
        // Find the XOR values from a to b
        int a = 3;
        int b = 9;
        int ans = XOR(b) ^ XOR(a - 1);
        System.out.println(ans);
    }

    public static int XOR(int n) {
        if (n % 4 == 0) {
            return n;
        }
        else if (n % 4 == 1) {
            return 1;
        }
        else if (n % 4 == 2) {
            return n + 1;
        }
        return 0;
    }
}
