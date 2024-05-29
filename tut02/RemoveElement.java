package tutorial_2;

import java.util.ArrayList;
import java.util.Arrays;

public class RemoveElement {
    static ArrayList<Integer> removeElement(ArrayList<Integer> al, int val) {
        
        for (int i = 0; i < al.size(); i++) {
            if (al.get(i) == val) {
                al.remove(i);
                i--;
            }
        }
        return al;
    }

    public static long divide(int dividend, int divisor) {
        long count = 0;
        long new_dividend = Math.abs(dividend);
        long new_divisor = Math.abs(divisor);
        while (new_dividend >= new_divisor) {
            new_dividend -= new_divisor;
            count++;
        }
        if (dividend * divisor < 0) {
            count *= -1;
        }
        return count;
    }

    public static long divide1(int dividend, int divisor) {
        long count = 0;
        long new_dividend = Math.abs(dividend);
        long new_divisor = Math.abs(divisor);

        if (dividend * divisor < 0) {
            if (dividend < 0) {
                new_dividend = dividend*-1;

                System.out.println(new_dividend);
            } else if (divisor < 0) {
                new_divisor = divisor * -1;
            }
        } else {
            if (dividend < 0 && divisor < 0) {
                new_dividend *= -1;
                new_divisor *= -1;
            }
        }

        while (new_dividend >= new_divisor) {
            new_dividend -= new_divisor;
            count++;
        }
        if (dividend * divisor < 0) {
            count *= -1;
        }
        return count;
    }

    public static void main(String[] args) {
        // ArrayList<Integer> al = new ArrayList<>(Arrays.asList(0,1,2,2,3,0,4,2));
        // int val = 2;
        // removeElement(al, val);
        // System.out.println(al.size());
        // System.out.println(al);


        System.out.println("Ket qua la " + divide1(-2147483648, -1));


    }
}
