package assignmentconstructorandinheritance;

    abstract class Shape{
        double variable1;
        double variable2;
        double a;
        Shape(double val1,double val2){
            this.variable1=val1;
            this.variable2=val2;
        }
        abstract public void area();
        public void show(String s){
            System.out.println( s + a);
        }
    }
    class Rectangle extends Shape {
        public Rectangle(double length, double height) {
            super(length,height);
        }

        public void area (){
            a=variable1*variable2;
        }
    }
    class Triangle extends Shape {
        public Triangle(double base, double height) {
            super(base,height);
        }
        public void area(){
            a=0.5*variable1*variable2;
        }
    }
    public class Shape1 {
        public static void main(String[] args) {
            Shape rectangle=new Rectangle(10,20);
            rectangle.area();
            rectangle.show("Rectangle : ");
            Shape triangle=new Triangle(10,30);
            triangle.area();
            rectangle.show("Triangle : ");
        }
    }

