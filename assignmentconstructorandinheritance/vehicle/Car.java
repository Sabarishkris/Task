package assignmentconstructorandinheritance.vehicle;

public class Car extends Vehicle{
    private String name;
    private String vehicleNo;
    public void vehicleModel(){
        System.out.println("Car - - > ");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getVehicleNo() {
        return vehicleNo;
    }

    public void setVehicleNo(String vehicleNo) {
        this.vehicleNo = vehicleNo;
    }

    public static void main(String[] args) {
        Vehicle v=new Car();
        v.setName("Sabari");
        v.setVehicleNo("345");
        System.out.println(v.getName());
        System.out.println(v.getVehicleNo());
        v.vehicleModel();
    }
}
