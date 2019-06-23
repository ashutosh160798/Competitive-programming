import java.util.*;

public class D12_uncommon_words {
    public static String[] uncommonFromSentences(String A, String B) {
        HashMap<String,Integer>map = new HashMap<>();
        for(String s : A.split(" ")){
            map.put(s,map.getOrDefault(s,0)+1);
        }
        for(String s : B.split(" ")){
            map.put(s,map.getOrDefault(s,0)+1);
        }
        ArrayList<String> ans = new ArrayList<>();
        for(String s : map.keySet()){
            if(map.get(s)==1){
                ans.add(s);
            }
        }
        return ans.toArray(new String[ans.size()]);
    }
    //Don't make any changes here
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        String A = s.nextLine();
        String B = s.nextLine();

        String ans[] = uncommonFromSentences(A, B);
        Arrays.sort(ans);
        for (int i = 0; i < ans.length; i++) {
            System.out.print(ans[i] + " ");
        }

    }
}