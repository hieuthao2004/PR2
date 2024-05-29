import java.util.ArrayList;

public class LibraryTestDemo {
    public static void main(String[] args) throws Exception {

        Person p1 = new Person(1, "Hieu", "13/07/2004", "hieunguyen@gmail.com", "113000123123", "Hanoi");
        Account acc1 = new Account("Member", 10, "hieuhayho", Status.Active, p1);
        Book b1 = new Book("ISBN123", "Art of Coding", "Economics", "Kim Dinh", "HANU Pub", "English", 269);
        Book b2 = new Book("ISBN124", "Art of Cooking", "Tourism and Services", "Thu Hang", "HANOI MOI", "Vietnamese", 290);

        BookItem bi1 = new BookItem("223-224", 100, Format.Ebook, BookStatus.Available, "26/06/2020", "01/03/2019");
        BookLending bl1 = new BookLending("17/07/2024", acc1.getAcc(), bi1, "13/12/2024", "11/12/2024", LendingStatus.Available);

        Catalog c1 = new Catalog(new ArrayList<>());
        c1.addBook(b1);
        c1.addBook(b2);
        c1.printListOfBook();

    }
}
