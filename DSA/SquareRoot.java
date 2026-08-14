public class SquareRoot {
    public static void main(String[] args) {
        int n = 225;
        for (int i = 1; i * i <= n; i++) {
            if (i * i == n) {
                System.out.println(i);
                return;
            }
        }
        System.out.println("This is not a perfect square");
    }
}
