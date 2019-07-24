import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class D23_coin_game {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        while (--t >= 0) {
            int n = Integer.parseInt(br.readLine());

            // Declaring array
            int arr[] = new int[n];

            // to read multiple integers line
            String line = br.readLine();
            String[] strs = line.trim().split("\\s+");

            // array elements input
            for (int i = 0; i < n; i++)
                arr[i] = Integer.parseInt(strs[i]);
            int evensum = 0, oddsum = 0;
            for (int i = 0; i < arr.length; i+=2) {
                evensum += arr[i];
            }
            for (int i = 1; i < arr.length; i+=2) {
                oddsum += arr[i];
            }
            game(arr, evensum, oddsum, 0, arr.length - 1, 0);
        }
    }

    private static void game(int[] arr, int evenSum, int oddSum, int start, int end, int sum) {

        if (start > end) {
            System.out.println(sum);
            return;
        }

        if (evenSum > oddSum) {
            if (start % 2 == 0) {
                sum += arr[start];
                evenSum -= arr[start];
                start++;
            } else {
                sum += arr[end];
                evenSum -= arr[end];
                end--;
            }
            if (arr[start] > arr[end]) {
                game(arr, evenSum, oddSum - arr[start], start + 1, end, sum);
            } else {
                game(arr, evenSum, oddSum - arr[end], start, end - 1, sum);
            }

        } else {
            if (start % 2 == 1) {
                sum += arr[start];
                oddSum -= arr[start];
                start++;
            } else {
                sum += arr[end];
                oddSum -= arr[end];
                end--;
            }
            if (arr[start] > arr[end]) {
                game(arr, evenSum - arr[start], oddSum, start + 1, end, sum);
            } else {
                game(arr, evenSum - arr[end], oddSum, start, end - 1, sum);
            }
        }


    }

}
