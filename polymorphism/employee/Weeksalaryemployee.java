package polymorphism.employee;

public class Weeksalaryemployee extends Employee{

    @Override
    public void employee() {
        System.out.println("Week salary employee");
    }

    public static void main(String[] args) {
        Employee e=new Weeksalaryemployee();
        e.employee();
        e=new Salaryemployee();
        e.employee();
        e=new HourlyEmployee();
        e.employee();
    }
}
