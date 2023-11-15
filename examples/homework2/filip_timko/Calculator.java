package examples.homework2.filip_timko;

public class Calculator {
    public static void main(String[] args) {
        Formulas formulas = new Formulas();

        int Result1 = formulas.add(10, 20);
        System.out.println("Summing (int): " + Result1);

        double dResult1 = formulas.add(10.5, 20.5);
        System.out.println("Summing (double): " + dResult1);

        int Result2 = formulas.subtract(30, 20);
        System.out.println("Subtracting (int): " + Result2);

        double dResult2 = formulas.subtract(30.5, 20.5);
        System.out.println("Subtracting (double): " + dResult2);

        int Result3 = formulas.multiply(10, 20);
        System.out.println("Multiplicating (int): " + Result3);

        double dResult3 = formulas.multiply(10.5, 20.5);
        System.out.println("Multiplicating (double): " + dResult3);

        int Result4 = formulas.divide(20, 10);
        System.out.println("Dividing (int): " + Result4);

        double dResult4 = formulas.divide(20.5, 2.5);
        System.out.println("Dividing (double): " + dResult4);




    }
}
