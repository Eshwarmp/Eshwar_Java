package BitManipulation;

public class SetithBit {
    public static void main(String[] args) {
        int n = 5; // 101 
        int i = 2;
        int ans = n | (1 << (i - 1));
        System.out.println(ans);
    }
}
