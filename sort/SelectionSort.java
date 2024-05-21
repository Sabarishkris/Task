package sort;

import java.util.Arrays;
import java.util.Scanner;

public class SelectionSort {
    public static void main(String[] args) {
        System.out.println("------Selection Sort------");
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the size of array : ");
        int size=scanner.nextInt();
        System.out.println("Enter the number : ");
        int[]num=createArray(size,scanner);
        num=selectionSort(num);
        display(num);
    }

    private static int[] selectionSort(int[] num) {
        int i=0,index=0;

        boolean flag=false;
        while(i<num.length){
            int min=num[i];
            for(int j=i;j<num.length;j++){
                if(min>num[j]) {
                    min = num[j];
                    index = j;
                    flag = true;
                }
            }
            if(flag) {
                int temp = num[index];
                num[index] = num[i];
                num[i] = min;
                flag=false;
            }
            i++;
        }
        return num;
    }

    private static void display(int[] num) {
        System.out.print("Sorted array : ");
        System.out.println(Arrays.toString(num));
    }

    private static int[] createArray(int size, Scanner scanner) {
        int []num=new int[size];
        for (int i=0;i<size;i++){
            num[i]= scanner.nextInt();
        }
        return num;
    }
}
