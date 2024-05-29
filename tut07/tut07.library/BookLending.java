public class BookLending {
    private String creationDate;
    private String acc;
    private BookItem bookItems;
    private String dueDate;
    private String returnDate;
    private LendingStatus status;

    public BookLending(String creationDate, String acc, BookItem bookItems, String dueDate, String returnDate, LendingStatus status) {
        this.creationDate = creationDate;
        this.acc = acc;
        this.bookItems = bookItems;
        this.dueDate = dueDate;
        this.returnDate = "Not yet";
        this.status = status;
    }

    public String getCreationDate() {
        return creationDate;
    }

    public void setCreationDate(String creationDate) {
        this.creationDate = creationDate;
    }

    public String getAcc() {
        return acc;
    }

    public void setAcc(String acc) {
        this.acc = acc;
    }

    public BookItem getBookItems() {
        return bookItems;
    }

    public void setBookItems(BookItem bookItems) {
        this.bookItems = bookItems;
    }

    public String getDueDate() {
        return dueDate;
    }

    public void setDueDate(String dueDate) {
        this.dueDate = dueDate;
    }

    public String getReturnDate() {
        return returnDate;
    }

    public void setReturnDate(String returnDate) {
        this.returnDate = returnDate;
    }

    public LendingStatus getStatus() {
        return status;
    }

    public void setStatus(LendingStatus status) {
        this.status = status;
    }
}
