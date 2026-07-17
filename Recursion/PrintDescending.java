    package Recursion;

    public class PrintDescending {
        public static void main(String[] args) {
            print(5);
        }

        public static void print(int n) {
            System.out.println(n);
            if (n == 1) {
                return;
            }
            print(n-1);
        }
    }
