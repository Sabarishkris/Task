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
            System.out.println("Select 1->Add book 2- > Display 3 -> Exit");
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
                    System.exit(0);
                default:
                    System.out.println("Invalid choice ...");
            }
        }
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
        checkContinue(sc);
    }

    private static void checkContinue(Scanner sc) {
        System.out.println("continue this process : Yes / No ");
        String choice =sc.next();
        if(choice.equalsIgnoreCase("Yes")){
            addBook(sc);
        }else if (choice.equalsIgnoreCase("no")){
            System.out.println("Thank you ....");
        }else{
            System.out.println("Invalid selection ...");
            checkContinue(sc);
        }
    }
}

