package assignmentconstructorandinheritance.classdiagram;

import java.util.ArrayList;
import java.util.List;

public class Librarymanagementsystem {
    private String userType, username, password;
    private List<User>users=new ArrayList<>();
    private List<Book>books=Librarydatabase.getInstance().getBook();
    private Librarian librarian;
    Librarymanagementsystem(Librarian librarian){
        this.librarian=librarian;

    }
    public void login(){

    }
    private void register(){

    }
    private void logout(){

    }
}
