import java.util.HashMap;
import java.util.HashSet;
import java.util.Scanner;

public class D14_equivalent_subarrays {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scn.nextInt();
        }
        System.out.println(val(arr));
    }

    // -----------------------------------------------------
    // This is a functional problem. Only this function has to be written.
    // This function takes as input an array
    // It should return an integer value.
    public static int val(int[] arr) {

        HashSet<Integer> set = new HashSet<>();
        for (int i = 0; i < arr.length; i++) {
            set.add(arr[i]);
        }
        int count = 0;
        int i = 0;
        int j = 0;
        HashMap<Integer,Integer> miniMap = new HashMap<>();
        while (j < arr.length) {
            while (i < arr.length && miniMap.size() < set.size()) {
                miniMap.put(arr[i],miniMap.getOrDefault(arr[i],0)+1);
                i++;
            }
            if(miniMap.size()==set.size())
                count = count + arr.length-i+1;
            if(miniMap.get(arr[j])==1){
                miniMap.remove(arr[j]);
            }else {
                miniMap.put(arr[j],miniMap.get(arr[j])-1);
            }
            j++;

        }
        return count;

    }
}