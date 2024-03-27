package assignmentclassandobject;

public class Team {
    private String name;
    private String location;
    private void print(){
        System.out.println("Team");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }
}
