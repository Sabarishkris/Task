package AbstractClass.book;


import java.util.InputMismatchException;
import java.util.Scanner;

public class Book {

    static long id = 100001;
    private String bookName;
    private long ISBN;
    private String bookAuthor;
    private String publication;
    private int edition;
    private int volume;

    public Book(long ISBN, String name, String author, String publication, int edition, int volume) {
        this. bookName=name;
        this.ISBN=ISBN;
        this.bookAuthor=author;
       this. publication=publication;
        this.edition=edition;
        this. volume=volume;
    }

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

    public long getISBN() {
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

    public void display(Book book) {
        System.out.println("Book ISBN : " + book.getISBN());
        System.out.println("Book Name : " + book.getBookName());
        System.out.println("Book author : " + book.getBookAuthor());
        System.out.println("Book publication : " + book.getPublication());
        System.out.println("Book edition : " + book.getEdition());
        System.out.println("Book volume : " + book.getVolume());
        System.out.println("********************************************************");

    }

    public static void main(String[] args) {
        Book bk=new Book(11000,"Java","Gosling","Jersy publication",11,3);
        bookDetails(bk);
        Scanner sc = new Scanner(System.in);




    }

    private static void bookDetails(Book bk) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("Select --> \n1) view Book \n2) Edit Book \n3) Exit");
            try {
                int choice = sc.nextInt();
                sc.nextLine();

                switch (choice) {
                    case 1:
                        bk.display(bk);
                        break;
                    case 2:
                        if(updateLogin(bk)){
                            System.out.println("Book Publication Company : ");
                            bk.setPublication(sc.nextLine());
                            System.out.println("Book Edition : ");
                            bk.setEdition(sc.nextInt());
                            System.out.println("Book Volume :  ");
                            bk.setVolume(sc.nextInt());
                            System.out.println("Updated Successfully");
                        }
                        break;
                    case 3:
                        System.exit(0);
                        break;

                    default:
                        System.out.println("Invalid selection ...");

                }
            } catch (InputMismatchException e) {
                System.out.println(" Input Mismatch....");
                bookDetails(bk);
            }
        }
    }

    private static boolean updateLogin(Book bk) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the login name : ");
        String name=sc.nextLine();
        System.out.println("Enter the password : ");
        String pass=sc.next();
        if(name.equals("Zsgs") && pass.equals("admin")){
            return true;
        }else{
            return false;
        }
    }
}
