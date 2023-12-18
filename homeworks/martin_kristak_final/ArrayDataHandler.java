package homeworks.martin_kristak_final;

import java.util.Arrays;
import java.util.Scanner;

interface DataHandler {
    void add(String name);
    void delete(String name);
    boolean contains(String name);
}

class ArrayDataHandler implements DataHandler {
    String[] names;
    int count;

    public ArrayDataHandler(int size) {
        names = new String[size];
        count = 0;
    }

    @Override
    public void add(String name) {
        if (count >= names.length) {
            throw new IllegalStateException("No space left in the array.");
        }
        names[count++] = name;
    }

    @Override
    public void delete(String name) {
        for (int i = 0; i < count; i++) {
            if (names[i].equals(name)) {
                for (int j = i; j < count - 1; j++) {
                    names[j] = names[j + 1];
                }
                count--;
                return;
            }
        }
        throw new IllegalArgumentException("Name not found.");
    }

    @Override
    public boolean contains(String name) {
        for (int i = 0; i < count; i++) {
            if (names[i].equals(name)) {
                return true;
            }
        }
        return false;
    }
}

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayDataHandler dataHandler = new ArrayDataHandler(100);

        while (true) {
            System.out.print("Enter a command: ('add', 'delete', 'find', 'sort', 'quit'): ");
            String command = scanner.nextLine();

            if (command.equalsIgnoreCase("quit")) {
                break;
            }

            try {
                if (command.equalsIgnoreCase("add")) {
                    System.out.print("Enter the name: ");
                    String name = scanner.nextLine();
                    dataHandler.add(name);
                } else if (command.equalsIgnoreCase("delete")) {
                    System.out.print("Enter the name: ");
                    String name = scanner.nextLine();
                    dataHandler.delete(name);
                } else if (command.equalsIgnoreCase("find")) {
                    System.out.print("Enter the name: ");
                    String name = scanner.nextLine();
                    System.out.println(dataHandler.contains(name) ? "Found!" : "Not found.");
                } else if (command.equalsIgnoreCase("sort")) {
                    String[] names = Arrays.copyOf(dataHandler.names, dataHandler.count);
                    Arrays.sort(names);
                    System.out.println("Sorted names: " + Arrays.toString(names));
                } else {
                    System.out.println("Unknown command. Please try again.");
                }
            } catch (Exception e) {
                System.out.println("Error: " + e.getMessage());
            }
        }
    }
}
