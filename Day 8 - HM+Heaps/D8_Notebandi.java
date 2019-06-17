import java.util.*;

public class D8_Notebandi {

    public static void removeString(String str, String m, String n) {

        str = str.replaceAll(m, "");
        str = str.replaceAll(n, "");
        System.out.println(str);

    }


    //Dont make changes here
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        String m = sc.next();
        String n = sc.next();
        removeString(str, m, n);
    }

}