public class Shadow {
    static int a = 2; // class variable, it has the scope all over this class, static is because
    // it is independent of object
    static int b = 3;
    public static void main(String[] args) {
        System.out.println("Class Variable (A): " +a); // Results = 2
        int a = 4; // this is the local variable, which is going to hide the value of class variable
        // a = 2.
        System.out.println("Shadowed Variable (A): " +a); // Results = 4
        System.out.println("Class Variable (B): " +b); // Results = 3
        int b;
        //System.out.println(b); This will provide error, because the local variable shadows the
        // class variable which contains the value 3, but it doesn't have its value
        b = 2;
        System.out.println("Local Varaiable (B): " +b);  // Results = 2
    }
}