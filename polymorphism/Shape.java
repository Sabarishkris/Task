package polymorphism;

    abstract class Shape{
        double area;
        double preimeter;

        abstract public void area();
        abstract public void perimeter();
        public void show(){
            System.out.println(area);
        }
        public void showPerimeter(){
            System.out.println(preimeter);
        }
    }
    class Rectangle extends Shape {
        double length;
        double height;
        public Rectangle(double length, double height) {
            this.length=length;
            this.height=height;
        }

        public void area (){
            area=length*height;
        }
        public void perimeter(){
            preimeter=(2*(length+height));
        }
    }
    class Triangle extends Shape {
        double a;
        double b;
        double c;
        Triangle(double a, double b,double c ) {
            this.a=a;
            this.b=b;
            this.c=c;
        }
        public void area(){
            area=(a+b+c)/2;
        }
        public void perimeter(){
            preimeter=(a+b+c);
        }
    }

    public class Main {
        public static void main(String[] args) {
            Shape []shapes={new Rectangle(10,20),new Triangle(1,2,3)};
            for(Shape shape : shapes) {
                System.out.println(shape.getClass().getSimpleName());
                shape.area();
                shape.perimeter();
                shape.show();
                shape.showPerimeter();
            }
        }
    }

