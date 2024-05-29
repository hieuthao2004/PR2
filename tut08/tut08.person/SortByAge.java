import java.util.Comparator;

public class SortByAge implements Comparator<Person> {
    @Override
    public int compare(Person p1, Person p2) {
        int[] personDob1 = parseDateStringToIntArray(parseDateToArray(p1.getDateOfBirth()));
        int[] personDob2 = parseDateStringToIntArray(parseDateToArray(p2.getDateOfBirth()));
        int dayCompare = personDob2[0] - personDob1[0];
        int monthCompare = personDob2[1] - personDob1[1];
        int yearCompare = personDob2[2] - personDob1[2];
        if (yearCompare == 0) {
            if (monthCompare == 0) {
                return dayCompare;
            } 
            return monthCompare;
        } else {
            return yearCompare;
        }
    }

    private String[] parseDateToArray(String dob) {
        if (dob.contains("/")) {
            return dob.split("/");
        } else if (dob.contains("-")) {
            return dob.split("-");
        } else {
            return null;
        }
    }

    private int[] parseDateStringToIntArray(String[] str) {
        int[] intDate = new int[str.length];
        for (int i = 0; i < intDate.length; i++) {
            intDate[i] = Integer.parseInt(str[i]);
        }
        return intDate;
    }

}
