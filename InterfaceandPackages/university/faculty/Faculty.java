package InterfaceandPackages.university.faculty;

public class Faculty {
    private String name;
    private String department;
    private String designation;

    public Faculty(String name, String department, String designation) {
        this.name = name;
        this.department = department;
        this.designation = designation;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String getDesignation() {
        return designation;
    }

    public void setDesignation(String designation) {
        this.designation = designation;
    }
}
