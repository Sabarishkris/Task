package Evalution2;

import java.util.Scanner;

public class Pattern {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Enter the character");
        char c = sc.next().charAt(0);
        c = Character.toUpperCase(c);
        printPattern(c);
    }

    static void printPattern(char ch) {
        int num = (ch - 'A') * 2 + 1;

        int s1 = (ch - 'A') - 1, s2 = 0;
        char c = 'A';
        for (int i = 0; i < num; i++) {
            for (int j = 0; j < s1; j++) {
                System.out.print(" ");
            }
            System.out.print(c);
            for (int j = 0; j < s2; j++) {
                System.out.print(" ");
            }
            if (i != 0 && i != num - 1) {
                System.out.print(c);
            }
            if (i < ch - 'A') {
                s1--;
                s2 += 2;
                c++;
            } else {
                s1++;
                s2 -= 2;
                c--;

            }
            System.out.println();
        }
    }
}