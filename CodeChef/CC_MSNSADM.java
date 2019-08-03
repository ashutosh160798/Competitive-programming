import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CC_MSNSADM {

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(bf.readLine().trim());
        for (int i = 0; i < n; i++) {
            int size = Integer.parseInt(bf.readLine().trim());
            String[] goals = bf.readLine().split(" ");
            String[] fouls = bf.readLine().split(" ");
            int maxScore = 0;
            for (int j = 0; j < size; j++) {
                int goal = Integer.parseInt(goals[j]);
                int foul = Integer.parseInt(fouls[j]);
                maxScore = Math.max(maxScore, 20 * goal - 10 * foul);
            }
            System.out.println(Math.max(maxScore, 0));
        }
    }

}
