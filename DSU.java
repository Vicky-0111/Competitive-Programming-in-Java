import java.util.*;

public class DSU {
    static int[] parent;

    static int find(int x) {
        while (parent[x] != x) x = parent[x];
        return x;
    }

    static void union(int a, int b) {
        int rootA = find(a), rootB = find(b);
        if (rootA != rootB) parent[rootB] = rootA;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), m = sc.nextInt();
        parent = new int[n + 1];
        for (int i = 1; i <= n; i++) parent[i] = i;

        for (int i = 0; i < m; i++) {
            String op = sc.next();
            if (op.equals("union")) {
                int a = sc.nextInt(), b = sc.nextInt();
                union(a, b);
            } else if (op.equals("find")) {
                int x = sc.nextInt();
                System.out.println(find(x));
            }
        }
    }
}
