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
        if (isPalindrome == true) {
            System.out.println("Palindrome");
        }
        else {
            System.out.println("Not a palindrome");
        }
    }
}
