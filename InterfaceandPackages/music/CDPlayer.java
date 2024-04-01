package InterfaceandPackages.music;

public class CDPlayer implements Methods {
    public void play() {
        System.out.println("CD player Play Music");

    }

    @Override
    public void pause() {
        System.out.println("CD player Pause Music");
    }

    @Override
    public void stop() {
        System.out.println("CD player Stop Music");
    }
}
