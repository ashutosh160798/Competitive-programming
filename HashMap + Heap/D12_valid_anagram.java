import java.util.*;

public class D12_valid_anagram {

    // This is a functional problem. You have to complete this function.
    // It takes as input the String s ant t. It should return true if t is
    // and anagram of s, else should return false.

    public static boolean isAnagram(String s, String t) {
        int a = 0;
        for(int i=0;i<s.length();i++){
            a = a^s.charAt(i);
        }
        for(int i=0;i<t.length();i++){
            a = a^t.charAt(i);
        }
        return a == 0;

    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        String t = sc.next();

        if (isAnagram(s, t)) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }

}