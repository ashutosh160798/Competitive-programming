import java.util.HashMap;
import java.util.Scanner;


public class tree_path_sum {

    static class TreeNode {
        int data;
        TreeNode left, right;

        TreeNode(int item) {
            data = item;
            left = right = null;
        }
    }

    static class BinaryTrees {

        int treePathsSum(TreeNode node) {


            return ps(node, 0);

        }

        private int ps(TreeNode node, int val) {

            if (node == null)
                return 0;

            val = val * 10 + node.data;
            if (node.left == null && node.right == null)
                return val;

            return ps(node.left, val) + ps(node.right, val);

        }

        void printInorder(TreeNode node) {
            if (node == null) {
                return;
            }
            printInorder(node.left);
            System.out.print(node.data + " ");
            printInorder(node.right);
        }
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        HashMap<Integer, TreeNode> m = new HashMap<Integer, TreeNode>();
        int n = sc.nextInt();
        TreeNode root = null;
        while (n > 0) {

            int n1 = sc.nextInt();
            int n2 = sc.nextInt();
            char lr = sc.next().charAt(0);

            TreeNode parent = m.get(n1);
            if (parent == null) {
                parent = new TreeNode(n1);
                m.put(n1, parent);
                if (root == null)
                    root = parent;
            }
            TreeNode child = new TreeNode(n2);
            if (lr == 'L')
                parent.left = child;
            else
                parent.right = child;
            m.put(n2, child);
            n--;
        }

        BinaryTrees bt = new BinaryTrees();
        System.out.println(bt.treePathsSum(root));

    }

    int height(TreeNode node) {
        if (node == null)
            return 0;
        int l = 1 + height(node.left);
        int r = 1 + height(node.right);
        if (l > r)
            return l;
        else
            return r;
    }
}