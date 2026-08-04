package Recursion;

public class FibFormula {
    public static void main(String[] args) {
        int n = 4;
        for (int i = 0; i < 11; i++) {
            int ans =  (int) Math.round((Math.pow((1 + Math.sqrt(5)) / 2, i) / Math.sqrt(5)));
            System.out.println(ans);
        }
    }
}
