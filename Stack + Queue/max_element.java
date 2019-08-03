import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Collections;
import java.util.PriorityQueue;
import java.util.Stack;

public class max_element {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
        int n = Integer.parseInt(br.readLine());
        Stack<Integer> stack = new Stack<>();
        for (int i = 0; i < n; i++) {
            String[] str = br.readLine().split(" ");
            if (str[0].equals("1")) {
                int x = Integer.parseInt(str[1]);
                stack.push(x);
                pq.add(x);
            } else if (str[0].equals("2")) {
                int x = stack.pop();
                pq.remove(x);
            } else {
                System.out.println(pq.peek());
            }

        }
    }
}

