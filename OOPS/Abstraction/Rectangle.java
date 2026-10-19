package OOPS.Abstraction;

public class Rectangle extends Shape{
    private final int length;
    private final int width;

    public Rectangle(int length, int width) {
        this.length = length;
        this.width = width;
    }

    @Override
    double area() {
        return length * width;
    }

}
