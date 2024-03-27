package assignmentclassandobject;

import java.util.Scanner;

public class Employee {
    static int  id=1;
    private int employeeId;
    private String employeeName;
    private String email;
    private long phone;
    private double salary;

    public static int getId() {
        return id;
    }

    public static void setId(int id) {
        Employee.id = id;
    }

    public int getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(int employeeId) {
        this.employeeId = employeeId;
    }

    public String getEmployeeName() {
        return employeeName;
    }

    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public long getPhone() {
        return phone;
    }

    public void setPhone(long phone) {
        this.phone = phone;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
    public void display(Employee employee){
        System.out.println("Employee id : "+employee.getEmployeeId());
        System.out.println("Employee Name : "+employee.getEmployeeName());
        System.out.println("Employee Email : "+employee.getEmail());
        System.out.println("Employee Phone no : "+employee.getPhone());
        System.out.println("Employee salary : "+employee.getSalary());
        System.out.println("******************************************************");
    }

    public static void main(String[] args) {
        Employee employee=new Employee();
        Scanner sc=new Scanner(System.in);
        System.out.println("Employee id : " +id);
        employee.setEmployeeId(id);
        System.out.println("Employee name : ");
        employee.setEmployeeName(sc.nextLine());
        System.out.println("Employee Email : ");
        employee.setEmail(sc.nextLine());
        System.out.println("Employee phone no : ");
        employee.setPhone(sc.nextLong());
        System.out.println("Employee salary : ");
        employee.setSalary(sc.nextDouble());
        id++;
        employee.display(employee);
    }
}
