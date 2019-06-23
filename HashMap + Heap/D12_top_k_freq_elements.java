import java.util.*;

public class D12_top_k_freq_elements {


    public static ArrayList<Integer> topKFrequent(int n, int[] nums, int k) {
        ArrayList<Integer> ans = new ArrayList<>();
        HashMap<Integer,Integer> map = new HashMap();
        for (int i = 0; i < n; i++) {
            map.put(nums[i], map.getOrDefault(nums[i], 0) + 1);
        }
        PriorityQueue<Pair>pq = new PriorityQueue<>(new compareFreq());
        for(int i : map.keySet()){
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
        int data,freq;

        public Pair(int data, int freq) {
            this.data = data;
            this.freq = freq;
        }
    }

    //Don't make any changes here.
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int[] ar = new int[n];
        for (int i = 0; i < ar.length; i++) {
            ar[i] = s.nextInt();
        }
        int k = s.nextInt();
        ArrayList<Integer> res = topKFrequent(n, ar, k);
        Collections.sort(res);
        System.out.println(res);
    }

}