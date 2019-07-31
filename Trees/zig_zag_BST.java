import java.io.IOException;
import java.util.ArrayDeque;
import java.util.Scanner;
import java.util.Stack;


public class zig_zag_BST {

    private static TreeNode construct(Integer[] arr) {
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

    public static void main(String[] args) throws IOException {

        Scanner scn = new Scanner(System.in);
        String str = scn.nextLine();
        Integer[] ar = inputSplitSpace(str);
        TreeNode root = construct(ar);

        BinaryTree bt = new BinaryTree();
        bt.zigzagLevelOrder(root);
    }

    static class TreeNode {
        TreeNode left, right;
        int data;

        TreeNode(int d) {
            data = d;
            left = right = null;
        }

    }

    static class BinaryTree {

        void zigzagLevelOrder(TreeNode node) {
            boolean left2right = true;
            Stack<TreeNode> stack1 = new Stack<>();
            Stack<TreeNode> stack2 = new Stack<>();
            stack1.add(node);
            while (!stack1.empty()) {
                TreeNode pop = stack1.pop();
                System.out.print(pop.data + " ");
                if (left2right) {
                    if (pop.left != null)
                        stack2.add(pop.left);
                    if (pop.right != null)
                        stack2.add(pop.right);
                } else {
                    if (pop.right != null)
                        stack2.add(pop.right);
                    if (pop.left != null)
                        stack2.add(pop.left);
                }
                if (stack1.empty()) {
                    stack1 = stack2;
                    stack2 = new Stack<>();
                    System.out.println();
                    left2right = !left2right;
                }
            }

        }

        void inorder(TreeNode node) {
            if (node == null)
                return;
            else
                inorder(node.left);
            System.out.print(node.data + " ");
            inorder(node.right);
        }

    }

}