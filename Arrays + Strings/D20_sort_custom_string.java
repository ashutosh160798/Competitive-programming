import java.util.*;

class D20_sort_custom_string {
    public static void main(String[] args){
        Scanner scn= new Scanner(System.in);
        String S= scn.next();
        String T=scn.next();
        System.out.print(customSortString(S, T));
    }
    // -----------------------------------------------------
    // This is a functional problem. Only this function has to be written.
    // This function takes as input two strings
    // It should return required output.

    public static String customSortString(String S, String T) {
        HashMap<Character,Integer> map = new HashMap<>();
        for(char c : T.toCharArray()){
            map.put(c,map.getOrDefault(c,0)+1);
        }
        String ans = "";
        for (char c : S.toCharArray()){
            while (map.containsKey(c)){
                ans+=c;
                map.put(c,map.get(c)-1);
                if(map.get(c)==0)
                    map.remove(c);
            }
        }
        String extra="";
        for(Character c : map.keySet()){
            extra+=c;
        }
        char[] arr = extra.toCharArray();
        Arrays.sort(arr);
        for (char c : arr){
            while (map.containsKey(c)){
                ans+=c;
                map.put(c,map.get(c)-1);
                if(map.get(c)==0)
                    map.remove(c);
            }
        }
        return ans;
    }
}