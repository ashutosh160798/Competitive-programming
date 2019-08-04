import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;

public class GS_max_commonality {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        String s = bufferedReader.readLine();

        System.out.println(maxLCS(s));

        bufferedReader.close();
    }

    private static int maxLCS(String s) {

        HashMap<Character, Integer> map = new HashMap<>();
        for (char c : s.toCharArray()) {
            map.put(c, map.getOrDefault(c, 0) + 1);
        }
        int max = 0;
        HashMap<Character, Integer> map2 = new HashMap<>();
        for (char c : s.toCharArray()) {
            int common = 0;
            map2.put(c, map2.getOrDefault(c, 0) + 1);
            for (char ch : map2.keySet()) {
                if (map2.get(ch) < map.get(ch)) {
                    common += Math.min(map2.get(ch), map.get(ch) - map2.get(ch));
                }
                max = Math.max(max, common);
            }
        }
        return max;
    }
}
