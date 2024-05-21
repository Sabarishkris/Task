package sort;

import java.util.Arrays;
import java.util.Scanner;

public class BubbleSort {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("------Bubble Sort------");
        System.out.println("Enter the size of array : ");
        int size=scanner.nextInt();
        System.out.println("Enter the number : ");
        int[]num=createArray(size,scanner);
        num=bubbleSort(num);
        display(num);

//https://visualgo.net/en/sorting?slide=2
    }

    private static void display(int[] num) {
        System.out.print("Sorted array : ");
        System.out.println(Arrays.toString(num));
    }

    private static int[] bubbleSort(int[] num) {
        boolean swap=false;
        int swapcount=0;
        do{
            swap=false;
            for(int i=1;i<num.length;i++){
                if(num[i-1]>num[i]){
                    int temp=num[i-1];
                    num[i-1]=num[i];
                    num[i]=temp;
                    swap=true;
                    swapcount++;
                }
            }
        }while (swap);
        System.out.println("Swap Count : "+swapcount);
        return num;
    }

    private static int[] createArray(int size, Scanner scanner) {
        int []num=new int[size];
        for (int i=0;i<size;i++){
            num[i]= scanner.nextInt();
        }
        return num;
    }
}
