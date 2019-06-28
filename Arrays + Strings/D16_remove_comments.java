import java.util.*;
import java.util.Scanner;

public class D16_remove_comments {
    public static ArrayList<String> removeComments(String[] source) {

        ArrayList<String> ans = new ArrayList<>();
        boolean commented = false;
        String ansString = "";
        for (int i = 0; i < source.length; i++) {
            String s = source[i];
            for(int j=0;j<source[i].length();j++){

                if(!commented){
                    if(s.charAt(j)=='/'){
                        if(s.charAt(j+1)=='/'){
                            break;
                        }else {
                            j++;
                            commented = true;
                            continue;
                        }
                    }
                    ansString += s.charAt(j);
                }else{
                    if(s.charAt(j)=='*'){
                        j++;
                        commented = false;
                    }
                }
            }
            if(!commented){
                if(!ansString.equals("")){
                    ans.add(ansString);
                }
                ansString = "";
            }


        }
        return ans;

    }

    //Don't make any changes here.
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        String[] source = new String[n+1];
        for (int i = 0; i < source.length; i++) {
            source[i] = scn.nextLine();
        }
        System.out.println(removeComments(source));
    }

}