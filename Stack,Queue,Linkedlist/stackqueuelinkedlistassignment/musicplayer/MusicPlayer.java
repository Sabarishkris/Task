package stackqueuelinkedlistassignment.musicplayer;

import java.util.LinkedList;
import java.util.Scanner;

class Song {
    String title;
    String artist;

    public Song(String title, String artist) {
        this.title = title;
        this.artist = artist;
    }
}

public class MusicPlayer {
    static LinkedList<Song> playlist;
    Song currentSong;

    public MusicPlayer() {
        playlist = new LinkedList<>();
        currentSong = null;
    }

    public void addSong(Song song) {
        playlist.add(song);
        if (currentSong == null) {
            currentSong = song;
        }
    }

    public void removeSong(Song song) {
        if (playlist.isEmpty()) {
            System.out.println("Playlist is empty.");
            return;
        }
        playlist.remove(song);
        if (currentSong == song) {
            if (!playlist.isEmpty()) {
                currentSong = playlist.getFirst();
            } else {
                currentSong = null;
            }
        }
    }

    public void playCurrentSong() {
        if (currentSong == null) {
            System.out.println("No song is currently selected.");
        } else {
            System.out.println("Playing: " + currentSong.title + " by " + currentSong.artist);
        }
    }

    public void skipToNextSong() {
        if (!playlist.isEmpty()) {
            int currentIndex = playlist.indexOf(currentSong);
            if (currentIndex != -1 && currentIndex < playlist.size() - 1) {
                currentSong = playlist.get(currentIndex + 1);
                System.out.println("Skipping to next song: " + currentSong.title);
            } else {
                System.out.println("No next song available.");
            }
        } else {
            System.out.println("Playlist is empty.");
        }
    }

    public static void main(String[] args) {
        MusicPlayer musicplayer = new MusicPlayer();

        musicplayer.addSong(new Song("Song1", "Artist1"));
        musicplayer.addSong(new Song("Song2", "Artist2"));
        musicplayer.addSong(new Song("Song3", "Artist3"));
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Available songs.......");
            displaySongs(playlist);
            System.out.println("*************************************************");
            System.out.println("Select option \n1-> Add Song \n2-> Play song \n3-> Skip song \n4-> Remove song");
            int choice = scanner.nextInt();
            scanner.nextLine();
            switch (choice) {
                case 1:
                    System.out.println("Enter the song name : ");
                    String name = scanner.nextLine();
                    System.out.println("Enter the artist name : ");
                    String artist = scanner.nextLine();
                    musicplayer.addSong(new Song(name, artist));
                    break;
                case 2:
                    if (!playlist.isEmpty()) {
                        musicplayer.playCurrentSong();
                    } else {
                        System.out.println("Play list is empty");
                    }
                    break;
                case 3:
                    if (!playlist.isEmpty()) {
                        musicplayer.skipToNextSong();
                    } else {
                        System.out.println("Play list is empty");
                    }
                    break;
                case 4:
                    if (!playlist.isEmpty()) {
                        System.out.println("Enter the song name : ");
                        String name1 = scanner.nextLine();
                        System.out.println("Enter the artist name : ");
                        String artist1 = scanner.nextLine();
                        Song song=getSong(name1,artist1);
                        if(song!=null){
                            musicplayer.removeSong(song);
                        }else{
                            System.out.println("Song not available");
                        }
                    } else {
                        System.out.println("Play list is empty");
                    }
            }
        }
    }

    private static Song getSong(String name1, String artist1) {
        Song song=null;
        if(!playlist.isEmpty())
        for(Song temp:playlist){
            if(temp.title.equals(name1)&& temp.artist.equals(artist1)){
                song=temp;
                break;
            }
        }
        return song;
    }

    private static void displaySongs(LinkedList<Song> playlist) {
        System.out.printf("%-10s %-10s%n", "Song Name", "Artist Name");
        for (Song temp:playlist) {
            System.out.println();
            System.out.printf("%-10s %-10s", temp.title,temp.artist);
            System.out.println();
        }
    }
}
