package BitManipulation;

public class PrimeNumbers {
    public static void main(String[] args) {
        // int num = 15;
        // boolean ans = isPrime(num);
        // System.out.println(ans);
        for (int n = 2; n < 15; n++) {
            boolean isPrime = true;
            for (int j = 2; j <= Math.sqrt(n); j++) {
                if (n % j == 0) {
                    isPrime = false;
                    break;
                }
            }
            if (isPrime) {
                System.out.println(n);
            }
        }
        // System.out.println("Prime number");

    }
    
    public static boolean  isPrime(int n) {
        int start = 2;
        while (start * start <= n) {
            if (n % start == 0) {
                return false;
            }
            start++;
        }
        return true;
    }
}
