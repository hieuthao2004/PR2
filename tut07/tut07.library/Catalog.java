import java.util.ArrayList;
import java.util.Comparator;

public class Catalog implements Comparator<Book> {
//    private String title;
//    private String author;
//    private String subject;
//
//    //Derived attribute
//    private String creationDate;
//    private int totalNumberOfBook;

    private ArrayList<Book> listOfBook;

    public Catalog(ArrayList<Book> listOfBook) {
        this.listOfBook = listOfBook;
    }

    public void addBook(Book b) {
        listOfBook.add(b);
    }

    public void printListOfBook() {
        for (int i = 0; i < listOfBook.size(); i++) {
            System.out.println(listOfBook.get(i));
        }
    }

    @Override
    public int compare(Book o1, Book o2) {
        return o1.getTitle().compareTo(o2.getTitle());
    }

}
