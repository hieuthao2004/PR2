import java.util.HashMap;

import exceptions.EmptyLineException;
import exceptions.WordLengthException;

public class CountLetters {
    public static void divideLetters(String word) throws Exception {
        if (!isValid(word)) {
            System.out.println("Something is wrong");
        }
        //Divide word
        String[] letter = word.split("");

        HashMap<String, Integer> loo = new HashMap<>();
        for (int i = 0; i < letter.length; i++) {
            loo.put(letter[i], 0);
        }

        //Check occurence
        //Problem: It loops through the whole array and causes duplication
        for (int i = 0; i < letter.length; i++) {
            if (loo.containsKey(letter[i])) {
                loo.put(letter[i], loo.get(letter[i]) + 1);
            }
        }
        System.out.println(loo);

    }

    //Data validation
    private static boolean isValid(String word) throws Exception {
        if ((word == null) || (word.equals("")) || (word.equals(" ")) ) {
            throw new EmptyLineException("Empty word");
        } else {
            if (word.length() > 45) {
                throw new WordLengthException("Exceed limitation");
            } else {
                return true;
            }
        }
    }

    public static void main(String[] args) throws Exception {
        divideLetters("nguyentrong");
    }
}
