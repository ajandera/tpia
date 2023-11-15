package cv9;

// Abstract class
abstract class Shape {
    // Abstract method (no implementation)
    public abstract double calculateArea();

    // Concrete method with implementation
    public void display() {
        System.out.println("This is a shape.");
    }
}

// Concrete subclass extending the abstract class
class Circle extends Shape {
    private double radius;

    // Constructor
    public Circle(double radius) {
        this.radius = radius;
    }

    // Implementation of the abstract method
    @Override
    public double calculateArea() {
        return Math.PI * radius * radius;
    }
}

// Concrete subclass extending the abstract class
class Rectangle extends Shape {
    private double length;
    private double width;

    // Constructor
    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    // Implementation of the abstract method
    @Override
    public double calculateArea() {
        return length * width;
    }
}

public class AbstractExample {
    public static void main(String[] args) {
        // Creating objects of concrete subclasses
        Circle circle = new Circle(5.0);
        Rectangle rectangle = new Rectangle(4.0, 6.0);

        // Calling methods on abstract class and concrete subclasses
        circle.display();
        System.out.println("Area of circle: " + circle.calculateArea());

        rectangle.display();
        System.out.println("Area of rectangle: " + rectangle.calculateArea());
    }
}

