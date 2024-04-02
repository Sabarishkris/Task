package AbstractClass.employee;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        employees();
    }

    private static void employees() {
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("Select --> \n1) Hourly Employee \n2) Monthly Employee \n3) Exit");
            try {
                int choice = sc.nextInt();
                sc.nextLine();

                switch (choice) {
                    case 1:

                        System.out.println("Employee Name : ");
                        String name=sc.nextLine();
                        System.out.println("Employee Id : ");
                        int id=sc.nextInt();
                        System.out.println("Enter hours : ");
                        int hr=sc.nextInt();
                        Employee e1=new HourlyEmployee(name,id,0,hr);
                        e1.calculatePay(e1);
                        e1.displaydetails(e1);

                        break;
                    case 2:
                        System.out.println("Employee Name : ");
                        String empname=sc.nextLine();
                        System.out.println("Employee Id : ");
                        int empid=sc.nextInt();
                        System.out.println("Enter Months : ");
                        int month=sc.nextInt();
                        Employee e2=new Monthlysalary(empname,empid,0,month);

                        e2.calculatePay(e2);
                        e2.displaydetails(e2);

                        break;
                    case 3:
                        System.exit(0);

                        break;

                    default:
                        System.out.println("Invalid selection ...");

                }
            } catch (InputMismatchException e) {
                System.out.println(" Input Mismatch....");
                employees();
            }
        }
    }
}

