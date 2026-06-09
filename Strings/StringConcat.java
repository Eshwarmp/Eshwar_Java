package Strings;

import java.util.ArrayList;

public class StringConcat {
    public static void main(String[] args) {
        System.out.println('a' + 'b'); // Adds ascii value of both a and b
        System.out.println("a" + "b"); // Just b will be concated with a
        System.out.println('a' + 3); // add ascii value of a i.e, 97 with 3 leads to 100
        System.out.println((char) ('a' + 3)); // character value of 100 is d
        System.out.println("a" + 1); // same as "a" + "1" (here int is coverted into Integerf)
        System.out.println("a" + new ArrayList<>()); // This will print, a[] as usual
        System.out.println("a" + new Integer(43)); // returns a43
        // System.out.println(new ArrayList<>() + new Integer(43)); // This will gives error, because 
        // '+' can only be used when it is working with primitives and with the expression containing atleast one
        // string item;
        System.out.println(new ArrayList<>() + "" + new Integer(32)); // This will give []32. 
        // here, '+' operator is better example for operator overloading, because it performs addition with integers
        // concatenation with other ones. and '+' is the only operator which supports operator overloading in Java. 
    }
}
