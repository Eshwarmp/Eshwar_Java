public class Factor {
    public static void main(String[] args) {
        int n = 99;
        int count = 0;
        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                count++;
                System.out.print(i + " ");
            }
        }
        System.out.println();
        System.out.println("The number of factors is " + (count));
    }
}
