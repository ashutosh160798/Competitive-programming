import java.util.*;
import java.lang.*;
import java.io.*;
class D12_find_unique_element
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
    // This function takes as input an array and n length of array.
    // It should return a boolean value.
    public static void solve(int [] arr,int k){

        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i=0;i<arr.length;i++){
            map.put(arr[i],map.getOrDefault(arr[i],0)+1);
        }
        for (int a : map.keySet()){
            if(map.get(a)!=k){
                System.out.print(a);
                return;
            }
        }

    }
}