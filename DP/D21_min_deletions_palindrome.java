import java.util.*;

public class D21_min_deletions_palindrome {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String str = scn.next();
        mindeletions(str);
    }

    // -----------------------------------------------------
    // This is a functional problem. Only this function has to be written.
    // This function takes as input a string
    // It should print the required output

    static void mindeletions(String str) {

        int[][] dp = new int[str.length()][str.length()];

        for (int g = 0; g < str.length(); g++) {
            for (int i = 0, j = g; j < str.length(); i++, j++) {
                if(i==j){
                    dp[i][i] = 1;
                }
                else if(str.charAt(i)==str.charAt(j)){
                    dp[i][j] = 2+dp[i+1][j-1];
                }else {
                    dp[i][j] = Math.max(dp[i+1][j],dp[i][j-1]);
                }
            }
        }
        System.out.println(str.length()-dp[0][str.length()-1]);


    }
}