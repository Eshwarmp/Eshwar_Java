
import java.util.ArrayList;

public class OptimizedFactor {
    public static void main(String[] args) {
        // Optimized way for printing all the factors of a number with both time and space 
        // complexity equals to O(sqrt(N))
        int n = 36;
        factor(n);
    }

    public static void factor(int n) {
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 1; i * i <= n; i++) {
            if (n % i == 0) {
                if (n / i == i) {
                    System.out.print(i + " ");
                } else {
                    System.out.print(i + " ");
                    list.add(n / i);
                }
            }
        }
        for (int i = list.size()-1; i >= 0; i--) {
            System.out.print(list.get(i) + " ");
        }
    }
}
