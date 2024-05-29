import java.util.Scanner;

import exceptions.EmptyLineException;
import exceptions.InvalidInputException;
import exceptions.WordLengthException;

public class TextIO {
    public static boolean isInteger(String input) throws Exception {
        if ( (input == null) || (input.equals(" ")) || (input.equals("")) ) {
            throw new EmptyLineException("Empty input");
        } else if (input.equals("0")) {
            throw new Exception("Not integer");
        } else {
            try {
                Integer.parseInt(input);
                return true;
            } catch (NumberFormatException e) {
                throw new NumberFormatException("Invalid Integer");
            }
        }
    }

    public static boolean isFloats(String input) throws Exception {
        if ( (input == null) || (input.equals(" ")) || (input.equals("")) ) {
            throw new EmptyLineException("Empty input");
        } else if (input.equals(0)) {
            throw new Exception("Not integer");
        } else {
            try {
                Float.parseFloat(input);
                return true;
            } catch (NumberFormatException e) {
                throw new NumberFormatException("Invalid Float");
            }
        }
    }

    public static boolean isWord(String input) throws Exception {
        String regex = "^[a-zA-Z]+$";
        if ((input == null) || (input.equals(" ")) || (input.equals(""))) {
            throw new EmptyLineException("Empty input");
        } else if (!input.matches(regex)) {
            throw new InvalidInputException("Not word");
        } else if (input.length() > 45) {
            throw new WordLengthException("Too long");
        } else {
            return true;
        }
    }

    public static boolean isEmail(String input) throws Exception {
        String regex = "^\\w+([-+.']\\w+)*@\\w+([-.]\\w+)*\\.\\w+([-.]\\w+)*$";
        if ((input == null) || (input.equals(" ")) || (input.equals(""))) {
            throw new EmptyLineException("Empty input");
        } else if (!input.matches(regex)) {
            throw new InvalidInputException("Invalid email");
        } else {
            return true;
        }
    }

    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter input needed to be verify: ");
        String input = sc.nextLine();
        System.out.println("Enter option: ");
        int option;
        while (true) {
            System.out.println("1. Check if it is a word or not?");
            System.out.println("2. Check if it is an integer or not?");
            System.out.println("3. Check if it is a float or not?");
            System.out.println("4. Check if it is an email or not?");
            System.out.println("5. Finishing the program.");

            option = sc.nextInt();
            switch (option) {
                case 1:
                    try {
                        System.out.println(isWord(input));
                    } catch (Exception e) {
                        System.out.println(e.getMessage());
                    }
                    break;
                    
                case 2:
                    try {
                        System.out.println(isInteger(input));
                    } catch (Exception e) {
                        System.out.println(e.getMessage());
                    }
                    break;

                case 3:
                    try {
                        System.out.println(isFloats(input));
                    } catch (Exception e) {
                        System.out.println(e.getMessage());
                    }
                    break;

                case 4:
                    try {
                        System.out.println(isEmail(input));
                    } catch (Exception e) {
                        System.out.println(e.getMessage());
                    }
                    break;
                
                case 5:
                    System.out.println("Finishing program!");
                    sc.close();
                    return;

                default:
                    try {
                        System.out.println("Enter agian: ");
                    } catch (Exception e) {
                        System.out.println(e.getMessage());
                    }
                    break;
            }
        }
    }
}
