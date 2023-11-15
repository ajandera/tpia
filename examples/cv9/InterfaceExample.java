package cv9;

// Interface
interface Drawable {
    // Method signatures (no implementation)
    void draw();
    void resize(int percentage);
}

// Class implementing the interface
class Circle2 implements Drawable {
    private double radius;

    // Constructor
    public Circle2(double radius) {
        this.radius = radius;
    }

    // Implementation of the draw method
    @Override
    public void draw() {
        System.out.println("Drawing a circle.");
    }

    // Implementation of the resize method
    @Override
    public void resize(int percentage) {
        radius = radius * (1 + percentage / 100.0);
        System.out.println("Resizing the circle to a new radius: " + radius);
    }
}

// Class implementing the interface
class Square implements Drawable {
    private double side;

    // Constructor
    public Square(double side) {
        this.side = side;
    }

    // Implementation of the draw method
    @Override
    public void draw() {
        System.out.println("Drawing a square.");
    }

    // Implementation of the resize method
    @Override
    public void resize(int percentage) {
        side = side * (1 + percentage / 100.0);
        System.out.println("Resizing the square to a new side length: " + side);
    }
}

public class InterfaceExample {
    public static void main(String[] args) {
        // Creating objects of classes implementing the interface
        Circle2 circle = new Circle2(5.0);
        Square square = new Square(4.0);

        // Calling methods defined in the interface
        circle.draw();
        circle.resize(20);

        square.draw();
        square.resize(15);
    }
}

