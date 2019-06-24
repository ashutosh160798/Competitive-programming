import java.util.*;

public class D14_winner_of_election {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        String[] str = new String[n];
        for (int i = 0; i < n; i++) {
            str[i] = scn.next();
        }
        String[] res = func(str);
        System.out.print(res[0]);
    }
    // -----------------------------------------------------
    // This is a functional problem. Only this function has to be written
    // This function takes as input an array of string
    // It should return name of winning candidate

    public static String[] func(String[] arr) {
        HashMap<String,Integer>map = new HashMap<>();
        String ans = "";
        int max = 0;
        for(String s : arr){
            map.put(s,map.getOrDefault(s,0)+1);
            if(map.get(s)>max){
                max = map.get(s);
                ans = s;
            }
        }
        return new String[]{ans};

    }
}