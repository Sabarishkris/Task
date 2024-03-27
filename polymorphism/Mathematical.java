package polymorphism;

public class Mathematical {
    public void add(int a,int b) {
        System.out.println(a+b);
    }
    public void add(int a) {
        System.out.println(a+a);
    }
    public void add(double a,int b) {
        System.out.println(a+b);
    }

    public void subtract(int a,int b) {
        int val1=a<b?b:a;
        int val2=a>b?b:a;
        System.out.println(val1-val2);
    }
    public void subtract(int a,double b) {
        double val1=a<b?b:a;
        double val2=a>b?b:a;
        System.out.println(val1-val2);
    }
    public void subtract(double a,int b) {
        System.out.println(a+b);
    }
    public static void main(String[] args) {
        Mathematical mathematical=new Mathematical();
        mathematical.add(4);
        mathematical.add(2,3);
        mathematical.add(2.0,7);
     mathematical.subtract(4,5);
     mathematical.subtract(4.0,6);
        mathematical.subtract(7,6.0);

    }
}
