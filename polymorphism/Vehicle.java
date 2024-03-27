package polymorphism;
    abstract  class Vehicle {
        abstract void start();
        abstract void stop();
    }
class Bus extends Vehicle{
        public void start(){
            System.out.println("Bus Start ....");
        }
    public void stop(){
        System.out.println("Bus Stop ....");
    }
}

 class Car extends Vehicle{
  public void start(){
      System.out.println("Car Start...");
  }
    public void stop(){
        System.out.println("Car Stop...");
    }

    public static void main(String[] args) {
       Vehicle v=new Car();
       v.start();
       v.stop();
       v=new Bus();
       v.start();
       v.stop();
    }
}


