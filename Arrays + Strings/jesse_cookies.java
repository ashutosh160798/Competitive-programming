import java.io.IOException;
import java.util.PriorityQueue;
import java.util.Scanner;

public class jesse_cookies {

    private static final Scanner scanner = new Scanner(System.in);

    /*
     * Complete the cookies function below.
     */
    static int cookies(int k, int[] A) {
        /*
         * Write your code here.
         */
        int count = 0;
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        for (int i : A) {
            pq.add(i);
        }
        while (pq.size() > 0 && pq.peek() < k) {
            if (pq.peek() < k && pq.size() == 1) {
                return -1;
            }
            pq.add(pq.remove() + 2 * pq.remove());
            count++;
        }
        return count;
    }

    public static void main(String[] args) throws IOException {

        String[] nk = scanner.nextLine().split(" ");

        int n = Integer.parseInt(nk[0].trim());

        int k = Integer.parseInt(nk[1].trim());

        int[] A = new int[n];

        String[] AItems = scanner.nextLine().split(" ");

        for (int AItr = 0; AItr < n; AItr++) {
            int AItem = Integer.parseInt(AItems[AItr].trim());
            A[AItr] = AItem;
        }

        int result = cookies(k, A);
        System.out.println(result);
    }
}
