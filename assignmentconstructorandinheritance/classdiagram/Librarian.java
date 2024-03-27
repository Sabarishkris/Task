package assignmentconstructorandinheritance.classdiagram;

import java.util.List;

public class Librarian{
    private String name;
    private int id;
    private String password;
    private String searchString;
    private Librarian librarian;
    private List<Book> bookList=Librarydatabase.getInstance().getBook();
    private Librarymanagementsystem librarymanagementsystem;

    Librarian(){
        librarymanagementsystem=new Librarymanagementsystem(this);
    }
    private void verifyLibrarian(){
    }
    public void setLibrarian(){
       Librarydatabase.getInstance().setLibrarian(this);
    }
    private void Search(){

    }
}
