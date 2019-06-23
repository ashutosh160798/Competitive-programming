import java.util.*;

public class D12_identify_string {

    // -----------------------------------------------------
    // This is a functional problem. Only this function has to be written.
    // This function takes as input the head of the linked list.
    // It should return the head of the modified list.
    public static String reorganizeString(String str) {
        HashMap<Character,Integer> map = new HashMap<>();
        for (int i=0;i<str.length();i++){
            map.put(str.charAt(i),map.getOrDefault(str.charAt(i),0)+1);
        }
        String ans = "";
        ArrayList<Pair> keys = new ArrayList<>(map.size());
        for (char c: map.keySet()){
            if(map.get(c)>str.length()/2)
                return "";
            keys.add(new Pair(c,map.get(c)));
        }

        PriorityQueue<Pair>pq = new PriorityQueue<>(new FreqComparator());
        pq.addAll(keys);
        while(pq.size()>=2){
            Pair pop1 = pq.remove();
            Pair pop2 = pq.remove();
            ans+=pop1.key;
            ans+=pop2.key;
            pop1.freq--;
            pop2.freq--;
            if(pop1.freq!=0){
                pq.add(pop1);
            }
            if(pop2.freq!=0){
                pq.add(pop2);
            }
        }
        if(pq.size()==1)
            ans+=pq.remove().key;
        return ans;
    }

    public static class Pair{
        char key;
        int freq;
        Pair(char key, int freq){
            this.freq=freq;
            this.key=key;
        }
    }

    public static class FreqComparator implements Comparator<Pair>{

        @Override
        public int compare(Pair o1, Pair o2) {
            if(o1.freq==o2.freq){
                return o1.key-o2.key;
            }else{
                return o2.freq-o1.freq;
            }
        }
    }

    // -----------------------------------------------------

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String s = sc.next();

        System.out.println(reorganizeString(s));

    }

}