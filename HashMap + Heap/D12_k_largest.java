import java.util.*;
import java.lang.*;
import java.io.*;
class D12_k_largest
{
    public static void main (String[] args) throws IOException
    {
        Scanner scn= new Scanner(System.in);
        int n = scn.nextInt();
        int[] num = new int[n];
        for (int i = 0; i < n; i++) {
            num[i] = scn.nextInt();
        }
        int k = scn.nextInt();
        solve(n,num,k);
    }
    // -----------------------------------------------------
    // This is a functional problem. Only this function has to be written.
    // This function takes as input an array,n length of array and k.
    // It should print required output.
    public static void solve(int n,int[] arr,int k){
        PriorityQueue<Integer> q = new PriorityQueue<>(Collections.reverseOrder());
        for(int i=0;i<n;i++){
            q.add(arr[i]);
        }
        while(k-->0){
            System.out.print(q.remove()+" ");
        }
    }
}