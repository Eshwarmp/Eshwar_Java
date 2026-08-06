package BitManipulation;

public class PowerOfTwo {
    public static void main(String[] args) {
        int n = 0;
        // int noOfBits = noOfBits(n);
        // System.out.println(noOfBits);
        // if (1 << (noOfBits - 1) == n) {
        //     System.out.println("Power Of Two");
        // }
        // else {
        //     System.out.println("Not");
        // }
        // The best way to do it is n & (n - 1)
        String ans = (n > 0 && (n & (n - 1)) == 0) ? "true" : "false";
        System.out.println(ans);
    }

    public static int noOfBits(int n) {
        int count = 0;
        while (n > 0) {
            count++;
            n = n>>1;
        }
        return count;
    }
}
