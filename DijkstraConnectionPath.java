import java.util.*;

public class DijkstraConnectionPath {
    static int dijkstra(List<List<int[]>> graph, int s, int d, int n) {
        int[] dist = new int[n];
        Arrays.fill(dist, Integer.MAX_VALUE);
        dist[s] = 0;
        PriorityQueue<int[]> pq = new PriorityQueue<>(Comparator.comparingInt(a -> a[0]));
        pq.add(new int[]{0, s});
        while (!pq.isEmpty()) {
            int[] cur = pq.poll();
            int cost = cur[0], u = cur[1];
            if (u == d) return cost;
            if (cost > dist[u]) continue;
            for (int[] nei : graph.get(u)) {
                int v = nei[0], w = nei[1];
                if (dist[u] + w < dist[v]) {
                    dist[v] = dist[u] + w;
                    pq.add(new int[]{dist[v], v});
                }
            }
        }
        return -1; // no path
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), e = sc.nextInt();
        List<List<int[]>> graph = new ArrayList<>();
        for (int i = 0; i < n; i++) graph.add(new ArrayList<>());
        for (int i = 0; i < e; i++) {
            int u = sc.nextInt(), v = sc.nextInt(), w = sc.nextInt();
            graph.get(u).add(new int[]{v, w});
            graph.get(v).add(new int[]{u, w}); // undirected
        }
        int s = sc.nextInt(), d = sc.nextInt();
        int ans = dijkstra(graph, s, d, n);
        System.out.println(ans == -1 ? "No Connection Found" : "Shortest connection cost: " + ans);
    }
}
