package assignmentclassandobject;

import java.util.Scanner;

public class Flight {
    static int no=1;
    private int flightNo;
    private String flightName;
    private int arrivalTime;
    private int departureTime;


    public static int getNo() {
        return no;
    }

    public static void setNo(int no) {
        Flight.no = no++;
    }

    public int getFlightNo() {
        return flightNo;
    }

    public void setFlightNo(int flightNo) {
        this.flightNo = flightNo;
    }

    public String getFlightName() {
        return flightName;
    }

    public void setFlightName(String flightName) {
        this.flightName = flightName;
    }

    public int getArrivalTime() {
        return arrivalTime;
    }

    public void setArrivalTime(int arrivalTime) {
        this.arrivalTime = arrivalTime;
    }

    public int getDepartureTime() {
        return departureTime;
    }

    public void setDepartureTime(int departureTime) {
        this.departureTime = departureTime;
    }
    public void display(Flight flight){
        System.out.println("Flight id : "+flight.getFlightNo());
        System.out.println("Flight name : "+flight.getFlightName());
        System.out.println("Flight arrival time : "+flight.getArrivalTime());
        System.out.println("Flight departure time : "+flight.getDepartureTime());
        System.out.println("********************************************************");

    }

    public static void main(String[] args) {
        Flight flight1=new Flight();
        Scanner sc= new Scanner (System.in);
        System.out.println("Flight id : "+no);
        flight1.setFlightNo(no);
        System.out.println("Enter flight name : ");
        String name =sc.nextLine();
        System.out.println("Enter the flight arrival time (hrs): ");
        int time =sc.nextInt();
        System.out.println("Enter the departure time : ");
        int departure=sc.nextInt();
        flight1.setFlightName(name);
        flight1.setArrivalTime(time);
        flight1.setDepartureTime(departure);
        flight1.display(flight1);


    }
}
