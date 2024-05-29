package IntSortingAlgorithm;

import java.util.Arrays;

public class Test {
    public static void main(String[] args) {
        int[] arr = {3, 5, 4, 1, 3, 8, 10};
        int[] sortedArray = {};
        IntSortingAlgorithm i1 = new IntSortingAlgorithm("Bubble", arr, sortedArray);
        System.out.println(Arrays.toString(i1.sort(arr)));
        System.out.println(i1.isSorted(sortedArray));

    }
}
