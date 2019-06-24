import java.util.*;

public class D9_equal_0_1_2 {

    public static void equal_012(String line) {

        HashMap<Character,Integer> map = new HashMap<>();
        HashMap<String,Integer> map1 = new HashMap<>();
        map.put('0',0);
        map.put('1',0);
        map.put('2',0);
        map1.put("0*0",1);
        int count = 0;
        for(int i=0;i<line.length();i++){
            map.put(line.charAt(i),map.get(line.charAt(i))+1);
            String s =(map.get('1')-map.get('0'))+"*"+(map.get('2')-map.get('1'));
            if(map1.containsKey(s)){
                count+=map1.get(s);
            }
            map1.put(s,map1.getOrDefault(s,0)+1);
        }
        System.out.print(count);

    }

    // Dont make changes here
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        equal_012(sc.next());

    }

}