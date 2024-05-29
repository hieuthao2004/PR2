public class Book {
    private String isbn;
    private String title;
    private String subject;
    private String authors;
    private String publisher;
    private String language;
    private int numOfPages;

    public Book(String isbn, String title, String subject, String authors, String publisher, String language, int numOfPages) {
        this.isbn = isbn;
        this.title= title;
        this.subject = subject;
        this.authors = authors;
        this.publisher = publisher;
        this.language = language;
        this.numOfPages = numOfPages;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public String getTitle() {
        return title;
    }
    
    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthors() {
        return authors;
    }

    public void setAuthors(String authors) {
        this.authors = authors;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public int getNumOfPages() {
        return numOfPages;
    }

    public void setNumOfPages(int numOfPages) {
        this.numOfPages = numOfPages;
    }

    @Override
    public String toString() {
        return getIsbn() + "|" + getTitle() + "|" + getSubject() + "|" + getAuthors() + "|" + getPublisher() + "|" + getLanguage() + "|" + getNumOfPages();
    }
}
