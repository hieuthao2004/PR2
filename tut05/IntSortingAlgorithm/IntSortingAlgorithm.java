package IntSortingAlgorithm;

public class IntSortingAlgorithm {
    private String name;
    private int[] array;
    private int[] sortedArray;

    IntSortingAlgorithm(String name, int[] array, int[] sortedArray) {
        this.name = name;
        this.array = array;
        this.sortedArray = sortedArray;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int[] getArray() {
        return array;
    }

    public void setArray(int[] array) {
        this.array = array;
    }

    public int[] sort(int[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            for (int j = 0; j < array.length - i - 1; j++) {
                if (array[j] > array[j + 1]) {
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }

        sortedArray = array;
        return sortedArray;
    }

    boolean isSorted(int[] sortedArray) {
        boolean result = true;
        for (int i = 0; i < sortedArray.length - 1; i++) {
            for (int j = 0; j < sortedArray.length - i - 1; j++) {
                if (sortedArray[j] > sortedArray[j + 1]) {
                    return result;
                } else {
                    result = false;
                }
            }
        }
        return result;
    }

    @Override
    public String toString() {
        // TODO Auto-genokerated method stub
        return super.toString();
    }
}
