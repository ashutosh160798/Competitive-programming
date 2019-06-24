import java.util.*;

public class D14_longest_substring_with_equal_0_1 {

    public static void print(char[] A) {
        int[] arr = new int[A.length];
        for (int i = 0; i < A.length; i++) {
            if (A[i] == '0') {
                arr[i] = -1;
            } else {
                arr[i] = 1;
            }
        }
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

        System.out.print(ans);


    }

    //Don't make any changes here.
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        String str = s.next();
        char[] ans = str.toCharArray();
        print(ans);
    }

}