import java.util.*;

public class D12_k_smallest_in_order {

    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);

        int n = scn.nextInt();
        int k = scn.nextInt();

        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = scn.nextInt();
        }
        print_k_smallest_elements_in_their_original_order(n,k,arr);
    }

    // -----------------------------------------------------
    // This is a functional problem. Only this function has to be written.
    // This function takes as input length of array, value of k and array of length n
    // It should print k smallest elements in their original order
    public static void print_k_smallest_elements_in_their_original_order(int n,int k, int[] arr){

        int[] temp = new int[arr.length];
        for(int i=0;i<arr.length;i++){
            temp[i]=arr[i];
        }
        Arrays.sort(temp);
        PriorityQueue<Integer> q = new PriorityQueue<>(Collections.reverseOrder());
        k--;
        while(k>=0){
            q.add(temp[k--]);
        }
        for(int i=0;i<n;i++){
            if(q.size()!=0) {
                if (arr[i] < q.peek()) {
                    System.out.print(arr[i] + " ");
                } else if (arr[i] == q.peek()) {
                    System.out.print(q.remove() + " ");
                }
            }
        }

    }

}