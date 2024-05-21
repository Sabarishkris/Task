package sort;

import java.util.Arrays;
import java.util.Scanner;

public class QuickSort {
    public static void main(String[] args) {
        System.out.println("------Quick Sort------");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the size of array : ");
        int size = scanner.nextInt();
        System.out.println("Enter the number : ");
        int[] num = createArray(size, scanner);
         quickSort(num,0,num.length-1);
        display(num);
    }

        private static void quickSort(int[] array, int start, int end){

            if (end <= start) return;

            int pivot = partition(array, start, end);
            quickSort(array, start, pivot - 1);
            quickSort(array, pivot + 1, end);
        }
        private static int partition(int[] array, int start, int end) {

            int pivot = array[end];
            int i = start - 1;

            for(int j = start; j <= end; j++) {
                if(array[j] < pivot) {
                    i++;
                    int temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }
            }
            i++;
            int temp = array[i];
            array[i] = array[end];
            array[end] = temp;

        return i;
    }

    private static void display(int[] num) {
        System.out.print("Sorted array : ");
        System.out.println(Arrays.toString(num));
    }

    private static int[] createArray(int size, Scanner scanner) {
        int[] num = new int[size];
        for (int i = 0; i < size; i++) {
            num[i] = scanner.nextInt();
        }
        return num;
    }
}