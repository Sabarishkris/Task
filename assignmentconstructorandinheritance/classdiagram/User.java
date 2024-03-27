package assignmentconstructorandinheritance.classdiagram;

import java.util.List;

public class User {
    private String Name;
    private int id;
    private Account account;
    private List<Book> books=Librarydatabase.getInstance().getBook();

    public User(Account account) {
        this.account=account;
    }

    private void verify(){

    }
    private void checkAccount(){

    }
    private void getBookInfo(){

    }
}
