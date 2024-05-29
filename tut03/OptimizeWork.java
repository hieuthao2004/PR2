package tutorial_3;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

public class OptimizeWork {
    public static void printNos(int x) {
        if (x > 0) {
            printNos(x - 1);
            System.out.print(x + " ");
        }
    }

    public static void main(String[] args) {
        printNos(5);
    }
}
