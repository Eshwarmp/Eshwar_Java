public class Euclidian {
    public static void main(String[] args) {
        System.out.println("HCF : " + gcd(4, 5));
        System.out.println("LCM : " +lcm(4, 5));
    }
    
    public static int gcd(int a, int b) {
        if (a == 0) {
            return b;
        }
        return gcd(b % a, a);
    }

    public static int lcm(int a, int b) {
        return a * b / gcd(a, b);
    }
}
