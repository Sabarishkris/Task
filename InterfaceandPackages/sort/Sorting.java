package InterfaceandPackages.sort;

import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Sorting implements methods {

    @Override
    public int[] bubbleSort(int []nums) {
        for(int i=0;i<nums.length;i++){
            for(int j=0;j<nums.length;j++){
                if(nums[i]>nums[j]){
                    int temp=nums[i];
                    nums[i]=nums[j];
                    nums[j]=temp;
                }
            }
        }
        return nums;
    }

    @Override
    public void mergeSort(int arr[]) {

        mergeSort(arr, 0, arr.length - 1);
    }

       public void mergeSort(int[] arr, int left, int right) {
            if (left < right) {
                int mid = left + (right - left) / 2;
                mergeSort(arr, left, mid);
                mergeSort(arr, mid + 1, right);
                merge(arr, left, mid, right);
            }
        }

        public void merge(int[] arr, int left, int mid, int right){
            int n1 = mid - left + 1;
            int n2 = right - mid;
            int[] L = new int[n1];
            int[] R = new int[n2];
            for (int i = 0; i < n1; i++) {
                L[i] = arr[left + i];
            }
            for (int j = 0; j < n2; j++) {
                R[j] = arr[mid + 1 + j];
            }
            int i = 0, j = 0, k = left;
            while (i < n1 && j < n2) {
                if (L[i] <= R[j]) {
                    arr[k] = L[i];
                    i++;
                } else {
                    arr[k] = R[j];
                    j++;
                }
                k++;
            }
            while (i < n1) {
                arr[k] = L[i];
                i++;
                k++;
            }
            while (j < n2) {
                arr[k] = R[j];
                j++;
                k++;
            }
        }

    @Override
    public void quickSort(int arr[]) {
        quick(arr, 0, arr.length - 1);
    }

       public int partition(int a[], int start, int end) {
            int pivot = a[end];
            int i = (start - 1);

            for (int j = start; j <= end - 1; j++) {
                if (a[j] < pivot) {
                    i++;
                    int t = a[i];
                    a[i] = a[j];
                    a[j] = t;
                }
            }
            int t = a[i + 1];
            a[i + 1] = a[end];
            a[end] = t;
            return (i + 1);
        }

       public void quick(int a[], int start, int end) {
            if (start < end) {
                int p = partition(a, start, end);
                quick(a, start, p - 1);
                quick(a, p + 1, end);
            }
        }

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size : ");
        int size= sc.nextInt();
        System.out.println("Enter array : ");
        int nums[]=createArray(size,sc);
        selectChoice(nums,sc);

    }

    private static void selectChoice(int[] nums,Scanner sc) {
        Sorting sort =new Sorting();
        while (true){
            System.out.println("Select Algorithm  \n1) Bubble sort \n2) Quick sort \n3) Merge sort");
            try {
                int choice = sc.nextInt();
                switch (choice) {
                    case 1:
                        int ans[] = sort.bubbleSort(nums);
                        System.out.println(Arrays.toString(ans));
                        break;
                    case 2:
                         sort.quickSort(nums);
                        System.out.println(Arrays.toString(nums));
                        break;
                    case 3:
                        sort.mergeSort(nums);
                        System.out.println(Arrays.toString(nums));
                        break;
                    default:
                        System.out.println("Invalid choice !....");

                }
            }catch (InputMismatchException e ){
                System.out.println("Input Mismatch ");
                selectChoice(nums,sc);
            }
        }

    }

    private static int[] createArray(int size,Scanner sc) {
        int nums[]=new int[size];
        for(int i=0;i<size;i++){
            nums[i]= sc.nextInt();
        }
        return nums;
    }

}
