package multithreading;

import java.io.*;
import java.net.HttpURLConnection;
import java.net.URL;

public class SimpleFileDownload implements Runnable {
    private String url;
    private String destinationFile;
    private volatile boolean stopDownload;

    public SimpleFileDownload(String url, String destinationFile) {
        this.url = url;
        this.destinationFile = destinationFile;
    }

    public void run() {
        try {
            URL downloadUrl = new URL(url);
            HttpURLConnection connection = (HttpURLConnection) downloadUrl.openConnection();
            int fileSize = connection.getContentLength();

            BufferedInputStream inputStream = new BufferedInputStream(connection.getInputStream());
            FileOutputStream outputStream = new FileOutputStream(destinationFile);
            BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(outputStream);

            byte[] buffer = new byte[1024];
            int bytesRead;
            int totalBytesRead = 0;

            try {
                while ((bytesRead = inputStream.read(buffer)) != -1 && !Thread.currentThread().isInterrupted()) {
                    bufferedOutputStream.write(buffer, 0, bytesRead);
                    totalBytesRead += bytesRead;

                    double percentCompleted = ((double) totalBytesRead / fileSize) * 100;
                    System.out.printf("Download progress: %.2f%%\n", percentCompleted);
                }
            } finally {
                bufferedOutputStream.close();
                inputStream.close();
                connection.disconnect();

                if (Thread.currentThread().isInterrupted()) {
                    System.out.println("Download interrupted.");
                    File file = new File(destinationFile);
                    if (file.exists()) {
                        file.delete();
                    }
                } else {
                    System.out.println("Download complete.");
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        String url = "https://srikarthiks.wordpress.com/wp-content/uploads/2016/07/java-the-complete-reference-8th-edition.pdf";
        String destinationFile = "music.mp3";
        SimpleFileDownload downloader = new SimpleFileDownload(url, destinationFile);
        Thread downloadThread = new Thread(downloader);
        downloadThread.start();

        try {
            Thread.sleep(30000); // Wait for 30 seconds
            downloadThread.interrupt(); // Interrupt the download thread
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
