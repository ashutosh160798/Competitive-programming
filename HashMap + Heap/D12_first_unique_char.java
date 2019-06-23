import java.util.*;
class D12_first_unique_char {

    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        String s= scn.next();
        System.out.print(firstUniqChar(s));
    }
    // -----------------------------------------------------
    // This is a functional problem. Only this function has to be written.
    // This function takes as input a String s
    // Return index of first unique character, if none present, return -1
    public static int firstUniqChar(String s) {
        LinkedHashMap<Character,Integer>map = new LinkedHashMap<>();
        for(char c: s.toCharArray()){
            map.put(c,map.getOrDefault(c,0)+1);
        }
        for(char c : map.keySet()){
            if(map.get(c)==1){
                return s.indexOf(c);
            }
        }
        return -1;
    }
}