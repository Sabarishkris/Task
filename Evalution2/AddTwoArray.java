package Evalution2;

import java.util.Scanner;

public class AddTwoArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size : ");
        int size = sc.nextInt();
        int[] a1 = createNewArray(size, sc);
        int[] a2 = createNewArray(size, sc);
        String s = addTwoArray(a1, a2);
        StringBuilder sb = new StringBuilder(s);
        System.out.println("Answer : " + sb.reverse());
    }

    private static String addTwoArray(int[] a1, int[] a2) {
        int carry = 0;
        int i = a1.length - 1;
        int j = a2.length - 1;
        String res = "";
        while (i >= 0 || j >= 0 || carry != 0) {
            if (i >= 0 && j >= 0) {
                int sum = a1[i] + a2[j] + carry;
                int rem = sum % 10;
                carry = sum / 10;
                res += "" + rem;
                i--;
                j--;
            } else if (j >= 0) {
                int sum = a2[j] + carry;
                int rem = sum % 10;
                carry = sum / 10;
                res += "" + rem;
                j--;
            } else if (i >= 0) {
                int sum = a1[i] + carry;
                int rem = sum % 10;
                carry = sum / 10;
                res += "" + rem;
                i--;
            } else {
                res += "" + carry;
                carry = 0;
            }

        }

        return res;
    }

    private static int[] createNewArray(int size, Scanner sc) {
        int[] a = new int[size];
        for (int i = 0; i < a.length; i++) {
            a[i] = sc.nextInt();
        }
        return a;
    }
}
