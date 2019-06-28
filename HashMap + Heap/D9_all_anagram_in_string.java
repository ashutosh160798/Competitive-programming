import java.util.*;

public class D9_all_anagram_in_string {
    // -----------------------------------------------------
    // This is a functional problem. Only this function has to be written.
    // This function takes as input the head of the linked list.
    // It should return the head of the modified list.

    public static ArrayList<Integer> findAnagrams(String s, String p) {

        HashMap<Character, Integer> pMap = new HashMap<>();
        for (char c : p.toCharArray()) {
            pMap.put(c, pMap.getOrDefault(c, 0) + 1);
        }
        int matchCount = 0;
        HashMap<Character, Integer> sMap = new HashMap<>();
        int i = 0;
        int j = 0;
        ArrayList<Integer> ans = new ArrayList<>();
        while (j < s.length()) {
            if(matchCount == p.length()){
                ans.add(i);
            }
            sMap.put(s.charAt(j),sMap.getOrDefault(s.charAt(j),0)+1);
            if(pMap.containsKey(s.charAt(j))&&sMap.get(s.charAt(j))<=pMap.get(s.charAt(j))){
                matchCount++;
            }


            if (j >= p.length()) {

                sMap.put(s.charAt(i), sMap.get(s.charAt(i)) - 1);
                if (pMap.containsKey(s.charAt(i)) && sMap.get(s.charAt(i))<pMap.get(s.charAt(i))){
                    matchCount--;
                }

                if (sMap.get(s.charAt(i)) == 0) {
                    sMap.remove(s.charAt(i));
                }

                i++;
            }
            j++;

        }
        if(matchCount == p.length()){
            ans.add(i);
        }

        return ans;
    }

    // -----------------------------------------------------

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String s = scn.next();
        String p = scn.next();
        System.out.println(findAnagrams(s, p));
    }
}