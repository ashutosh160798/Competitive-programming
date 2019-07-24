import java.util.*;

public class add_one_row_to_tree {

    public static class TreeNode {

        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) {
            val = x;
        }
    }

    static TreeNode addOneRow(TreeNode root, int v, int d) {

        if(d==1){
            TreeNode node = new TreeNode(v);
            node.left = root;
            return node;
        }
        Queue<Pair> q = new LinkedList<>();
        q.add(new Pair(root,1));
        while(!q.isEmpty()){
            Pair pop = q.remove();
            if(pop.level==d)
                break;
            if(pop.level==d-1){
                TreeNode ltemp = pop.node.left;
                TreeNode rtemp = pop.node.right;
                TreeNode lnode = new TreeNode(v);
                TreeNode rnode = new TreeNode(v);
                pop.node.left = lnode;
                pop.node.right = rnode;
                lnode.left = ltemp;
                rnode.right = rtemp;
            }
            if(pop.node.left!=null){
                q.add(new Pair(pop.node.left,pop.level+1));
            }
            if(pop.node.right!=null){
                q.add(new Pair(pop.node.right,pop.level+1));
            }
        }
        return root;
    }

    static class Pair{
        TreeNode node;
        int level;

        Pair(TreeNode node, int level) {
            this.node = node;
            this.level = level;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int v, d;
        String line1 = sc.nextLine().trim();
        String line2 = sc.nextLine().trim();
        Integer[] vd = inputSplitSpace(line1);
        v = vd[0];
        d = vd[1];
        Integer[] treeArr = inputSplitSpace(line2);
        TreeNode root = createTree(treeArr);
        TreeNode res = addOneRow(root, v, d);
        display(res);

    }

    // utility function to display a binary tree.
    public static void display(TreeNode node) {
        if (node == null) {
            return;
        }

        String str = "";

        str += node.left == null ? "." : node.left.val;
        str += " <= " + node.val + " => ";
        str += node.right == null ? "." : node.right.val;

        System.out.println(str);

        display(node.left);
        display(node.right);
    }

    // utility function, don't change its code
    public static Integer[] inputSplitSpace(String str) {
        String[] sArr = str.split(" ");
        Integer[] arr = new Integer[sArr.length];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sArr[i].equals("null") ? null : Integer.parseInt(sArr[i]);
        }
        return arr;
    }

    // utility function to create a tree, don't change its code.
    public static TreeNode createTree(Integer[] arr) {
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
}