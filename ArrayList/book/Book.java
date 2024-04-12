package book;

public class Book {
    private int id;
    private String bookName;
    private String publication;
    private int count;
    Book(int id,String bookName,String publication,int count){
        this.id=id;
        this.bookName=bookName;
        this.publication=publication;
        this.count=count;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public String getPublication() {
        return publication;
    }

    public void setPublication(String publication) {
        this.publication = publication;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }
}
