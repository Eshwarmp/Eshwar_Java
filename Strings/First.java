package Strings;

public class First {
    public static void main(String[] args) {

        // Strings are immutable in Java bcz of security reasons.

        String a = "Je";
        String b = "Je";

        // Here both 'a' and 'b' are poiting towards the same "Je" which is present in the String Pool.

        System.out.println(a == b); // True bcz both a and b reference variables pointing towards same value.
        System.out.println((a.equals(b))); // True bcz both a and b contain same value

        String c = new String("Je");
        System.out.println(a == c); // False bcz reference variables are pointing different as here we createt separat
        // new string with new keyword
        System.out.println((a.equals(c))); // True bcz both holds same value.

        // PrettyPrinting

        float f = 423.2345f;
        System.out.printf("Formatted float %.2f", f);
        System.out.println();
        System.out.printf("Hello, my name is %s and I am %s", "Eshwar", "Man");

        // %d -> Integer
        // %s -> String
        // %f -> Float and others..
    }
}
