package Evalution2;

import java.util.Scanner;

public class ContiguousSubArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size : ");
        int size = sc.nextInt();
        int[] a = createNewArray(size, sc);
        printAns(a);

    }

    private static void printAns(int[] a) {
        int sum = 0;
        int max = 0;
        String element = "";
        String maxElement = "";
        for (int i = 0; i < a.length; i++) {
            sum += a[i];
            element += a[i] + " ";
            if (a[i] < 0) {
                sum = 0;
                element = "";
            }
            if (sum > max) {
                max = sum;
                maxElement = element;
            }
        }
        System.out.println("Sum : " + max + "\nElement : " + maxElement);
    }

    private static int[] createNewArray(int size, Scanner sc) {
        int[] a = new int[size];
        for (int i = 0; i < a.length; i++) {
            a[i] = sc.nextInt();
        }
        return a;
    }
}
