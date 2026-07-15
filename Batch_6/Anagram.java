package Batch_6;

import java.util.Arrays;

public class Anagram {
    public static void main(String[] args) {
        String s = "abc";
        String t ="cba";
        char[] a = s.toCharArray();
        char[] b = t.toCharArray();
        
        Arrays.sort(a);
        Arrays.sort(b);

        String c = new String(a);
        String d = new String(b);
        // System.out.println(Arrays.toString(a));
        // System.out.println(Arrays.toString(b));
        // System.out.println(c);
        // System.out.println(d);

        if (c.equals(d)) {
            System.out.println("true");
        }
        else {
            System.out.println("False");
        }
    }

    
}
