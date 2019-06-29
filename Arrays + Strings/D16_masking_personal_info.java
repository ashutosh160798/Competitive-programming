import java.util.*;

public class D16_masking_personal_info {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String str = scn.next();
        System.out.print(maskPII(str));
    }

    // -----------------------------------------------------
    // This is a functional problem. Only this function has to be written.
    // This function takes as input a string
    // It should return required output.

    public static String maskPII(String S) {
        S = S.toLowerCase();
        if(S.contains("@")){
            return S.charAt(0)+"*****"+S.charAt(S.indexOf("@")-1)+S.substring(S.indexOf("@"));
        }

        char []modify = S.toCharArray();
        String digits = "";
        for (int i=0;i<modify.length;i++){
            if(modify[i]!='('&&modify[i]!=')'&&modify[i]!='-'&&modify[i]!='+')
                digits+=modify[i];
        }
        String ans = "***-***-"+digits.substring(digits.length()-4);
        if(digits.length()==10){
            return "+-"+ans;
        }else {
            String x = "+";
            for(int i=0;i<digits.length()-10;i++){
                x+="*";
            }
            x+="-";
            ans = x+ans;
            return ans;
        }

    }
}