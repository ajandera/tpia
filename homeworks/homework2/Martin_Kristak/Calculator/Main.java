// Main.java

package examples.homework2.Martin_Kristak.Calculator;

import examples.homework2.Martin_Kristak.Calculator.Calculator;

public class Main {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();

        // Integer operations
        System.out.println("Integer addition: " + calculator.add(3, 5));
        System.out.println("Integer subtraction: " + calculator.subtract(10, 3));
        System.out.println("Integer multiplication: " + calculator.multiply(4, 5));
        System.out.println("Integer division: " + calculator.divide(15, 3));

        // Double operations
        System.out.println("Double addition: " + calculator.add(3.5, 4.5));
        System.out.println("Double subtraction: " + calculator.subtract(10.0, 3.5));
        System.out.println("Double multiplication: " + calculator.multiply(4.5, 5.5));
    }
}
