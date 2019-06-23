import java.util.*;

public class D12_most_freq_digit {

    // This is a functional problem. You have to complete this function.
    // It takes as input the String s representing the number. It should return
    // the most occurring digit in s.
    public static int solve(String s) {
        HashMap<Character,Integer>map = new HashMap<>();
        int max = 0;
        Character freq = '$';
        for(char c : s.toCharArray()){
            map.put(c,map.getOrDefault(c,0)+1);
            max=Math.max(max,map.get(c));
        }
        for(char c : map.keySet()){
            if(map.get(c)==max){
                if(freq=='$'){
                    freq = c;
                }else {
                    freq = (char)Math.max(c,freq);
                }
            }
        }

        return freq-48;

    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        System.out.println(solve(s));

    }

}