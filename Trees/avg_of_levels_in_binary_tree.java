import java.util.*;

public class avg_of_levels_in_binary_tree {

    public static class TreeNode {

        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) {
            val = x;
        }
    }

    public static List<Double> averageOfLevels(TreeNode root) {

        List<Double> ans = new ArrayList<>();
        Queue<TreeNode> q = new LinkedList<>();
        q.add(root);
        q.add(null);
        int sum = 0;
        int ele = 0;
        while (!q.isEmpty()) {
            TreeNode pop = q.remove();
            if (q.isEmpty())
                break;
            if (pop == null) {
                ans.add((double) sum / ele);
                q.add(null);
                ele = 0;
                sum = 0;
                continue;
            }
            ele++;
            sum += pop.val;
            if (pop.left != null)
                q.add(pop.left);
            if (pop.right != null)
                q.add(pop.right);
        }
        ans.add((double)sum/ele);
        return ans;

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine().trim();

        Integer[] treeArr = inputSplitSpace(input);
        TreeNode root = createTree(treeArr);
        List<Double> res = averageOfLevels(root);
        for (Double v : res) {
            System.out.print(v + " ");
        }
        System.out.println();

    }

    // utility function, don't change its code
    private static Integer[] inputSplitSpace(String str) {
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