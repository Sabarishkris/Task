package Exception;

import java.util.Scanner;

class UserDefined extends Exception{
    public UserDefined(String message){
        super(message);
    }
}
public class Custom {
    public static void main(String[] args) {


        try {
            Scanner sc = new Scanner(System.in);
            String name = sc.nextLine();
            if (name.length() < 3) {
                throw new UserDefined("Invalid name ....");
            }
        } catch (UserDefined e) {
            System.out.println(e.getMessage());
        }
        System.out.println("Valid Name !...");
    }

}
