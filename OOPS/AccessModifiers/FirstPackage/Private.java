package OOPS.AccessModifiers.FirstPackage;


public class Private {
    public static void main(String[] args) {
        Student s = new Student();
        // System.out.println(s.marks); this will give rise to error as marks is private and we can't directly access it from outside class.
        s.displayMarks();
    }
}

class Student {
    private int marks = 90;

    void displayMarks() {
        System.out.println("Marks : " + marks);
    }
}