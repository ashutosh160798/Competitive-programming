import java.io.IOException;
import java.util.*;

class D14_longest_consecutive_subsequence {

    public static int consecuitveSub(int n, int[] arr) {

        int count = 0;
        HashMap<Integer, Boolean> map = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            map.put(arr[i], false);
        }
        for (int i = 0; i < arr.length; i++) {
            if (!map.containsKey(arr[i] - 1)) {
                map.put(arr[i], true);
            }
        }
        for (int i = 0; i < arr.length; i++) {
            if (map.get(arr[i])) {
                int x = 0;
                int y=arr[i];
                while (map.containsKey(y)) {
                    x++;
                    y++;
                }
                count = Math.max(count, x);
            }
        }
        return count;
    }

    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] num = new int[n];
        for (int i = 0; i < n; i++) {
            num[i] = sc.nextInt();
        }
        System.out.println(consecuitveSub(n, num));

    }

}