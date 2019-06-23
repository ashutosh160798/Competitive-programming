import java.util.*;
import java.lang.*;
import java.io.*;
class D13_fcfs
{
    public static void main (String[] args)
    {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int k=scn.nextInt();
        int[] num = new int[n];
        for (int i = 0; i < n; i++) {
            num[i]= scn.nextInt();
        }
        solve(num,k);
    }

    // -----------------------------------------------------
    // This is a functional problem. Only this function has to be written.
    // This function takes as input an array and k occurunces.
    // Print id of customer which will be served first.
    public static  void solve(int[] arr,int k){
        LinkedHashMap<Integer,Integer>map = new LinkedHashMap<>();
        for (int i=0;i<arr.length;i++){
            map.put(arr[i],map.getOrDefault(arr[i],0)+1);
        }
        for (int key:map.keySet()){
            if(map.get(key)==k){
                System.out.print(key);
                return;
            }
        }
        System.out.print(-1);
    }
}