import java.util.HashMap;
import java.util.Scanner;

public class D11_subarray_with_equal_0_1 {

    public static int countSubArrays(int[] arr, int n) {

        for(int i=0;i<arr.length;i++){
            if(arr[i]==0)
                arr[i]=-1;
        }
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
        return count;
    }

    //Don't make any changes here.
    public static void main(String[] args) {
        // code
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = in.nextInt();
        }
        System.out.println(countSubArrays(a, n));

    }

}