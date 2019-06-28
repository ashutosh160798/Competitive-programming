import java.util.*;

public class D15_add_bold_tag {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String s = scn.next();
        int n = scn.nextInt();
        String[] dict = new String[n];
        for (int i = 0; i < n; i++) {
            dict[i] = scn.next();
        }
        System.out.println(addBoldTag(s, dict));
    }

    // -----------------------------------------------------
    // This is a functional problem. Only this function has to be written.
    // This function takes as input an array of strings and a string
    // It should return required output.
    public static String addBoldTag(String s, String[] dict) {
        boolean[] arr = new boolean[s.length()];
        for(String i:dict){
            int k=0;
            while (true) {
                int index = s.indexOf(i,k++);
                if (index == -1)
                    break;
                for (int j = 0; j < i.length(); j++) {
                    arr[index + j] = true;
                }
            }
        }

        boolean flag = false;
        int j = 0;
        for (int i = 0; i < arr.length; i++) {
            if (!flag && arr[i]) {
                s = s.substring(0, j) + "<b>" + s.substring(j);
                j+=3;
                flag = true;
            } else if (flag && !arr[i]) {
                s = s.substring(0, j) + "</b>" + s.substring(j);
                j+=4;
                flag = false;
            }
            j++;
        }
        if(flag){
            s = s + "</b>";
        }
        return s;


    }
}