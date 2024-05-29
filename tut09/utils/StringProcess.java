import java.util.HashMap;
import java.util.Scanner;

import exceptions.EmptyLineException;
import exceptions.InvalidInputException;

public class StringProcess {
    public static String reverseString(String s) throws Exception {
        if ((s == null) || (s.equals("")) || (s.equals(" "))) {
           throw new EmptyLineException("Empty input"); 
        } else {
            if (s.length() <= 1) {
                return s;
            } else {
                return reverseString(s.substring(1)) + s.charAt(0);
            }
        }
    }

    public static void countVowelsAndConsonants(String s) throws Exception {
        String[] list = s.split("");
        String regexVowels = "[aeiouAEIOU]";
        String regexConsonants = "[^aeiouAEIOU]";

        for (int i = 0; i < list.length; i++) {
            if (list[i].isEmpty()) {
                throw new EmptyLineException("No space needed");
            } else if (list[i].matches(".*\\d+.*")) {
                throw new InvalidInputException("Must not have numbers");
            }
        }
        int countVowels = 0;
        for (int i = 0; i < list.length; i++) {
            if (list[i].matches(regexVowels)) {
                countVowels++;
            }
        }
        int countConsonants = 0;
        for (int i = 0; i < list.length; i++) {
            if (list[i].matches(regexConsonants)) {
                countConsonants++;
            } else if (list[i].matches(".*\\d+.*")) {
                throw new InvalidInputException("Must not have numbers");
            }
        }
        System.out.println("Vowels: " + countVowels + " " + "Consonants: " + countConsonants);
    }

    public static void displayCharactersAtOddPositions(String s) throws EmptyLineException {
        if (s.length() == 0) {
            throw new EmptyLineException("Empty input");
        }
        for (int i = 0; i < s.length(); i++) {
            if (i % 2 == 1) {
                System.out.print(s.charAt(i) + " ");
            }
        }
    }

    public static void displayCharactersAtEvenPositions(String s) throws Exception {
        if (s.length() == 0) {
            throw new EmptyLineException("Empty");
        }
        for (int i = 0; i < s.length(); i++) {
            if (i % 2 == 0) {
                System.out.print(s.charAt(i) + " ");
            }
        }
    }

    public static void countUppercaseAndLowercaseLetters(String s) throws EmptyLineException {
        if (s.length() == 0) {
            throw new EmptyLineException("Empty input");
        }
        String regexUp = "[A-Z]";
        String regexLow = "[a-z]";
        int uppercase = 0;
        int lowercase = 0;
        String[] list = s.split("");
        for (int i = 0; i < list.length; i++) {
            if (list[i].matches(regexUp)) {
                uppercase++;
            }
            if (list[i].matches(regexLow)) {
                lowercase++;
            }
        }
        System.out.println("Uppercase: " + uppercase + ". " + "Lowercase: " + lowercase);
    }

    public static void calculateOccurrenceOfEachCharacter(String s) throws Exception {
        if (s.length() == 0) {
            throw new EmptyLineException("Empty input");
        }
        String[] letter = s.split("");

        HashMap<String, Integer> loo = new HashMap<>();

        for (String string : letter) {
            loo.put(string, 0);
        }

        for (String string : letter) {
            if (loo.containsKey(string)) {
                loo.put(string, loo.get(string) + 1);
            }
        }
        System.out.println(loo);
    }

    public static void divideStringAtASpecifiedSeparator(String s) throws Exception {
        if (s.length() == 0) {
            throw new EmptyLineException("Empty input");
        }
        Scanner sc = new Scanner(System.in);
        System.out.println("Seperate at: ");
        int sep = sc.nextInt();
        System.out.println(s.substring(0, sep) + " and " + s.substring(sep));
        sc.close();
    } 

    public static void extractASubstringFromASpecificPositionWithALength(String s, int start, int len) throws EmptyLineException {
        if (s.length() == 0) {
            throw new EmptyLineException("Empty string");
        }
        System.out.println(s.substring(start, len));
    }

    public static void findIndexOfFirstOccurrenceOfASubstring(String s) {
        Scanner sc = new Scanner(System.in);
        String sub = sc.nextLine();
        
    }


    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int option;
        while (true) {
            option = sc.nextInt();
            switch (option) {
                case 1:
                    System.out.println(reverseString(s));
                    break;

                case 2:
                    countVowelsAndConsonants(s);
                    break;

                case 3:
                    displayCharactersAtOddPositions(s);
                    break;

                case 4:
                    displayCharactersAtEvenPositions(s);
                    break;

                case 5:
                    countUppercaseAndLowercaseLetters(s);
                    break;

                case 6:
                    calculateOccurrenceOfEachCharacter(s);
                    break;

                case 7:
                    divideStringAtASpecifiedSeparator(s);
                    break;

                case 8:
                    System.out.println("Start");
                    int start = sc.nextInt();
                    System.out.println("Length: ");
                    int len = sc.nextInt();
                    extractASubstringFromASpecificPositionWithALength(s, start, len);
                    break;

                case 11:
                    System.out.println("End program!");
                    return;

                default:
                    System.out.println("Invalid input!");
                    break;
            }
        }
    }
}
