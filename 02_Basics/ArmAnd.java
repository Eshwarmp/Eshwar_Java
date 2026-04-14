public class ArmAnd {
    public static void main(String[] args) {
        System.out.println("Prime number from 2 to 100");
        for (int n = 2; n < 100; n++) {
            int count = 0;
            for (int i = 1; i * i <= n; i++) {
                if (n % i == 0) {
                    count++;
                }
            }
            if (count == 1) {
                System.out.print(" "+n);
            }
        }
        System.out.println("\nArmstron number from 100 to 1000");
        for (int num = 100; num < 1000; num++) {
            int sum = 0;
            int temp = num;
            while (temp > 0) {
                int digit = temp % 10;
                sum = sum + (int) Math.pow(digit, 3);
                temp /= 10;
            }
            if (sum == num) {
                System.out.print(" "+num);
            }
        }
    }
}