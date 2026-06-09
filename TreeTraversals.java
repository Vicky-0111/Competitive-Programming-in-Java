import java.util.*;

class TreeNode {   // ✅ renamed to avoid conflict
    int val;
    TreeNode left, right;
    TreeNode(int v) { val = v; }
}

public class TreeTraversals {
    static void preorder(TreeNode root) {
        if (root == null) return;
        System.out.print(root.val + " ");
        preorder(root.left);
        preorder(root.right);
    }

    static void inorder(TreeNode root) {
        if (root == null) return;
        inorder(root.left);
        System.out.print(root.val + " ");
        inorder(root.right);
    }

    static void postorder(TreeNode root) {
        if (root == null) return;
        postorder(root.left);
        postorder(root.right);
        System.out.print(root.val + " ");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        Map<Integer, TreeNode> nodes = new HashMap<>();
        for (int i = 0; i < N; i++) {
            int node = sc.nextInt(), l = sc.nextInt(), r = sc.nextInt();
            nodes.putIfAbsent(node, new TreeNode(node));
            if (l != -1) {
                nodes.putIfAbsent(l, new TreeNode(l));
                nodes.get(node).left = nodes.get(l);
            }
            if (r != -1) {
                nodes.putIfAbsent(r, new TreeNode(r));
                nodes.get(node).right = nodes.get(r);
            }
        }

        TreeNode root = nodes.get(1); // assuming root is 1

        System.out.println("Preorder Traversal");
        preorder(root);
        System.out.println("\nInorder Traversal");
        inorder(root);
        System.out.println("\nPostorder Traversal");
        postorder(root);
    }
}
