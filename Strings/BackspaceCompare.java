package Strings;

public class BackspaceCompare {
    public static void main(String[] args) {
        String s = "ab##";
        String t = "c#d#";
        int i = s.length() - 1;
        int j = t.length() - 1;
        int skip = 0;
        int skipT = 0;
        
        while (i >= 0 || j >= 0) {
            while (i >= 0) {
                if (s.charAt(i) == '#') {
                    skip++;
                    i--;
                } else {
                    if (skip > 0) {
                        skip--;
                        i--;
                    } else {
                        break;
                    }
                }
            }
            while (j >= 0) {
                if (t.charAt(j) == '#') {
                    skipT++;
                    j--;
                } else {
                    if (skipT > 0) {
                        skipT--;
                        j--;
                    } else {
                        break;
                    }
                }
            }
            if (i >= 0 != j >= 0) {
                System.out.println(false);
                return;
            }
            if (i >= 0 && j >= 0) {
                if (s.charAt(i) != t.charAt(j)) {
                    System.out.println(false);
                    return;
                }
            }
            // else {
            //     System.out.println(true);
            // }
            i--;
            j--;

        }
        System.out.println(true);
    }
}
