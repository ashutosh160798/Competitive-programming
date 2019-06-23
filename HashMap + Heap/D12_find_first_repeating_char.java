import java.util.*;

public class D12_find_first_repeating_char {

    // This is a functional problem. You have to complete this function.
    // It takes as input the String s. It should return the first repeated
    // character if present, else should return $.
    public static char solve(String s) {

        HashSet<Character> set = new HashSet<>();
        for(int i=0;i<s.length();i++){
            if(set.contains(s.charAt(i))){
                return s.charAt(i);
            }
            set.add(s.charAt(i));
        }

        return '$';
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        System.out.println(solve(str));

    }

}