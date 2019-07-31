import java.util.*;


class top_view {

    /*

    class Node
        int data;
        Node left;
        Node right;
    */
    public static void topView(Node root) {
        HashMap<Integer, Integer> map = new HashMap<>();
        Queue<Pair> q = new LinkedList<>();
        q.add(new Pair(root, 0));
        map.put(0, root.data);
        while (!q.isEmpty()) {
            Pair pop = q.remove();
            if (!map.containsKey(pop.vlevel))
                map.put(pop.vlevel, pop.node.data);
            if (pop.node.left != null)
                q.add(new Pair(pop.node.left, pop.vlevel - 1));
            if (pop.node.right != null)
                q.add(new Pair(pop.node.right, pop.vlevel + 1));
        }

        Integer[] keys = map.keySet().toArray(new Integer[map.size()]);
        Arrays.sort(keys);
        for (int key : keys) {
            System.out.print(map.get(key) + " ");
        }
    }

    public static Node insert(Node root, int data) {
        if (root == null) {
            return new Node(data);
        } else {
            Node cur;
            if (data <= root.data) {
                cur = insert(root.left, data);
                root.left = cur;
            } else {
                cur = insert(root.right, data);
                root.right = cur;
            }
            return root;
        }
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int t = scan.nextInt();
        Node root = null;
        while (t-- > 0) {
            int data = scan.nextInt();
            root = insert(root, data);
        }
        scan.close();
        topView(root);
    }

    static class Pair {
        Node node;
        int vlevel;

        public Pair(Node node, int vlevel) {
            this.node = node;
            this.vlevel = vlevel;
        }
    }

    static class Node {
        Node left;
        Node right;
        int data;

        Node(int data) {
            this.data = data;
            left = null;
            right = null;
        }
    }
}