import java.util.*;
import java.io.*;

public class D11_gap_btw_highest_and_lowest_occurrence {

    public static void findDifference(int[] arr) {

        HashMap<Integer,Integer> map = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            map.put(arr[i],map.getOrDefault(arr[i],0)+1);
        }
        Integer[] values = map.values().toArray(new Integer[map.size()]);
        Arrays.sort(values);
        System.out.println(values[values.length-1]-values[0]);

    }

    //Don't make any changes here
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[] num = new int[n];
        for (int i = 0; i < n; i++) {
            num[i] = scn.nextInt();
        }
        findDifference(num);
    }
}