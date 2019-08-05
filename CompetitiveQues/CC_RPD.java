import java.io.BufferedReader;
import java.io.InputStreamReader;

public class CC_RPD {
    public static void main(String[] args) throws java.lang.Exception {
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);
        int n = Integer.parseInt(br.readLine().trim());
        for (int i = 0; i < n; i++) {
            int size = Integer.parseInt(br.readLine().trim());
            int[] arr = new int[size];
            String[] strings = br.readLine().split(" ");
            for (int j = 0; j < size; j++) {
                arr[j] = Integer.parseInt(strings[j]);
            }
            System.out.println(getMaxSum(arr));
        }
    }


    private static int getMaxSum(int[] arr) {

        int max = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                int num = arr[i] * arr[j];
                max = Math.max(max, sumOfdigits(num));
            }
        }
        return max;
    }

    private static int sumOfdigits(int m) {
        int n, sum = 0;
        while (m > 0) {
            n = m % 10;
            sum = sum + n;
            m = m / 10;
        }
        return sum;

    }
}
