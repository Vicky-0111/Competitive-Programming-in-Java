import java.util.*;

public class DSUOptimized {
    static int[] parent, rank;

    static int find(int x) {
        if (parent[x] != x) parent[x] = find(parent[x]); // path compression
        return parent[x];
    }

    static void union(int a, int b) {
        int rootA = find(a), rootB = find(b);
        if (rootA != rootB) {
            if (rank[rootA] < rank[rootB]) parent[rootA] = rootB;
            else if (rank[rootA] > rank[rootB]) parent[rootB] = rootA;
            else {
                parent[rootB] = rootA;
                rank[rootA]++;
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), m = sc.nextInt();
        parent = new int[n + 1];
        rank = new int[n + 1];
        for (int i = 1; i <= n; i++) parent[i] = i;

        for (int i = 0; i < m; i++) {
            String op = sc.next();
            int a = sc.nextInt(), b = sc.nextInt();
            if (op.equals("union")) union(a, b);
            else if (op.equals("check"))
                System.out.println(find(a) == find(b) ? "Connected" : "Not Connected");
        }
    }
}