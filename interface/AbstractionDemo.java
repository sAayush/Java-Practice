interface Shape {
    double getArea();
}

class Rectangle implements Shape {
    private double length;
    private double width;

    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    public double getArea() {
        return length * width;
    }
}

class Circle implements Shape {
    private double radius;
    private final double pi = 3.14;

    public Circle(double radius) {
        this.radius = radius;
    }

    public double getArea() {
        return pi * radius * radius;
    }
}

public class AbstractionDemo {
    public static void main(String[] args) {
        Shape shape1 = new Rectangle(5, 3);
        System.out.println("Area of rectangle: " + shape1.getArea());

        Shape shape2 = new Circle(7);
        System.out.println("Area of circle: " + shape2.getArea());
    }
}
