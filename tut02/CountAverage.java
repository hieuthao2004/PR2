package tutorial_2;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class CountAverage {
    public static void main(String[] args) throws IOException {
        File f = new File("tutorial_2/testdata.txt");
        Scanner scanner = new Scanner(f);
        double sum = 0;
        int i = 0;
        while (scanner.hasNext()) {
            if (scanner.hasNextInt()) {
                double number = scanner.nextInt();
                sum += number;
                i++;
                System.out.println("Subject " + i + " is " + number);
            } else {
                String text = scanner.nextLine();
                System.out.println("Name: " + text);
            }
        }
        System.out.println("The average point is " + sum/i);
        scanner.close();
    }
}
