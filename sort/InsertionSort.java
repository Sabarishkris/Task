package sort;

import java.util.Arrays;
import java.util.Scanner;

public class InsertionSort {
    public static void main(String[] args) {
        System.out.println("------Insertion Sort------");
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the size of array : ");
        int size=scanner.nextInt();
        System.out.println("Enter the number : ");
        int[]num=createArray(size,scanner);
        num=insertionSort(num);
        display(num);
    }

    private static int[] insertionSort(int[] num) {
        int i=1;
       while(i<num.length){
           int sort=num[i];
           int j=i-1;
           while(j>=0){
               if(sort<num[j]){
                   num[j+1]=num[j];
                   j--;
               }else{
                   break;
               }
           }
           num[j+1]=sort;
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
