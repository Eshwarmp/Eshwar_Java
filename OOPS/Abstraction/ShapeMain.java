package OOPS.Abstraction;

public class ShapeMain {
    public static void main(String[] args) {
        Shape s = new Circle(7);
        System.out.printf("The area of the circle is %.2f\n" , s.area());

        s = new Rectangle(2, 4);
        System.out.println("The area of the rectangle is " + s.area());
    }
}
