package Evalution2;

import java.util.Scanner;

public class Matrix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the num : ");
        int size = sc.nextInt();
        int[][] arr = new int[size][size];
        int rowStart = 0, colStart = 0;
        int rowEnd = size - 1, colEnd = size - 1;
        int print = 1;
        while (rowStart <= rowEnd) {
            for (int i = rowStart; i <= colEnd; i++) {
                arr[rowStart][i] = print;
            }
            rowStart++;
            for (int i = rowStart; i <= colEnd; i++) {
                arr[i][colEnd] = print;
            }
            colEnd--;
            for (int i = colEnd; i >= colStart; i--) {
                arr[rowEnd][i] = print;
            }
            rowEnd--;
            for (int i = rowEnd; i >= rowStart; i--) {
                arr[i][colStart] = print;
            }
            colStart++;
            if (print == 1) {
                print = 0;
            } else {
                print = 1;
            }
        }
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                System.out.print(arr[i][j]);
            }
            System.out.println();
        }

    }
}
