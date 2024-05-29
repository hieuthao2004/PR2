import java.util.Scanner;

public class PyramidPrinting {
    public static void pascalPyramid(int rows) {
        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= rows - i; j++) {
                System.out.print("   ");
            }
            for (int k = i; k >= 1; k--) {
                System.out.print(k + "  ");
            }
            for (int l = 2; l <= i; l++) {
                System.out.print(l + "  ");
            }
            System.out.println();
        }
    }

    public static void halfLeftPyramid(int rows) {
        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println(); 
        }
    }
    

    public static void halfRightPyramid(int rows) {      
        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= rows - i; j++) {
                System.out.print(" "); 
            }
            for (int k = 1; k <= i; k++) {
                System.out.print("*");
            }
    
            System.out.println(); 
        }
    }

    public static void fullPyramid(int rows) {
        
        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= rows - i; j++) {
                System.out.print(" "); 
            }
            for (int k = 1; k <= 2 * i - 1; k++) {
                System.out.print("*");
            }
            System.out.println(); 
        }
    }    

    public static void invertedHalfRightPyramid(int rows) {
        for (int i = rows; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println(); 
        }
    }

    public static void invertedHalfLeftPyramid(int rows) {
        for (int i = rows; i >= 1; i--) {
            for (int j = 1; j <= rows - i; j++) {
                System.out.print(" "); 
            }
            for (int k = 1; k <= i; k++) {
                System.out.print("*");
            }
            System.out.println(); 
        }
    }

    public static void invertedFullPyramid(int rows) {
        for (int i = rows; i >= 1; i--) {
            for (int j = 1; j <= rows - i; j++) {
                System.out.print(" "); 
            }
            for (int k = 1; k <= 2 * i - 1; k++) {
                System.out.print("*");
            }
            System.out.println(); 
        }
    }

    public static void multipleOfTwoPyramid(int rows) {
        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= rows - i; j++) {
                System.out.print("  ");
            }
            for (int k = 1; k <= 2 * i - 1; k++) {
                int multipleOfTwo = 2 * k;
                System.out.print(multipleOfTwo + " ");
            }
            System.out.println(); 
        }
    }

    public static void floydTriangle(int rows) {
            int number = 1;
            for (int i = 1; i <= rows; i++) {
                for (int j = 1; j <= i; j++) {
                    System.out.print(number + " ");
                    number++; 
                }
                System.out.println();
            }   
    }
      
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int option;
        while (true) {
            System.out.println("1. Half-Right Pyramid\r\n" + //
                                "2. Half-Left Pyramid\r\n" + //
                                "3. Full Pyramid\r\n" + //
                                "4. Inverted Half-Right Pyramid\r\n" + //
                                "5. Inverted Half-Left Pyramid\r\n" + //
                                "6. Inverted Full Pyramid\r\n" + //
                                "7. Pascal Pyramid\r\n" + //
                                "8. Floyd's Pyramid\r\n" + //
                                "9. Pyramid with Multiple of 2");
            option = sc.nextInt();
            switch (option) {
                case 1:
                    System.out.print("Enter the number of rows for the pyramid: ");
                    int rows = sc.nextInt();
                    halfRightPyramid(rows);
                    break;
                case 2:
                    System.out.print("Enter the number of rows for the pyramid: ");
                    rows = sc.nextInt();
                    halfLeftPyramid(rows);
                    break;
                case 3:
                    System.out.print("Enter the number of rows for the pyramid: ");
                    rows = sc.nextInt();
                    fullPyramid(rows);
                    break;
                case 4:
                    System.out.print("Enter the number of rows for the pyramid: ");
                    rows = sc.nextInt();
                    invertedHalfLeftPyramid(rows);
                    break;
                case 5:
                    System.out.print("Enter the number of rows for the pyramid: ");
                    rows = sc.nextInt();
                    invertedHalfRightPyramid(rows);
                    break;
                case 6:
                    System.out.print("Enter the number of rows for the pyramid: ");
                    rows = sc.nextInt();
                    invertedFullPyramid(rows);
                    break;
                case 7:
                    System.out.print("Enter the number of rows for the pyramid: ");
                    rows = sc.nextInt();
                    pascalPyramid(rows);
                    break;
                case 8:
                    System.out.print("Enter the number of rows for the pyramid: ");
                    rows = sc.nextInt();
                    floydTriangle(rows);
                    break;
                case 9:
                    System.out.print("Enter the number of rows for the pyramid: ");
                    rows = sc.nextInt();
                    multipleOfTwoPyramid(rows);
                    break;
                case 10:
                    System.out.println("Ending program!");
                    return;
                default:
                    System.out.println("Invalid option");
                    break;
            }

        }
    }
}
