import java.util.HashSet;
import java.util.Scanner;

public class D12_sum_length_of_substring_with_no_dupchar {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print(sum(s.next()));
    }

    public static int sum(String str) {
        int j = 0;
        int sum = 0;
        HashSet<Character> set = new HashSet<>();
        for (int i = 0; i < str.length(); i++) {
            while ((j < str.length()) && !set.contains(str.charAt(j))) {
                set.add(str.charAt(j));
                j++;
            }
            int n = set.size();
            sum += (n * (n + 1)) / 2;
            set.remove(str.charAt(i));
        }
        return sum;
    }

}
