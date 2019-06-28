import java.util.Scanner;

public class D15_reverse_string {
    public static void reverseString(char[] s) {

        for (int i = 0; i < Math.floor(s.length / 2); i++) {
            char temp = s[i];
            s[i] = s[s.length - i - 1];
            s[s.length - i -1] = temp;
        }

    }

    //Don't make any changes here.
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        char[] charArray = new char[n];
        for (int i = 0; i < charArray.length; i++) {
            charArray[i] = scn.next().charAt(0);
        }

        reverseString(charArray);

        for (int i = 0; i < charArray.length; i++) {
            System.out.print(charArray[i] + " ");
        }

    }

}