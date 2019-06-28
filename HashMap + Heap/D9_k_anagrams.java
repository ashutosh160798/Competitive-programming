import java.util.*;

public class D9_k_anagrams {
    public static boolean areKAnagrams(String str1, String str2, int k) {

        if (str1.length() != str2.length()) {
            return false;
        }
        HashMap<Character,Integer>map = new HashMap<>();
        for (char c : str1.toCharArray()) {
            map.put(c,map.getOrDefault(c,0)+1);
        }
        for(char c : str2.toCharArray()){
            if(k<0){
                return false;
            }
            if(!map.containsKey(c)){
                k--;
                continue;
            }
            map.put(c,map.get(c)-1);
            if(map.get(c)==0){
                map.remove(c);
            }
        }
        return k >= 0;

    }

    //Don't make changes here
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        String str1 = s.next();
        String str2 = s.next();
        int k = s.nextInt();
        System.out.println(areKAnagrams(str1, str2, k));

    }

}