package cv9;

// Outer class
class Outer {
    private int outerData;

    // Member inner class
    public class Inner {
        private int innerData;

        // Constructor for the inner class
        public Inner(int innerData) {
            this.innerData = innerData;
        }

        // Method of the inner class accessing both outer and inner data
        public void display() {
            System.out.println("Outer data: " + outerData);
            System.out.println("Inner data: " + innerData);
        }
    }

    // Method of the outer class that uses the inner class
    public void createInnerAndDisplay(int innerData) {
        Inner inner = new Inner(innerData);
        inner.display();
    }
}

public class InnerClassExample {
    public static void main(String[] args) {
        // Creating an object of the outer class
        Outer outerObject = new Outer();

        // Calling a method of the outer class that utilizes the inner class
        outerObject.createInnerAndDisplay(42);

        // Creating an object of the inner class directly
        Outer.Inner innerObject = outerObject.new Inner(20);
        innerObject.display();
    }
}

