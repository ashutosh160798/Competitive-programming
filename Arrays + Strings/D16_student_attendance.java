import java.util.*;

public class D16_student_attendance {

    // This is a functional problem. You have to complete this function.
    // It takes as input a String S. It should return true if the student could
    // be rewarded, else should return false.
    public static boolean checkRecord(String s) {

        int count = 0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='A'){
                count++;
            }
            if(i<s.length()-1 && s.charAt(i)==s.charAt(i+1)&&s.charAt(i)=='L'){
                count++;
            }
        }
        return count<=2;


    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String S = sc.next();

        if (checkRecord(S)) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }

    }
}