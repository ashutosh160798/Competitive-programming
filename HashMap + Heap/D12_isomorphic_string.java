import java.util.*;
class D12_isomorphic_string{
    public static void main(String[] args){
        Scanner scn= new Scanner(System.in);
        String A= scn.next();
        String B= scn.next();
        System.out.print(isIsomorphic(A, B));
    }
    // -----------------------------------------------------
    // This is a functional problem. Only this function has to be written.
    // This function takes as input 2 strings.
    // It should return a boolean value.

    public static boolean isIsomorphic(String s, String t) {
        HashMap<Character,Character> map = new HashMap<>();
        if(s.length()!=t.length())
            return false;
        for(int i=0;i<s.length();i++){
            if(map.containsKey(s.charAt(i))&&map.get(s.charAt(i))!=t.charAt(i))
                return false;
            else
                map.put(s.charAt(i),t.charAt(i));
        }

        return true;
    }
}