    import java.util.*;
    import java.io.*;

    public class D14_longest_subarray_with_sum_k {

        public static void print(int n, int[] arr, int k) {

            HashMap<Integer, Integer> map = new HashMap<>();
            map.put(0, -1);
            int ans = 0;
            int prefetch = 0;
            for (int i = 0; i < arr.length; i++) {
                prefetch+=arr[i];
                if(!map.containsKey(prefetch)){
                    map.put(prefetch,i);
                }
                if(map.containsKey(prefetch - k)){
                    ans = Math.max(ans,i-map.get(prefetch-k));
                }
            }

            System.out.print(ans);

        }

        //Don't make any changes here.
        public static void main(String[] args) {

            Scanner s = new Scanner(System.in);
            int n = s.nextInt();
            int k = s.nextInt();
            int[] num = new int[n];
            for (int i = 0; i < n; i++) {
                num[i] = s.nextInt();
            }
            print(n, num, k);
        }


    }