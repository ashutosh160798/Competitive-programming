import java.io.IOException;
import java.util.ArrayDeque;
import java.util.Scanner;


public class binary_tree_tilt {

    public static TreeNode construct(Integer[] arr) {
        ArrayDeque<TreeNode> que = new ArrayDeque<>();
        TreeNode root = new TreeNode(arr[0]);
        que.addLast(root);
        int i = 1;
        while (!que.isEmpty() && i < arr.length) {
            TreeNode nn = que.removeFirst();

            if (i < arr.length && arr[i] != null) {
                TreeNode n = new TreeNode(arr[i]);
                nn.left = n;
                que.addLast(n);
            }
            i++;

            if (i < arr.length && arr[i] != null) {
                TreeNode n = new TreeNode(arr[i]);
                nn.right = n;
                que.addLast(n);
            }
            i++;
        }

        return root;
    }

    public static Integer[] inputSplitSpace(String str) {
        String[] sArr = str.split(" ");
        Integer[] arr = new Integer[sArr.length];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sArr[i].equals("null") ? null : Integer.parseInt(sArr[i]);
        }
        return arr;
    }

    //Don't make any changes here.
    public static void main(String[] args) throws IOException {

        Scanner scn = new Scanner(System.in);
        String str = scn.nextLine();
        Integer[] ar = inputSplitSpace(str);
        TreeNode root = construct(ar);

        int ret = new BinaryTree().findTilt(root);
        String out = String.valueOf(BinaryTree.tilt);

        System.out.print(out);
    }

    static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) {
            val = x;
        }
    }

    static class BinaryTree {

        static int tilt = 0;

        public int findTilt(TreeNode node) {
            if (node == null)
                return 0;

            int ls = findTilt(node.left);
            int rs = findTilt(node.right);

            int rv = ls + rs + node.val;
            tilt += Math.abs(rs - ls);
            return rv;
        }


    }
}