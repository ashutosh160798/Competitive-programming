import java.util.*;

public class D15_shifting_letter {

    // This is a functional problem. You have to complete this function.
    // It takes as input a String S and an integer array shifts.
    // It should return the final string after all the shifts are applied.
    public static String shiftingLetters(String S, int[] shifts) {
        char[] chars=S.toCharArray();
        int sum=0;

        for(int i=shifts.length-1;i>=0;i--) {
            sum=(sum+shifts[i])%26;

            chars[i] +=sum;

            if(chars[i]>'z') {
                chars[i]-=26;
            }
        }

        return new String(chars);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String S = sc.next();

        int N = sc.nextInt();

        int[] shifts = new int[N];

        for (int i = 0; i < N; i++) {
            shifts[i] = sc.nextInt();
        }

        System.out.println(shiftingLetters(S, shifts));
    }
}