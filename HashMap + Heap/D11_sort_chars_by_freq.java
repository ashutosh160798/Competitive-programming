import java.util.*;

public class D11_sort_chars_by_freq {

    public static String frequencySort(String s) {

        String ans="";
        HashMap<Character,Integer>map = new HashMap<>();
        for(char c : s.toCharArray()){
            map.put(c,map.getOrDefault(c,0)+1);
        }
        Integer [] values = map.values().toArray(new Integer[map.size()]);
        Arrays.sort(values);
        for(int i=values.length-1;i>=0;i--){
            char c='a';
            for(char b:map.keySet()){
                if(map.get(b)==values[i]){
                    c = b;
                    map.remove(b);
                    break;
                }
            }
            for(int j=0;j<values[i];j++){
                ans+=c;
            }

        }
        return ans;
    }


    //Dont make changes here
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print(frequencySort(sc.next()));
    }

}