package arraylist.employee;

import java.util.Date;

public class Employee {
    private int id;
    private String name;
    private Date DOB;
    private int salary;
    Employee(int id,String name,Date DOB,int salary){
        this.id=id;
        this.name=name;
        this.DOB=DOB;
        this.salary=salary;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getDOB() {
        return DOB;
    }

    public void setDOB(Date DOB) {
        this.DOB = DOB;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }
}
