import java.util.*;

public class D15_longest_repeating_char_replacement {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String s = scn.next();
        int k = scn.nextInt();
        System.out.println(characterReplacement(s, k));
    }

    // -----------------------------------------------------
    // This is a functional problem. Only this function has to be written.
    // This function takes as input an array and integer k.
    // It should return required output.

    public static int characterReplacement(String s, int k) {
        int ans = 0;
        int j=0;
        for (int i = 0; i < s.length(); i++) {
            //a*sr*
            while(k>=0 && j<s.length()){
                if(s.charAt(j++)!=s.charAt(i)){
                    k--;
                }
            }
            ans = Math.max(ans,j-i-1);
            while(k<0 && i<s.length()-2){
                if(s.charAt(i++)!=s.charAt(i+1)){
                    k++;
                }
            }
        }

        return ans;


    }
}