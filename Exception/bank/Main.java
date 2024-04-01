package Exception.bank;

import java.util.Scanner;
class userDefined extends Exception{
    public userDefined(String message){
        super(message);
    }
}

public class Main {
    static Bank bank;
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        while (true){
            System.out.println("Select choice \n1) Create Bank \n2) Withdraw \n3)Balance ");
            int n=sc.nextInt();
            switch (n){
                case 1:
                    bank=new Bank("Sabari",5000);
                    System.out.println("Account created successfully");
                    break;
                case 2:
                    if(bank==null){
                        System.out.println("No account found!..");
                    }else{
                        withdraw(bank,sc);
                    }
                    break;
                case 3:
                    if(bank==null){
                        System.out.println("No account found!..");
                    }else{
                        System.out.println("Account balance : "+bank.getBalance());
                    }
                    break;


            }
        }
    }

    private static void withdraw(Bank bank,Scanner sc) {
        if(bank.getBalance()==0){
            exception(sc);
        }
        System.out.println("Enter withdraw amount : ");
        long withdraw=sc.nextLong();
        if(withdraw > bank.getBalance()){
            exception(sc);
        }else {
            long amount = bank.getBalance() - withdraw;
            if (amount != -1) {
                bank.setBalance(amount);
            }
        }
    }
    public static long exception(Scanner sc){
        try{
                throw new userDefined("Insufficient Balance.");
        }catch (userDefined e){
            System.out.println(e.getMessage());
            System.out.println("Account balance : "+bank.getBalance());
            withdraw(bank,sc);
        }
        return -1;
    }
}
