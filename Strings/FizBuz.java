
import java.util.ArrayList;

public class FizBuz {
    public static void main(String[] args) {
        ArrayList<String> arr = new ArrayList<>();
        int n = 5;
        for (int i = 1; i <= n; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                arr.add("fizbuz");
            } else if (i % 3 == 0) {
                arr.add("fiz");
            } else if (i % 5 == 0) {
                arr.add("buz");
            } else {
                arr.add(String.valueOf(i));
            }
        }
        System.out.println((arr));
    }
}
