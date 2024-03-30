import java.util.Scanner;

public class Multiply15 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number : ");
        int n=sc.nextInt();
       if(n%2!=0){
           System.out.println( "ODD No (Multiply 15) : "+ ((n<<4)-n));
           System.out.println("Calculation (15 * n/16): "+ (((n<<4)-n)>>4));
       }else {
           System.out.println("Even no (Multiply 15) : "+(((n << 3) + (n >> 1))-n));
           System.out.println("Calculation (15 * n/16) : "+ (((n<<4)-n)>>4));
       }

    }
}
