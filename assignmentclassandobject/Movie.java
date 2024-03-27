package assignmentclassandobject;

public class Movie {
    private String title;
    private int year;

    public Movie(String t)
    {
        title = t;
    }

    public Movie(String t, int yearReleased)
    {
        title = t;
        year = yearReleased;
    }

    public String getTitle()
    {
        return title;
    }

    public int getReleaseDate()
    {
        return year;
    }

    public void changeTitle(String newTitle)
    {
        title = newTitle;
    }

    public void setReleaseDate(int yr)
    {
        year = yr;
    }
    private void display(Movie m1) {

        System.out.println("+----------------------------------------------------+");
        System.out.printf("%s %-50s %s","|","  Title :"+m1.getTitle(),"|");
        System.out.println();
        System.out.printf("%s %-50s %s","|","  Year :"+m1.getReleaseDate(),"|");
        System.out.println();
        System.out.println("+----------------------------------------------------+");
    }

    public static void main(String[] args) {
        Movie m1 = new Movie("vijay",2020);
        m1.display(m1);
        m1.changeTitle("Kamal");
        m1.setReleaseDate(2023);
        m1.display(m1);

    }


}
