import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;

public class CC_ZOMCAV {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = 0;
        try {
            n = Integer.parseInt(br.readLine().trim());
        } catch (Exception e) {

        }
        for (int i = 0; i < n; i++) {
            int num = Integer.parseInt(br.readLine().trim());
            String[] caves = br.readLine().split(" ");
            String[] zombies = br.readLine().split(" ");
            int[] caveArr = new int[num];
            int[] zomArr = new int[num];
            for (int j = 0; j < num; j++) {
                caveArr[j] = Integer.parseInt(caves[j]);
                zomArr[j] = Integer.parseInt(zombies[j]);
            }
            System.out.println(kill(caveArr, zomArr));

        }
    }

    private static String kill(int[] caveArr, int[] zomArr) {

        int n = caveArr.length;
        int[] finalCave = new int[n + 1];
        for (int i = 0; i < n; i++) {
            int effect = caveArr[i];
            int startIndex = Math.max(i - effect, 0);
            int endIndex = Math.min(i + effect, n - 1);
            finalCave[startIndex] += 1;
            finalCave[endIndex + 1] -= 1;
        }
        int sum = 0;
        for (int i = 0; i < finalCave.length; i++) {
            int x = finalCave[i];
            finalCave[i] += sum;
            sum += x;
        }
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < finalCave.length - 1; i++) {
            map.put(finalCave[i], map.getOrDefault(finalCave[i], 0) + 1);
        }
        for (int i : zomArr) {
            if (!map.containsKey(i)) {
                return "NO";
            }
            map.put(i, map.get(i) - 1);
            if (map.get(i) == 0) {
                map.remove(i);
            }
        }
        if (map.size() == 0) {
            return "YES";
        } else {
            return "NO";
        }
    }

}
