package BitManipulation;

public class FirstSetBit {
    public static void main(String[] args) {
        int n = 0b1000;
        int ans = n & (-n);
        int result = (int) (Math.log(ans) / Math.log(2))+1;
        System.out.println(result);
        // System.out.println(Math.log(8));
    }
}
