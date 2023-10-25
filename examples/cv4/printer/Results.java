package examples.cv4.printer;

public class Results {
    public void show(int[] array) {
        // loop for check numbers
        for (int j : array) {
            if (j > 0) {
                System.out.println("Kladné číslo");
            } else if (j < 0) {
                System.out.println("Záporné číslo");
            } else {
                System.out.println("Nula");
            }
        }
    }
}
