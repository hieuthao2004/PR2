import java.util.ArrayList;
import java.util.Collections;

public class PersonTest {
    public static void main(String[] args) throws Exception {
        Person s1 = new Person(22, "Nguyen Trong Hieu", "13/07/2005", "hieunguyentrong502@gmail.com", "0981335106", "Hanoi");
        Person s2 = new Person(23, "Nguyen Tuan Duong", "23/08/2004", "tuanduongnguyen@gmail.com", "0981335107", "Hai Phong");
        Person s3 = new Person(23, "Nguyen Kim Dinh", "23/07/2003", "tuanduongnguyen@gmail.com", "0981335107", "Hanoi");


        ArrayList<Person> listOfPerson = new ArrayList<>();
        listOfPerson.add(s1);
        listOfPerson.add(s2);
        listOfPerson.add(s3);

        Collections.sort(listOfPerson, new SortByAge());
        for (Person i : listOfPerson)  {
            System.out.println(i);
        }

    }
}
