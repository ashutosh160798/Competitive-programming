import java.util.Scanner;
import java.util.Stack;

public class binary_tree_k_level_sum {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String str = s.next();
        System.out.println(getSumAtk(str, s.nextInt()));
    }

    private static int getSumAtk(String str, int k) {

        int ans = 0;
        Stack<Pair> stack = new Stack<>();

        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == '(') {
                if (str.charAt(i + 1) == ')') {
                    stack.peek().state++;
                    i++;
                    continue;
                }
                String num = "";
                while (str.charAt(++i) != '(') {
                    num += str.charAt(i);
                }
                Pair pair = new Pair(
                        new Node(Integer.parseInt(num), null, null),
                        stack.empty() ? 0 : stack.peek().level + 1,
                        0);
                if (!stack.empty()) {
                    if (stack.peek().state == 0) {
                        stack.peek().node.left = pair.node;
                    } else if (stack.peek().state == 1) {
                        stack.peek().node.right = pair.node;
                    }
                    stack.peek().state++;
                }
                stack.push(pair);
                i--;
            } else {
                if (stack.peek().level == k) {
                    ans += stack.peek().node.data;
                }
                stack.pop();
            }
        }
        return ans;

    }

    static class Pair {
        Node node;
        int level;
        int state;

        public Pair(Node node, int level, int state) {
            this.node = node;
            this.level = level;
            this.state = state;
        }
    }

    static class Node {
        int data;
        Node right;
        Node left;

        public Node(int data, Node right, Node left) {
            this.data = data;
            this.right = right;
            this.left = left;
        }
    }
}
