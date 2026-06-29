package Strings;

public class Palindrome {
    public static void main(String[] args) {
        String name = "malayalam";
        int i = 0;
        int j = name.length() - 1;
        boolean isPalindrome = true;
        while (i < j) {
            if (name.charAt(i) != name.charAt(j)) {
                isPalindrome = false;
                break;
            }
            i++;
            j--;
        }
        if (isPalindrome) {
            System.out.println("It is Palindrome");
        }
        else {
            System.out.println("It is not a Palindrome");
        }
    }
}
