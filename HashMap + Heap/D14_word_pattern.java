import java.util.*;

public class D14_word_pattern {

    public static void main(String[] args) {
        Scanner scn= new Scanner(System.in);
        String pattern= scn.nextLine();
        String str= scn.nextLine();
        System.out.println(wordPattern(pattern,str));
    }
    // -----------------------------------------------------
    // This is a functional problem. Only this function has to be written.
    // This function takes as input 2 strings
    // It should return a boolean value

    static Boolean wordPattern(String pattern, String str) {

        HashMap<Character,String> map = new HashMap<>();
        String[] arr = str.split(" ");
        if(arr.length!=pattern.length()){
            return false;
        }
        for(int i=0;i<pattern.length();i++){
            if(map.containsKey(pattern.charAt(i))){
                if(!map.get(pattern.charAt(i)).equals(arr[i])){
                    return false;
                }
            }else{
                map.put(pattern.charAt(i),arr[i]);
            }
        }
        return true;

    }

}