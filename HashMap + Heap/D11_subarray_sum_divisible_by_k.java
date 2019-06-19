import java.util.*;
import java.io.*;

public class D11_subarray_sum_divisible_by_k {

    // -----------------------------------------------------
    // This is a functional problem. Only this function has to be written.

    public static int subarraysDivByK(int[] arr, int K) {

        int count = 0;
        HashMap<Integer, Integer> map = new HashMap<>();
        map.put(0, 1);
        int prefetchsum = 0;
        for (int i = 0; i < arr.length; i++) {
            prefetchsum += arr[i];
            prefetchsum = prefetchsum % K;
            if (prefetchsum < 0) {
                prefetchsum += K;
            }
            if (map.containsKey(prefetchsum)) {
                count += map.get(prefetchsum);
            }
            map.put(prefetchsum, map.getOrDefault(prefetchsum, 0) + 1);

        }
        return count;

    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int k = scn.nextInt();
        int[] arr = new int[n];
        for (int z = 0; z < n; z++) {
            arr[z] = scn.nextInt();
        }
        System.out.println(subarraysDivByK(arr, k));
    }
}