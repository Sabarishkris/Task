package Exception.bank;

public class Bank {
    String name;
    long balance;
    Bank(String name,long balance){
        this.name=name;
        this.balance=balance;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public long getBalance() {
        return balance;
    }

    public void setBalance(long balance) {
        this.balance = balance;
    }
}
