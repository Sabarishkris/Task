package arraylist.employee;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

public class Main {
    static List<Employee>employeeList=new ArrayList<>();
    public static void main(String[] args) throws ParseException {

        Scanner sc=new Scanner(System.in);

        while (true){
            System.out.println("-- Select -- \n1) Add employee details \n2) Sort id \n3) Sort employee name \n4)Sort employee DOB \n5)Sort salary \n6)Display \n7)Exit ");
            int choice=sc.nextInt();
            switch (choice){
                case 1:
                    addDetails(sc,employeeList);
                    break;
                case 2:
                    sortId(employeeList);
                    break;
                case 3:
                    sortName(employeeList);
                    break;
                case 4:
                    SortDOB(employeeList);
                    break;
                case 5:
                    sortSalary(employeeList);
                    break;
                case 6:
                    display(employeeList);
                    break;
                case 7:
                    System.out.println("Thank you .....");
                    System.exit(0);
                default:
                    System.out.println("Invalid choice ");

            }
        }
    }

    private static void SortDOB(List<Employee> employeeList) {
        if(!employeeList.isEmpty()){
            Collections.sort(employeeList,new EmployeeDateComparator());
            display(employeeList);
        }else{
            System.out.println("Employee List is empty...");
        }
    }

    private static void sortSalary(List<Employee> employeeList) {
        if(!employeeList.isEmpty()){
            Collections.sort(employeeList,new EmployeeSalaryComparator());
            display(employeeList);
        }else{
            System.out.println("Employee List is empty...");
        }
    }

    private static void sortName(List<Employee> employeeList) {
        if(!employeeList.isEmpty()){
            Collections.sort(employeeList,new EmployeeName());
            display(employeeList);
        }else{
            System.out.println("Employee List is empty...");
        }

    }

    private static void display(List<Employee> employeeList) {
        if(!employeeList.isEmpty()) {
            System.out.printf("%-10s %-10s %-10s %-10s", "Employee Id", "Employee Name", "Employee DOB", "Employee Salary");
            System.out.println();
            for (Employee temp : employeeList) {
                System.out.printf("%-10s %-10s %-10s %-10s", temp.getId(), temp.getName(), temp.getDOB(), temp.getSalary());
                System.out.println();
            }
        }else{
            System.out.println("Employee List is Empty..");
        }
    }

    private static void sortId(List<Employee> employeeList) {
        if(!employeeList.isEmpty()){
            Collections.sort(employeeList,new EmployeeIdComparator());
            display(employeeList);
        }else{
            System.out.println("Employee List is empty...");
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

    private static void addDetails(Scanner sc, List<Employee> employeeList) throws ParseException {

        System.out.println("Enter Employee id : ");
        int id=sc.nextInt();
        sc.nextLine();
        System.out.println("Enter Employee name : ");
        String name=sc.nextLine();
        System.out.println("Enter Employee DOB (dd/mm/yyyy) : ");
        String date=sc.next();
        SimpleDateFormat sf=new SimpleDateFormat("dd/MM/yyy");
        System.out.println("Enter the Employee salary : ");
        int salary=sc.nextInt();
        employeeList.add(new Employee(id,name,sf.parse(date),salary));
        System.out.println("\t\t\t Employee\t"+name +"\tadded successfully");
        if(checkContinue(sc)){
            addDetails(sc,employeeList);
        }else {
            System.out.println("Thanks for adding employee details...");
        }


    }
}
