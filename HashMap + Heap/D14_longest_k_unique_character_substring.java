import java.util.*;
import java.io.*;

public class D14_longest_k_unique_character_substring {


    public static void print(String str, int k) {

        HashMap<Character, Integer> map = new HashMap<>();
        int i = 0;
        int j = 0;
        int length = 0;
        while (i < str.length() && j < str.length()) {
            while (i < str.length() && map.size() <= k) {
                map.put(str.charAt(i), map.getOrDefault(str.charAt(i), 0) + 1);
                i++;
            }
            length = Math.max(length, i - j);
            while (j < str.length() && map.size() >= k) {
                if (map.get(str.charAt(j)) == 1) {
                    map.remove(str.charAt(j));
                } else {
                    map.put(str.charAt(j), map.get(str.charAt(j)) - 1);
                }
                j++;
            }

        }
        System.out.print(length);

    }

    //Don't make any changes here.
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();
        int k = Integer.parseInt(br.readLine());
        print(s, k);
    }


}