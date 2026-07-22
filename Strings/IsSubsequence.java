package Strings;

public class IsSubsequence {
    public static void main(String[] args) {
        String s = "acb";
        String t = "ahbgdc";
        int i = 0;
        int j = 0;
        while (i < s.length() && j < t.length()) {
            if (s.charAt(i) != t.charAt(j)) {
                j++;
            } else {
                i++;
                j++;
            }

        }
        if (i == s.length()) {
            System.out.println(true);
            // return;
        }
        else {
            System.out.println(false);
        }
    }
}
