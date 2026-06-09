package Strings;

import java.util.Arrays;

public class Methods {
    public static void main(String[] args) {
        String name = "Eshwar M P";
        System.out.println(name);
        System.out.println(Arrays.toString(name.toCharArray()));
        System.out.println(name.toUpperCase());
        System.out.println(name.toLowerCase());
        System.out.println(name); // Proof of immutablity of string
        System.out.println("    Eshwar  ".strip()); // removes unnecessary spaces
        System.out.println(Arrays.toString(name.split(" ")));// Separates string when the space occurs
        System.out.println(name.indexOf('a'));
        System.out.println(name.lastIndexOf('a'));

    }
}
