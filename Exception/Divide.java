package Exception;

import java.util.Scanner;

public class Divide {
        public static void main(String[] args) {
            Scanner sc=new Scanner(System.in);
            System.out.println("Enter num 1 : ");
            int num1=sc.nextInt();
            System.out.println("Enter num 2 : ");
            int num2=sc.nextInt();
            int sum=0;
            try{
                sum=num1/num2;
            }catch (ArithmeticException e ){
                System.out.println(e.getMessage() + "Invalid Input");
            }
            System.out.println("Answer : "+sum);
        }
}
