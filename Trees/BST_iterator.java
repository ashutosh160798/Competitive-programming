import java.util.*;

class BST_iterator {

    static class TreeNode {

        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) {
            val = x;
        }
    }

    static class BST_Iterator {
        ArrayList<Integer> nodesSorted;
        int index;

        public BST_Iterator(TreeNode root) {

            this.nodesSorted = new ArrayList<Integer>();
            this.index = -1;
            this.inorder(root);
        }

        private void inorder(TreeNode root) {

            if (root == null) {
                return;
            }

            this.inorder(root.left);
            this.nodesSorted.add(root.val);
            this.inorder(root.right);
        }

        /**
         * @return the next smallest number
         */
        public int next() {
            return this.nodesSorted.get(++this.index);
        }

        /**
         * @return whether we have a next smallest number
         */
        public boolean hasNext() {
            return this.index + 1 < this.nodesSorted.size();
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine().trim());
        Integer[] Q = inputSplitSpace(sc.nextLine().trim());

        String input = sc.nextLine().trim();
        Integer[] treeArr = inputSplitSpace(input);
        TreeNode root = createTree(treeArr);

        BST_Iterator itr = new BST_Iterator(root);

        for (int i = 0; i < n; i++) {
            int q = Q[i];
            if (q == 1) {
                System.out.print(itr.hasNext() + " ");
            } else if (q == 2) {
                System.out.print(itr.next() + " ");
            }
        }

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