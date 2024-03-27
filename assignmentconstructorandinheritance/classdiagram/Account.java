package assignmentconstructorandinheritance.classdiagram;

public class Account {
    private int noBorrowedBooks;
    private int noReservedBook;
    private int noReturnedBooks;
    private int noLostBooks;
    private int fineAmount;
    private User user;
    private void  calculateFine(){
    }

    Account(){
        user=new User(this);

    }

}
