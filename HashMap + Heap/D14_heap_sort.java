import java.util.*;
public class D14_heap_sort {

    /* A utility function to print array of size n */
    static void printArray(int arr[]) {
        int n = arr.length;
        for (int i = 0; i < n; ++i)
            System.out.print(arr[i] + " ");
        System.out.println();
    }

    public static void main(String args[])
    {
        Scanner scn= new Scanner(System.in);
        int n = scn.nextInt();
        int[] arr= new int[n];
        for(int i=0;i<n;i++)
            arr[i]=scn.nextInt();
        sort(arr);
        printArray(arr);
    }

    // -----------------------------------------------------
    // This is a functional problem. Only these functions have to be written.
    // This function takes as input an array.

    static public void sort(int arr[]) {
        //Write your code here
    }

    static void heapify(int arr[], int n, int i) {
        //Write your code here
    }
}