package assignmentclassandobject;

import java.util.Scanner;

public class Book {
    static long id=100001;
    private String bookName;
    private long ISBN;
   private String bookAuthor;
    private String publication;
    private int edition;
    private int volume;

    public static long getId() {
        return id;
    }

    public static void setId(long id) {
        Book.id = id;
    }

    public String getPublication() {
        return publication;
    }

    public void setPublication(String publication) {
        this.publication = publication;
    }

    public  long getISBN() {
        return ISBN;
    }

    public void setISBN(long ISBN) {
        this.ISBN = ISBN;
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public String getBookAuthor() {
        return bookAuthor;
    }

    public void setBookAuthor(String bookAuthor) {
        this.bookAuthor = bookAuthor;
    }


    public int getEdition() {
        return edition;
    }

    public void setEdition(int edition) {
        this.edition = edition;
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }
    public void display(Book book){
        System.out.println("Book ISBN : "+book.getISBN());
        System.out.println("Book Name : "+book.getBookName());
        System.out.println("Book author : "+book.getBookAuthor());
        System.out.println("Book publication : "+book.getPublication());
        System.out.println("Book edition : "+book.getEdition());
        System.out.println("Book volume : "+book.getVolume());
        System.out.println("********************************************************");

    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Book newBook=new Book();
        System.out.println("Book ISBN : "+id);
        newBook.setISBN(id);
        System.out.println("Book Name : ");
        newBook.setBookName(sc.nextLine());
        System.out.println("Book author : ");
        newBook.setBookAuthor(sc.nextLine());
        System.out.println("Book Publication year : ");
        newBook.setPublication(sc.nextLine());
        System.out.println("Book Edition : ");
        newBook.setEdition(sc.nextInt());
        System.out.println("Book Volume :  ");
        newBook.setVolume(sc.nextInt());
        newBook.display(newBook);
        id++;


    }
}