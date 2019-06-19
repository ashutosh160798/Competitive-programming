import java.util.*;

public class D11_subarray_with_sum_0 {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        int size = scn.nextInt();

        long[] arr = new long[size];

        for (int j = 0; j < size; j++) {
            arr[j] = scn.nextLong();
        }

        zerosumarr(arr);

    }

    // -----------------------------------------------------
    // This is a functional problem. Only this function has to be written.
    // This function takes as input an array
    // Print required output
    static void zerosumarr(long[] arr) {
        int count=0;
        HashMap<Integer,Integer> map = new HashMap<>();
        map.put(0,1);
        int prefetchsum=0;
        for (int i=0;i<arr.length;i++) {
            prefetchsum += arr[i];
            if (map.containsKey(prefetchsum)) {
                count += map.get(prefetchsum);
            }
            map.put(prefetchsum, map.getOrDefault(prefetchsum, 0) + 1);

        }
        System.out.println(count);
    }
}