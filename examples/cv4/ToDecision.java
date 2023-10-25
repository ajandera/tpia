package examples.cv4;

public class ToDecision {
    int[] array;

    // Constructor
    public ToDecision(int size) {
        this.array = new int[size];
    }

    void addNumber(int number, int position) {
        this.array[position] = number;
    }

    int[] getValues() {
        return this.array;
    }
}
