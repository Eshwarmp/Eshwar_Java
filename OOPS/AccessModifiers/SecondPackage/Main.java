package OOPS.AccessModifiers.SecondPackage;

import OOPS.AccessModifiers.FirstPackage.Students;

public class Main extends Students {
    public static void main(String[] args) {
        Main m = new Main();
        System.out.println(m.marks);
        m.display();
    }
}
