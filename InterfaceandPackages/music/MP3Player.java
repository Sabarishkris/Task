package InterfaceandPackages.music;

public class MP3Player implements Methods {

    @Override
    public void play() {
        System.out.println("Mp3Player Play Music");

    }

    @Override
    public void pause() {
        System.out.println("Mp3Player Pause Music");
    }

    @Override
    public void stop() {
        System.out.println("Mp3Player Stop Music");
    }
}
