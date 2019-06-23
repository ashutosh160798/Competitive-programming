import java.util.*;

public class D12_top_k_freq_words {


    public static ArrayList<String> topKFrequent(String[] words, int k) {
        ArrayList<String> ans = new ArrayList<>();
        HashMap<String,Integer> map = new HashMap<>();
        for (int i = 0; i < words.length; i++) {
            map.put(words[i], map.getOrDefault(words[i], 0) + 1);
        }
        PriorityQueue<Pair>pq = new PriorityQueue<>(new compareFreq());
        for(String i : map.keySet()){
            pq.add(new Pair(i,map.get(i)));
        }
        while (k--!=0){
            Pair pop = pq.remove();
            ans.add(pop.data);
        }
        return ans;
    }

    public static class compareFreq implements Comparator<Pair> {

        @Override
        public int compare(Pair o1, Pair o2) {
            return o2.freq-o1.freq;
        }
    }

    static class Pair {
        String data;
        int freq;

        public Pair(String data, int freq) {
            this.data = data;
            this.freq = freq;
        }
    }

    //Don't make any changes here
    public static void main(String[] args) {
        // TODO Auto-generated method stub

        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        String[] array = new String[n];
        for (int i = 0; i < array.length; i++) {
            array[i] = s.next();
        }
        int k = s.nextInt();
        ArrayList<String> res = topKFrequent(array, k);
        Collections.sort(res);
        System.out.println(res);

    }






}