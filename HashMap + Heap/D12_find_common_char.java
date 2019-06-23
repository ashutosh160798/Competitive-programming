import java.util.*;

public class D12_find_common_char {

    public static ArrayList<String> commonChars(String[] A) {

        ArrayList<String> ans = new ArrayList<>();
        HashMap<Character, Integer> map = new HashMap<>();
        for (char c : A[0].toCharArray()) {
            map.put(c, map.getOrDefault(c, 0) + 1);
        }
        for (int i = 1; i < A.length; i++) {
            HashMap<Character, Integer> map1 = new HashMap<>();
            for (char c : A[i].toCharArray()) {
                if (map.containsKey(c)) {
                    if(map1.containsKey(c) && map1.get(c)<map.get(c)){
                        map1.put(c,map1.get(c)+1);
                    }else if(!map1.containsKey(c)){
                        map1.put(c,1);
                    }
                }
            }
            map = map1;

        }
        for (char c :  map.keySet()){
            for(int i=0;i<map.get(c);i++){
                ans.add(c+"");
            }
        }
        return ans;

    }

    //Don't make any changes here.
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        int n = Integer.parseInt(s.nextLine());
        String[] A = new String[n];
        for (int i = 0; i < A.length; i++) {
            A[i] = s.nextLine();
        }

        ArrayList<String> res = commonChars(A);
        Collections.sort(res);
        System.out.println(res);

    }

}