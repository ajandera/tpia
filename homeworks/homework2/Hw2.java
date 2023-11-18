package homework2;

interface Math {
    int add(int a, int b);

    double add(double a, double b);

    int subtract(int a, int b);

    double subtract(double a, double b);

    int multiply(int a, int b);

    double multiply(double a, double b);

    int divide(int a, int b);

    double divide(double a, double b);
}

public class Hw2 implements Math {
    @Override
    public int add(int a, int b) {
        return a + b;
    }
    @Override
    public double add(double a, double b) {
        return a + b;
    }
    @Override
    public int subtract(int a, int b) {
        return a - b;
    }
    @Override
    public double subtract(double a, double b) {
        return a - b;
    }
    @Override
    public int multiply(int a, int b) {
        return a * b;
    }
    @Override
    public double multiply(double a, double b) {
        return a * b;
    }
    @Override
    public int divide(int a, int b) {
        if (b != 0) {
            return a / b;
        } else {
            System.out.println("Cannot divide by zero.");
            return 0;
        }
    }
    @Override
    public double divide(double a, double b) {
        if (b != 0) {
            return a / b;
        } else {
            System.out.println("Cannot divide by zero.");
            return 0;
        }
    }

    public static void main(String[] args) {
        Hw2 calculator = new Hw2();

        System.out.println("Adding integers: " + calculator.add(5, 3));
        System.out.println("Adding doubles: " + calculator.add(2.5, 3.7));
        System.out.println("Subtracting integers: " + calculator.subtract(8, 2));
        System.out.println("Subtracting doubles: " + calculator.subtract(5.2, 1.8));
        System.out.println("Multiplying integers: " + calculator.multiply(4, 6));
        System.out.println("Multiplying doubles: " + calculator.multiply(2.5, 3.0));
        System.out.println("Dividing integers: " + calculator.divide(10, 2));
        System.out.println("Dividing doubles: " + calculator.divide(5.0, 2.5));
        System.out.println("Dividing by zero: " + calculator.divide(10.0, 0.0));
    }
}

