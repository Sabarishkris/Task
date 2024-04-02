package AbstractClass.product;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        purchase();
    }

    private static void purchase() {
        int amount=0;
        Scanner sc=new Scanner(System.in);
        while (true){
            System.out.println("Select Buy--> \n1) Mobile \n2) Laptop \n3) Pen  \n\nTotal Price--> \n4) Amount ");
            try {
                int choice = sc.nextInt();

                switch (choice) {
                    case 1:
                        Product p1 = new mobile("MI", "Android", 20000);
                        p1.display();
                        amount += p1.getPrice();
                        break;
                    case 2:
                        Product p2 = new Laptop("Dell", "Touch Screen", 50000);
                        p2.display();
                        amount += p2.getPrice();
                        break;
                    case 3:
                        Product p3 = new Pen("Gell Pen", "Blue", 20);
                        p3.display();
                        amount += p3.getPrice();
                        break;
                    case 4:
                        System.out.println("Total Amount : " + amount);
                        System.out.println("**********************************");
                        break;
                    default:
                        System.out.println("Invalid selection ...");

                }
            }catch (InputMismatchException e ){
                System.out.println(" Input Mismatch....");
                purchase();
            }
        }
    }
}
