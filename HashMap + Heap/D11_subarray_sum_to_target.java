import java.util.*;
import java.io.*;

public class D11_subarray_sum_to_target {

    // -----------------------------------------------------
    // This is a functional problem. Only this function has to be written.

    static int subArraySum(int arr[], int n, int sum) {

        int count=0;
        HashMap<Integer,Integer> map = new HashMap<>();
        map.put(0,1);
        int prefetchsum=0;
        for (int i=0;i<arr.length;i++) {
            prefetchsum += arr[i];
            if (map.containsKey(prefetchsum - sum)) {
                count += map.get(prefetchsum - sum);
            }
            map.put(prefetchsum, map.getOrDefault(prefetchsum, 0) + 1);

        }
        return count;

    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int sum = scn.nextInt();
        int[] arr = new int[n];
        for (int z = 0; z < n; z++) {
            arr[z] = scn.nextInt();
        }
        System.out.println(subArraySum(arr, n, sum));
    }
}