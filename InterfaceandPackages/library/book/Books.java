package InterfaceandPackages.library.book;

public class Books {
    private String bookName;
    private String authorName;
    private long bookISBN;
public Books(String name, String authorName, long isbn){
    this.bookName=name;
    this.authorName=authorName;
    this.bookISBN=isbn;

}

    @Override
    public String toString() {
        return
                "bookName='" + bookName + '\'' +
                ", authorName='" + authorName + '\'' +
                ", bookISBN=" + bookISBN ;
    }
}
