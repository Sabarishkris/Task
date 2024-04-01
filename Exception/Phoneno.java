package Exception;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Phoneno {
    public static void number(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter phone no : ");
        long no=0;
        try {
             no = sc.nextLong();
        }catch (InputMismatchException e){
            System.out.println("Input Mismatch .... enter number only");
            number();
        }
        System.out.println("Valid number : "+no);

    }
    public static void main(String[] args) {
        number();
    }
}
