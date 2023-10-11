package examples.cv2;

public class Example2b {
    public static void main(String[] args) {
        // array definition
        int[] array = new int[]{-5, 3, -1, 0, 6, 9, 10, -5};

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
