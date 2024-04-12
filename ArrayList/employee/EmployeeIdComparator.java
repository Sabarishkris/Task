package arraylist.employee;

import java.util.Comparator;

public class EmployeeIdComparator implements Comparator {

    @Override
    public int compare(Object o1, Object o2) {
        Employee emp1=(Employee) o1;
        Employee emp2=(Employee) o2;

        if(emp1.getId()==emp2.getId()){
            return 0;
        }else if(emp1.getId()>emp2.getId()){
            return 1;
        }else{
            return -1;
        }
    }
}
class EmployeeName implements Comparator{

    @Override
    public int compare(Object o1, Object o2) {
        Employee emp1=(Employee) o1;
        Employee emp2=(Employee) o2;
        return emp1.getName().compareTo(emp2.getName());
    }
}
class EmployeeSalaryComparator implements Comparator{
    @Override
    public int compare(Object o1, Object o2) {
        Employee emp1=(Employee) o1;
        Employee emp2=(Employee) o2;

        if(emp1.getSalary()==emp2.getSalary()){
            return 0;
        }else if(emp1.getSalary()>emp2.getSalary()){
            return 1;
        }else{
            return -1;
        }
    }
}
class EmployeeDateComparator implements Comparator {

    @Override
    public int compare(Object o1, Object o2) {
        Employee emp1 = (Employee) o1;
        Employee emp2 = (Employee) o2;
        return emp1.getDOB().compareTo(emp2.getDOB());
    }
}