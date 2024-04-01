package InterfaceandPackages.library;

import InterfaceandPackages.library.book.Books;
import InterfaceandPackages.library.member.Members;
import InterfaceandPackages.library.transection.Transection;


public class Main {
    public static void main(String[] args) {
        Books book=new Books("Java","Jamesgosling",999999991);
        Members member=new Members("Sabari",24);

        System.out.println("Book List ");
        System.out.println(book);

        System.out.println("Members .....");
        System.out.println(member);

        Transection transection=new Transection(book,member);

        String dates="2024-04-14";
        int days=transection.days(dates);
        System.out.println(days);
        System.out.println(transection + " on "+days);

    }
}
