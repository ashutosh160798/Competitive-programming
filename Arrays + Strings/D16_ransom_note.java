import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;

public class D16_ransom_note {
    public static boolean canConstruct(String rans, String magazine) {

        char[] mag= magazine.toCharArray();
        Arrays.sort(mag);
        char[] ran = rans.toCharArray();
        Arrays.sort(ran);
        magazine = new String(mag);
        rans = new String(ran);
        return magazine.contains(rans);


    }
    //Don't make any changes here
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String s = scn.next();
        String t = scn.next();
        System.out.print(canConstruct(s, t));

    }

}