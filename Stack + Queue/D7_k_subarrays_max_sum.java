import java.util.*;
import java.lang.*;
import java.io.*;

class D7_k_subarrays_max_sum {
    public static void printMax(int[] arr,int k){

    }

    public static void main (String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n =sc.nextInt();
        int k=sc.nextInt();

        int []arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();

            printMax(arr,k);
        }
    }
}