package Recursion;

public class NoOfStepsToReduce {
    public static void main(String[] args) {
        /*
        Given an integer num, return the number of steps to reduce it to zero.
        In one step, if the current number is even, you have to divide it by 2, otherwise, 
        you have to subtract 1 from it.
        */
        int n = 14;
        int count = 0;
        while (n > 0) {
            if (n % 2 == 0) {
                n = n / 2;
                count++;
            } else {
                n = n - 1;
                count++;
            }
        }
        System.out.println(count);
        int ans = number(14);
        System.out.println(ans);
    }

    public static int number(int n) {
        if (n == 0) {
            return 0;
        }
        if (n % 2 == 0) {
            
            return 1 + number(n / 2);
            
        }
          
        return 1 + number(n - 1);

    }
}
