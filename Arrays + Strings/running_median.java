import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Scanner;

public class running_median {

    private static final Scanner scanner = new Scanner(System.in);

    /*
     * Complete the runningMedian function below.
     */
    static double[] runningMedian(int[] a) {
        double[] ans = new double[a.length];
        PriorityQueue<Integer> lowPQ = new PriorityQueue<>(Comparator.reverseOrder());
        PriorityQueue<Integer> highPQ = new PriorityQueue<>();

        ans[0] = (double) a[0];
        if (a.length > 2) {
            ans[1] = (double) (a[0] + a[1]) / 2;
        }
        if (a.length <= 2) {
            return ans;
        }

        lowPQ.add(a[0]);
        lowPQ.add(a[1]);
        highPQ.add(lowPQ.remove());
        for (int i = 2; i < a.length; i++) {
            if (a[i] < highPQ.peek()) {
                lowPQ.add(a[i]);
            } else {
                highPQ.add(a[i]);
            }
            if (lowPQ.size() - highPQ.size() == 2) {
                highPQ.add(lowPQ.remove());
            } else if (highPQ.size() - lowPQ.size() == 2) {
                lowPQ.add(highPQ.remove());
            }

            if (lowPQ.size() == highPQ.size()) {
                ans[i] = (double) (lowPQ.peek() + highPQ.peek()) / 2;
            } else {
                ans[i] = (double) lowPQ.size() > highPQ.size() ? lowPQ.peek() : highPQ.peek();
            }
        }
        return ans;
    }

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int aCount = Integer.parseInt(scanner.nextLine().trim());

        int[] a = new int[aCount];

        for (int aItr = 0; aItr < aCount; aItr++) {
            int aItem = Integer.parseInt(scanner.nextLine().trim());
            a[aItr] = aItem;
        }

        double[] result = runningMedian(a);

        for (int resultItr = 0; resultItr < result.length; resultItr++) {
            bufferedWriter.write(String.valueOf(result[resultItr]));

            if (resultItr != result.length - 1) {
                bufferedWriter.write("\n");
            }
        }

        bufferedWriter.newLine();

        bufferedWriter.close();
    }
}
