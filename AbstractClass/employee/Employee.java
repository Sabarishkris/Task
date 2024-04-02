package AbstractClass.employee;

abstract class Employee {
    private String name;
    private int empId;
    private long salary;

    public Employee(String name, int empId, long salary) {
        this.name=name;
        this.empId=empId;
        this.salary=salary;
    }

    abstract void calculatePay(Employee obj);
    abstract void displaydetails(Employee obj);

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getEmpId() {
        return empId;
    }

    public void setEmpId(int empId) {
        this.empId = empId;
    }

    public long getSalary() {
        return salary;
    }

    public void setSalary(long salary) {
        this.salary = salary;
    }

}
class HourlyEmployee extends Employee{
    int hr;


    HourlyEmployee(String name,int empId,long salary,int hr){
        super(name,empId,salary);
        this.hr=hr;
    }

    @Override
    void calculatePay(Employee obj) {
        obj.setSalary(50*hr);
    }

    @Override
    void displaydetails(Employee obj) {
        System.out.printf("%-10s %-10s %-10s","Name","Employee Id","Salary");
        System.out.println();
        System.out.printf("%-10s %-10s %-10s",obj.getName(),obj.getEmpId(),obj.getSalary());
        System.out.println();
    }
}
class Monthlysalary extends Employee{
    int months;
    Monthlysalary(String name,int empId,long salary,int month){
        super(name,empId,salary);
        this.months=month;
    }

    @Override
    void calculatePay(Employee obj) {
        obj.setSalary(months*15000);

    }

    @Override
        void displaydetails(Employee obj) {
            System.out.printf("%-10s %-10s %-10s","Name","Employee Id","Salary");
        System.out.println();
            System.out.printf("%-10s %-10s %-10s",obj.getName(),obj.getEmpId(),obj.getSalary());
        System.out.println();
        }
    }
