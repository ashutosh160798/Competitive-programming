import java.util.*;

public class D12_tiger_zinda_hai {

    public static int open_closeTabs(String[] T) {
        HashSet<String>set = new HashSet<>();
        for (String str : T){
            if(str.equals("END")){
                set.clear();
                continue;
            }
            if(set.contains(str)){
                set.remove(str);
            }else {
                set.add(str);
            }
        }
        return set.size();
    }

    //Dont make changes here
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String[] T = new String[n];
        for (int i = 0; i < n; i++) {
            T[i] = sc.next();
        }
        System.out.println(open_closeTabs(T));
    }

}