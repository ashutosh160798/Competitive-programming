import java.util.Scanner;

public class array_to_bst {

    public static void BSTFormation(int[] arr, int i, int j) {
        int mid = (j+i)/2;
        Node root = new Node(arr[mid]);
        if(j<i){
            return;
        }
        System.out.print(root.val+" ");
        BSTFormation(arr,i,mid-1);
        BSTFormation(arr,mid+1,j);
    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int[] arr = new int[scn.nextInt()];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = scn.nextInt();
        }
        BSTFormation(arr, 0, arr.length - 1);
    }

    static class Node {
         int val;
         Node left;
         Node right;

        public Node(int val) {
            this.val = val;
        }
    }

}