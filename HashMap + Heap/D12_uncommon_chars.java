import java.util.*;

public class D12_uncommon_chars {
    public static void uncommon(String str1, String str2) {

        HashSet<Character> set1 = new HashSet<>();
        HashSet<Character> set2 = new HashSet<>();
        String ans = "";
        for (char c : str1.toCharArray()) {
            set1.add(c);
        }
        for (char c : str2.toCharArray()) {
            set2.add(c);
        }
        Iterator<Character>iterator = set1.iterator();
        while (iterator.hasNext()){
            char c = iterator.next();
            if(set2.contains(c)){
                set2.remove(c);
            }else {
                ans+=c;
            }
        }
        iterator = set2.iterator();
        while(iterator.hasNext()){
            ans+=iterator.next();
        }
        char[] arr = ans.toCharArray();
        Arrays.sort(arr);
        System.out.print(arr);

    }

    //Don't make any changes here
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str1 = sc.next();

        String str2 = sc.next();

        uncommon(str1, str2);

    }
}