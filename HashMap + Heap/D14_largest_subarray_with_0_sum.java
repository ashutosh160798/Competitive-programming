import java.util.*;
import java.lang.*;
import java.io.*;

class D14_largest_subarray_with_0_sum {

    static int maxLen(int arr[], int n) {

        HashMap<Integer, Integer> map = new HashMap<>();
        map.put(0, -1);
        int ans = 0;
        int prefetch = 0;
        for (int i = 0; i < arr.length; i++) {
            prefetch += arr[i];
            if (map.containsKey(prefetch)) {
                ans = Math.max(ans, i - map.get(prefetch));
            } else {
                map.put(prefetch, i);
            }
        }
        return ans;

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println(maxLen(arr, n));
    }
}