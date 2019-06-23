import java.lang.*;
import java.io.*;
import java.util.*;

class D13_intersection_of_arr
{
    public static void main (String[] args) throws IOException
    {
        Scanner scn= new Scanner(System.in);
        int n = scn.nextInt();
        int[] num = new int[n];
        for (int i = 0; i < n; i++) {
            num[i] = scn.nextInt();
        }
        int m = scn.nextInt();
        int[] num2 = new int[m];
        for (int i = 0; i < m; i++) {
            num2[i] = scn.nextInt();
        }

        solve(n,m,num,num2);
    }
    // -----------------------------------------------------
    // This is a functional problem. Only this function has to be written.
    // This function takes as input two arrays and their lengths
    // Print required output
    public static void solve(int m,int n,int[] arr1,int[] arr2){

        HashSet<Integer> set = new HashSet<>();
        HashSet<Integer> set1 = new HashSet<>();
        HashSet<Integer> set2 = new HashSet<>();
        for(int i=0;i<arr1.length;i++){
            set.add(arr1[i]);
            set1.add(arr1[i]);
        }
        for(int i=0;i<arr2.length;i++){
            set.add(arr2[i]);
            set2.add(arr2[i]);
        }
        System.out.print(set1.size()+set2.size()-set.size());

    }


}