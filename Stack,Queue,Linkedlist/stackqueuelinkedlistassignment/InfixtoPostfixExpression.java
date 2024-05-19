package stackqueuelinkedlistassignment;

import java.util.Scanner;
import java.util.Stack;

public class InfixtoPostfixExpression {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input: ");
        String input = scanner.nextLine();
        System.out.println(infixToPostfix(input));
        scanner.close();
    }

    public static String infixToPostfix(String expression) {
        Stack<Character> stack = new Stack<>();
        StringBuilder str = new StringBuilder();
        for (int i = 0; i < expression.length(); i++) {
            if (Character.isAlphabetic(expression.charAt(i)) || Character.isDigit(expression.charAt(i))) {
                str.append(expression.charAt(i));
            } else {
                stack.push(expression.charAt(i));
            }
        }
        while (!stack.isEmpty()) {
            str.append(stack.pop());
        }

        return str.toString();
    }

}