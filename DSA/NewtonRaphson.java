public class NewtonRaphson {
    public static void main(String[] args) {
        double ans = sqrt(225);
        System.out.printf("%.2f",ans);
    }

    public static double sqrt(int n) {
        double x = n;
        double root = 0;
        while (true) {
            root = 0.5 * (x + n / x);

            if (Math.abs(root - x) < 0.01) {
                break;
            }
            x = root;
        }
        return root;
    }
}
