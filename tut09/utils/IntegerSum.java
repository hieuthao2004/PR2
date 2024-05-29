import java.util.Scanner;

import exceptions.EmptyLineException;

public class IntegerSum {
    public static boolean isValid(String s) throws Exception {
        String[] list = s.split(" ");
        int countSpace = 0;
        for (int i = 0; i < list.length; i++) {
            if (list[i].isEmpty()) {
                countSpace++;
            }
        }

        if (countSpace > 0) {
            throw new NumberFormatException("Invalid format");
        } else if ((s == null) || (s.equals("")) || (s.equals(" "))) {
            throw new EmptyLineException("Empty input");
        } else {
            return true;
        }
    }

    public static String[] returnList(String s) throws Exception {
        String[] list = s.split(" ");
        if (isValid(s)) {
            return list;
        } else {
            return null;
        }
    }

    public static int sum(String[] list) {
        int sum = 0;
        for (int i = 0; i < list.length; i++) {
            int index = Integer.parseInt(list[i]);
            sum += index;
        }
        return sum;
    }

    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of integers: ");
        boolean validInput = false;
        String s;
        do {
            try {
                System.out.print("Enter the integer numbers separated by a single space: ");
                s = sc.nextLine();
                validInput = isValid(s);
                System.out.println(sum(returnList(s)));
            } catch (Exception e) {
                System.out.println(e.getMessage());
                validInput = false;
            }
        } while (!validInput);
        sc.close();
    }
}
