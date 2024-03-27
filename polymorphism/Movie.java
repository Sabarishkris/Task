package polymorphism;

abstract public class Movie {
    abstract public void genre();
}
class Kgf extends Movie{

    @Override
    public void genre() {
        System.out.println("Action movie...");
    }
}
class DDreturns extends Movie{

    @Override
    public void genre() {
        System.out.println("Comedy movie....");
    }
}
class pichaikkaran extends Movie{

    @Override
    public void genre() {
        System.out.println("Family movie....");
    }
}
class conjuring extends Movie{

    @Override
    public void genre() {
        System.out.println("Horror Movie....");
    }

    public static void main(String[] args) {
        Movie m=new Kgf();
        m.genre();
        m=new DDreturns();
        m.genre();
        m=new pichaikkaran();
        m.genre();
        m=new conjuring();
        m.genre();

    }
}
