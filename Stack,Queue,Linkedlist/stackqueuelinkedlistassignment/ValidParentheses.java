package stackqueuelinkedlistassignment;
import java.util.Scanner;
import java.util.Stack;

public class ValidParentheses {


        public static void main(String[] args) {
            Scanner scanner=new Scanner(System.in);
            System.out.println("Input:");

            String input=scanner.nextLine();
            if(isParenthesesBalanced(input)) {
                System.out.println(input+" is Balanced");
            }
            else {
                System.out.println(input+" is not Balanced");
            }
            scanner.close();
        }
        public static boolean isParenthesesBalanced(String input) {
            Stack<Character> stack=new Stack<>();
            for(int i=0;i<input.length();i++) {
                if(input.charAt(i)=='(' || input.charAt(i)=='[' || input.charAt(i)=='{') {
                    if(input.charAt(i)=='(') {
                        stack.push(')');
                    }
                    else if(input.charAt(i)=='[') {
                        stack.push(']');
                    }
                    else {
                        stack.push('}');
                    }
                }
                else if(input.charAt(i)==')' || input.charAt(i)==']' || input.charAt(i)=='}') {
                    if(!stack.isEmpty() && input.charAt(i)!=stack.pop()) {
                        return false;
                    }
                }
                else {
                    return false;
                }
            }
            return stack.isEmpty();
        }
    }
