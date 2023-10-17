package task3;

import java.util.Arrays;

public class Array {
    private String[] array = {"1, 2, 0", "4, 5"};

    public String[] getArray() {
        return array;
    }

    public void setArray(String[] array) {
        this.array = array;
    }

    @Override
    public String toString() {
        return Arrays.toString(array);
    }
}
