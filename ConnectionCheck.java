import java.util.*;

public class ConnectionCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Read number of users and connections
        int N = sc.nextInt();
        int E = sc.nextInt();

        // Adjacency List
        List<List<Integer>> graph = new ArrayList<>();
        for (int i = 0; i < N; i++) graph.add(new ArrayList<>());

        // Read edges
        for (int i = 0; i < E; i++) {
            int u = sc.nextInt();
            int v = sc.nextInt();
            graph.get(u).add(v);
            graph.get(v).add(u);
        }

        // Read source and destination
        int S = sc.nextInt();
        int D = sc.nextInt();

        // BFS to check connection
        boolean[] visited = new boolean[N];
        Queue<Integer> q = new LinkedList<>();
        q.add(S);
        visited[S] = true;

        boolean found = false;
        while (!q.isEmpty()) {
            int node = q.poll();
            if (node == D) {
                found = true;
                break;
            }
            for (int neighbor : graph.get(node)) {
                if (!visited[neighbor]) {
                    visited[neighbor] = true;
                    q.add(neighbor);
                }
            }
        }

        System.out.println(found ? "Connection Exists" : "No Connection");
    }
}
