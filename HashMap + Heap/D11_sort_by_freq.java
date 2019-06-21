import java.util.*;

class D11_sort_by_freq {

    static void sortByFreq(int arr[], int n) {

        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i=0;i<n;i++){
            map.put(arr[i],map.getOrDefault(arr[i],0)+1);
        }
        PriorityQueue<Pair> pq = new PriorityQueue<>(new FreqComparator());
        for(int key : map.keySet()){
            pq.add(new Pair(key,map.get(key)));
        }
        while(pq.size()!=0){
            Pair pop = pq.remove();
            for(int i=0;i<pop.freq;i++)
                System.out.println(pop.key);
        }

    }

    public static class Pair{
        int key,freq;
        Pair(int key, int freq){
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

    //Dont make changes here
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] arr = new int[N];
        for (int i = 0; i < N; i++) {
            arr[i] = sc.nextInt();
        }
        sortByFreq(arr, N);
    }
}