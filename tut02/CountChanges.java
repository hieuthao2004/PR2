package tutorial_2;

import java.util.Scanner;

public class CountChanges {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        System.out.println("Quarter: ");
        double quarter = sc.nextDouble();
        double a  = quarter * 25;
        System.out.println("Dim: ");
        double dim = sc.nextDouble();
        double b = dim * 10;
        System.out.println("Nickel: ");
        double nickel = sc.nextDouble();
        double c = nickel * 5;
        System.out.println("Penny: ");
        double penny = sc.nextDouble();
        double d = penny * 1;
        double sum = a + b + c + d;
        double dollar = sum/100;
        System.out.println(dollar);
        sc.close();
    }
}
