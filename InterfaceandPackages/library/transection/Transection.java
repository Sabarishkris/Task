package InterfaceandPackages.library.transection;

import InterfaceandPackages.library.book.Books;
import InterfaceandPackages.library.member.Members;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Transection {
    private Books book;
    private Members member;
    private LocalDateTime issueDate= LocalDateTime.now();
    public Transection(Books book, Members member){
        this.book=book;
        this.member=member;
    }
    public int days(String s) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        LocalDateTime returnDateTime = LocalDate.parse(s, formatter).atStartOfDay();

        int daysIssued = (int) java.time.Duration.between(issueDate, returnDateTime).toDays();
        return daysIssued;
    }

    @Override
    public String toString() {
        DateTimeFormatter dateTimeFormatter= DateTimeFormatter.ofPattern("yyyy-dd-mm");
        return "Transection : " + book + "\n"+member +
                ", isuueDate=" + issueDate.format(dateTimeFormatter) ;
    }
}
