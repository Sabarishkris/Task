package assignmentconstructorandinheritance;

import java.util.Scanner;
class AddBook {
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
    public void display(AddBook[]books){
        for(int i=0;i<books.length;i++) {
            System.out.println("Book ISBN : " + books[i].getISBN());
            System.out.println("Book Name : " + books[i].getBookName());
            System.out.println("Book author : " + books[i].getBookAuthor());
            System.out.println("Book publication : " + books[i].getPublication());
            System.out.println("Book edition : " + books[i].getEdition());
            System.out.println("Book volume : " + books[i].getVolume());
            System.out.println("********************************************************");
        }

    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the book space : ");
        int size=sc.nextInt();
        AddBook[]books=new AddBook[size];
        for(int i=0;i<size;i++) {
            AddBook newBook = new AddBook();
            System.out.println("Book ISBN : " + id);
            newBook.setISBN(id);
            sc.nextLine();
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
            id++;
            books[i]=newBook;
        }
        new AddBook().display(books);




    }
}
