package cv5;

public class Overloading {
    public static void main(String[] args) {
        MathOperations math = new MathOperations();

        System.out.println("Sum of two integers: " + math.add(5, 3));
        System.out.println("Sum of two doubles: " + math.add(2.5, 3.7));
    }
}
