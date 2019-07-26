import java.util.Scanner;

class Node {
    int data;
    Node left, right;

    Node(int item) {
        data = item;
        left = right = null;
    }
}

class BinaryTree {

    private static int max = Integer.MIN_VALUE;

    int maxPathSum(Node root) {

        l2lsum(root);
        return max;
    }

    private int l2lsum(Node root) {
        if (root == null)
            return 0;

        int ll = l2lsum(root.left);
        int rl = l2lsum(root.right);
        int rv = Math.max(ll, rl) + root.data;

        max = Math.max(max, ll + rl + root.data);

        return rv;

    }

}

public class max_path_sum_l2l {
    public static void insert(Node root, int a, int a1, char lr) {
        if (root == null) {
            return;
        }
        if (root.data == a) {
            switch (lr) {
                case 'L':
                    root.left = new Node(a1);
                    break;
                case 'R':
                    root.right = new Node(a1);
                    break;
            }
            return;
        }
        insert(root.left, a, a1, lr);
        insert(root.right, a, a1, lr);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if (n == 0) {
            System.out.println(0);

        }
        Node root = null;
        for (int i = 0; i < n; i++) {

            int a = sc.nextInt();
            int a1 = sc.nextInt();

            char lr = sc.next().charAt(0);

            if (i == 0) {

                root = new Node(a);

                switch (lr) {

                    case 'L':
                        root.left = new Node(a1);
                        break;
                    case 'R':
                        root.right = new Node(a1);
                        break;
                }
            } else {
                insert(root, a, a1, lr);
            }
        }

        BinaryTree g = new BinaryTree();
        System.out.println(g.maxPathSum(root));

    }
}