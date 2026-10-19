package OOPS.AccessModifiers.FirstPackage;

public class Main extends Students {
    public static void main(String[] args) {
        Students s = new Students();
        System.out.println(s.marks);
        s.display();
    }
}
