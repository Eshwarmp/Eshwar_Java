package BitManipulation;

public class ReverseBits {
    public static void main(String[] args) {
        int n = 43261596;
        int ans = 0;
        for (int i = 0; i < 32; i++) {
            int bit = n & 1;
            n = n >> 1;
            ans = ans << 1;
            ans = ans | bit;
        }
        System.out.println(ans);
    }
}
