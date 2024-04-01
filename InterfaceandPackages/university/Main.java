package InterfaceandPackages.university;

import InterfaceandPackages.university.course.Course;
import InterfaceandPackages.university.faculty.Faculty;
import InterfaceandPackages.university.student.Student;

public class Main {
    public static void main(String[] args) {
        Student student1 = new Student("Dinesh", 1001, "Computer Science");

        Course course1 = new Course("Java", "CS1001", 1);

        Faculty faculty1 = new Faculty("Dr. Thamarai", "Computer Science", "Professor");

        System.out.println("Student 1: " + student1.getName() + ", ID: " + student1.getId() + ", Major: " + student1.getMajor());
        System.out.println("Course  1: " + course1.getName() + ", Code: " + course1.getCode() + ", Credit Hours: " + course1.getCreditHours());
        System.out.println("Faculty 1: " + faculty1.getName() + ", Department: " + faculty1.getDepartment() + ", Designation: " + faculty1.getDesignation());

    }
}
