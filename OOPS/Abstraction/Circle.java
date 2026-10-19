package OOPS.Abstraction;

public class Circle extends Shape{
    private final int radius;

    public Circle(int radius) {
        this.radius = radius;
    }

    @Override
    double area() {
        return Math.PI * radius * radius;
    }
    
}
