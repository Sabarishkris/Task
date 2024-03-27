package assignmentconstructorandinheritance.student;

public class Zsgs extends Student {
    private int rollNo;
    private String name;
    private String email;
    private long phoneNo;
   
    Zsgs(int rollNo,String name,String email,long phoneNo){
        super(name,email,phoneNo);
        this.rollNo=rollNo;
        this.name=name;
        this.email=email;
        this.phoneNo=phoneNo;
    }

    public int getRollNo() {
        return rollNo;
    }

    public void setRollNo(int rollNo) {
        this.rollNo = rollNo;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public long getPhoneNo() {
        return phoneNo;
    }

    public void setPhoneNo(long phoneNo) {
        this.phoneNo = phoneNo;
    }

    public static void main(String[] args) {
        Student zsgs=new Zsgs(11720,"sabari","sabari@email.com",1234567890);
        System.out.println(zsgs.getName());
    }

}
