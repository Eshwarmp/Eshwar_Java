package Recursion;

public class SumOfFirstN {
    public static void main(String[] args) {
        int n = 5;
        int ans = sum(5);
        System.out.println("By recursion " + ans);
        int ans1 = add(5);
        System.out.println("By iteration " + ans1);
    }

    public static int add(int n) {
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            sum += i;
        }
        return sum;
    }

    public static int sum(int n) {
        if(n==1){
            return 1;
        }
        return n + sum(n - 1);
    }
}
