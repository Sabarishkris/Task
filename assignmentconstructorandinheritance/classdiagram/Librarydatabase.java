package assignmentconstructorandinheritance.classdiagram;

import java.util.ArrayList;
import java.util.List;

public class Librarydatabase {
    private List<Book>books=new ArrayList<>();
    private List<Account>accounts=new ArrayList<>();
    private static Librarydatabase librarydatabase;
    private Librarian librarian;

    public static Librarydatabase getInstance(){
        if(librarydatabase==null){
            librarydatabase=new Librarydatabase();
        }
        return librarydatabase;
    }
    public List getBook(){
        return books;
    }
    public void setLibrarian(Librarian librarian){
        this.librarian=librarian;
    }
    private void Add(){

    } private void Delete(){

    } private void Update(){

    } private void Display(){

    } private void Search(){

    }
}
