import java.util.*;

public class D14_kth_largest_element_in_stream {

    // This is a functional problem. You have to complete this class.
    static class KthLargest {
        int k;
        PriorityQueue<Integer>priorityQueue;
        public KthLargest(int k, int[] nums) {
            this.k = k;
            priorityQueue = new PriorityQueue<>(Collections.reverseOrder());
            for(int i=0;i<nums.length;i++){
                priorityQueue.add(nums[i]);
            }
        }

        public int add(int val) {
            int x=k;
            int ans = 0;
            priorityQueue.add(val);
            ArrayList<Integer> al = new ArrayList<>();
            while (x-->1){
                al.add(priorityQueue.remove());
            }
            ans = priorityQueue.peek();
            for(int i=0;i<al.size();i++){
                priorityQueue.add(al.get(i));
            }
            return ans;

        }

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input for length of first array.
        int N = sc.nextInt();

        int[] intialStream = new int[N];

        // Input for initial stream elements.
        for (int i = 0; i < intialStream.length; i++) {
            intialStream[i] = sc.nextInt();
        }

        int K = sc.nextInt();

        int M = sc.nextInt();
        int[] remainingStream = new int[M];

        // Input for remaining stream elements.
        for (int i = 0; i < remainingStream.length; i++) {
            remainingStream[i] = sc.nextInt();
        }

        KthLargest obj = new KthLargest(K, intialStream);

        for (int i = 0; i < remainingStream.length; i++) {
            int kthLargest = obj.add(remainingStream[i]);
            System.out.println(kthLargest);
        }

    }

    // Function to display an array.
    public static void display(int[] arr) {

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }

        System.out.println();
    }

}