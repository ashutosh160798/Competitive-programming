import java.util.*;

public class D16_flip_game {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String s = scn.next();
        List<String> res = generatePossibleNextMoves(s);
        System.out.print(res);
    }

    // -----------------------------------------------------
    // This is a functional problem. Only this function has to be written.
    // This function takes as input a string
    // It should return required List

    public static List<String> generatePossibleNextMoves(String s) {

        List<String> ans = new ArrayList<>();
        for (int i = 0; i < s.length() - 1; i++) {
            if (s.charAt(i) == s.charAt(i + 1) && s.charAt(i) == '+') {
                if (i < s.length() - 2)
                    ans.add(s.substring(0, i) + "--" + s.substring(i + 2));
                else
                    ans.add(s.substring(0, i) + "--");
            }
        }
        return ans;
    }
}