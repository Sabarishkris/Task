package InterfaceandPackages.music;

import java.util.InputMismatchException;
import java.util.Scanner;

public class StreamingPlayer implements Methods{
    public void play() {
        System.out.println("Streaming Player Play Music");

    }

    @Override
    public void pause() {
        System.out.println("Streaming Player  Pause Music");
    }

    @Override
    public void stop() {
        System.out.println("Streaming Player Stop Music");
    }

    public static void main(String[] args) {
        selectMusic();
    }

    private static void selectMusic() {
        Scanner sc=new Scanner(System.in);
        System.out.println("Select choice \n1) Cd Player \n2) MP3 Player \n3) Streaming player");
        try {
        int choice=sc.nextInt();
        switch (choice) {
            case 1:
                CDPlayer cdPlayer = new CDPlayer();
                start(cdPlayer,sc);
                break;
            case 2:
                MP3Player mp3Player = new MP3Player();
                start(mp3Player,sc);
                break;
            case 3:
                StreamingPlayer streamingPlayer = new StreamingPlayer();
                start(streamingPlayer,sc);
                break;
            default:
                System.out.println("Invalid selection ");
        }
        }catch (InputMismatchException e ){
            System.out.println("Input Mismatch");
            selectMusic();
        }
    }

    private static void start(Methods obj,Scanner sc) {
        System.out.println("Select choice \n1) Play \n2) Pause \n3) Stop");
        try {
            int choice=sc.nextInt();
            switch (choice) {
                case 1:
                   obj.play();
                   start(obj,sc);
                    break;
                case 2:
                   obj.pause();
                    start(obj,sc);
                    break;
                case 3:
                    obj.stop();
                    selectMusic();

                    break;
                default:
                    System.out.println("Invalid selection ");
            }
        }catch (InputMismatchException e ){
            System.out.println("Input Mismatch");
            start(obj,sc);
        }

    }
}
