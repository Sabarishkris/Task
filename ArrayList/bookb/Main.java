package book;


import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    static int id=1;
    static List<Book> bookList=new ArrayList<>();

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        while(true){
            System.out.println("Select 1->Add book 2- > Display 3 -> Update Book 4 - > Delete Book 4 -> Exit");
            int choice=sc.nextInt();
            switch(choice){
                case 1:
                    addBook(sc);
                    break;
                case 2:
                    if(bookList.isEmpty()){
                        System.out.println("Book list is empty...");
                    }else{
                    display(bookList);
                    }
                    break;
                case 3:
                    if(bookList.isEmpty()){
                        System.out.println("Book list is empty...");
                    }else{
                        updateBook(bookList,sc);
                    }
                    break;
                case 4:
                    if(bookList.isEmpty()){
                        System.out.println("Book list is empty...");
                    }else{
                        removeBook(bookList,sc);
                    }
                    break;
                case 5:
                    System.exit(0);
                default:
                    System.out.println("Invalid choice ...");
            }
        }
    }

    private static void removeBook(List<Book> bookList, Scanner sc) {
        System.out.println("Enter the the book Id : ");
        int id=sc.nextInt();
        Book book=isAvailableId(bookList,id);
        if(book!=null) {
            if(book.getCount()>0){
                int count= book.getCount();
                count--;
                book.setCount(count);
                if(checkContinue(sc)){
                    removeBook(bookList,sc);
                }else {
                    System.out.println("Thanks for remove book...");
                }
            }else{
                bookList.remove(book);
                if(checkContinue(sc)){
                    removeBook(bookList,sc);
                }else {
                    System.out.println("Thanks for remove book...");
                }
            }
        }

    }

    private static void updateBook(List<Book> bookList,Scanner sc) {
        System.out.println("Enter the the book Id : ");
        int id=sc.nextInt();
        Book book=isAvailableId(bookList,id);
        if(book!=null){
            System.out.println("Enter the book count : ");
            int count =sc.nextInt();
            book.setCount(book.getCount()+count);
            if(checkContinue(sc)){
                updateBook(bookList,sc);
            }else {
                System.out.println("Thanks for update book...");
            }
        }else{
            System.out.println("Enter valid id ....");
            updateBook(bookList,sc);
        }
    }

    private static Book isAvailableId(List<Book> bookList,int id) {
        for(Book temp : bookList){
            if(id==temp.getId()){
                return temp;
            }
        }
        return null;
    }

    private static void display(List<Book> bookList) {
        System.out.printf("%-10s %-10s %-10s %-10s","Book Id","Book Name","Book publication","Book count");
        for (Book temp : bookList){
            System.out.println();
            System.out.printf("%-10s %-10s %-20s %-20s",temp.getId(),temp.getBookName(),temp.getPublication(),temp.getCount());
            System.out.println();
        }
        System.out.println("*****************************************************");
        }


    private static void addBook(Scanner sc) {
        sc.nextLine();

        System.out.println("Book id : "+id);

        System.out.println("Enter book name : ");
        String bookName=sc.nextLine();
        System.out.println("Enter publication : ");
        String publication =sc.nextLine();
        System.out.println("Enter count : ");
        int count=sc.nextInt();
        Book book=new Book(id,bookName,publication,count);
        bookList.add(book);
        id++;
        if(checkContinue(sc)){
            addBook(sc);
        }else{
            System.out.println("Thank you add book...");
        }
    }

    private static boolean checkContinue(Scanner sc) {
        System.out.println("continue this process : Yes / No ");
        String choice =sc.next();
        if(choice.equalsIgnoreCase("Yes")){
            return true;
        }else if (choice.equalsIgnoreCase("no")){
            return false;
        }else{
            System.out.println("Invalid selection ...");
            checkContinue(sc);
        }
        return false;
    }
}

