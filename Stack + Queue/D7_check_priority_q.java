import java.util.*;

class D7_check_priority_q {

    // Function to insert element into the queue
    static void insert(PriorityQueue<Integer> q, int k) {
        q.add(k);
    }

    // Function to find an element k
    static boolean find(PriorityQueue<Integer> q, int k) {
        // Your code here
        // If k is in q return true else return false
        return q.contains(k);

    }

    // Function to delete the element from queue
    static int delete(PriorityQueue<Integer> q) {
        // Your code here
        // Delete the max element from q. The priority queue property might be
        // useful here
        return q.remove();
    }









    //Dont make chaanges here
    public static void main(String[] args) {
        PriorityQueue pq=new PriorityQueue(Comparator.reverseOrder());
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt(), m=sc.nextInt();
        for(int i=0;i<n;i++){insert(pq, sc.nextInt());}
        for(int i=0;i<m;i++){
            if(find(pq, sc.nextInt())){
                System.out.println(1);
                System.out.println(delete(pq));
            }
            else System.out.println(-1);
        }
    }

}