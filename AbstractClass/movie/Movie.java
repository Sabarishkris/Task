package AbstractClass.movie;

public class Movie extends Method {
        private String title;
        private int year;


        public Movie(String t, int yearReleased)
        {
            title = t;
            year = yearReleased;
        }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    private void display(Movie m1) {

            System.out.println("+----------------------------------------------------+");
            System.out.printf("%s %-50s %s","|","  Title :"+m1.getTitle(),"|");
            System.out.println();
            System.out.printf("%s %-50s %s","|","  Year :"+m1.getYear(),"|");
            System.out.println();
            System.out.println("+----------------------------------------------------+");
        }

        public static void main(String[] args) {
            Movie m1 = new Movie("vijay",2020);
            m1.display(m1);
            m1.display(m1);
            m1.play();
            m1.pause();
            m1.stop();

        }


    @Override
    void play() {
        System.out.println("PLay movie ... ");
    }

    @Override
    void pause() {
        System.out.println("Pause Movie ....");

    }

    @Override
    void stop() {
        System.out.println("Stop Movie....");

    }
}
