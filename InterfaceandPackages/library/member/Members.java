package InterfaceandPackages.library.member;

public class Members {
    private String memberName;
    private int memberID;
    public Members(String name, int id){
        this.memberName=name;
        this.memberID=id;
    }

    @Override
    public String toString() {
        return
                "memberName='" + memberName + '\'' +
                ", memberID=" + memberID ;
    }
}
