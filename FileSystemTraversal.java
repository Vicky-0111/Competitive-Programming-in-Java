import java.util.*;

class Node {
    int val;
    Node left, right;
    Node(int v) { val = v; }
}

public class FileSystemTraversal {
    static void preorder(Node root) {
        if (root == null) return;
        System.out.print(root.val + " ");
        preorder(root.left);
        preorder(root.right);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        Map<Integer, Node> nodes = new HashMap<>();
        for (int i = 0; i < N; i++) {
            int node = sc.nextInt(), l = sc.nextInt(), r = sc.nextInt();
            nodes.putIfAbsent(node, new Node(node));
            if (l != -1) {
                nodes.putIfAbsent(l, new Node(l));
                nodes.get(node).left = nodes.get(l);
            }
            if (r != -1) {
                nodes.putIfAbsent(r, new Node(r));
                nodes.get(node).right = nodes.get(r);
            }
        }

        System.out.println("File System Traversal (Preorder)");
        preorder(nodes.get(1)); // assuming root is 1
    }
}
