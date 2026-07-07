package Strings;

public class ValidPalindrome {
    public static void main(String[] args) {
        String s = " A man, is the Stone";
        s = s.toLowerCase();
        s = s.replaceAll("[^a-zA-z0-9]", "");
        int i = 0;
        int j = s.length() - 1;
        boolean isPalindrome = true;
        while (i < j) {
            if (s.charAt(i) != s.charAt(j)) {
                isPalindrome = false;
                break;
            }
            i++;
            j--;
        }
        System.out.println(isPalindrome);
        System.out.println(s);
    }
}
