import java.util.*;

public class DijkstraShortestPath {
    static void dijkstra(List<List<int[]>> graph, int src, int n) {
        int[] dist = new int[n];
        Arrays.fill(dist, Integer.MAX_VALUE);
        dist[src] = 0;
        PriorityQueue<int[]> pq = new PriorityQueue<>(Comparator.comparingInt(a -> a[0]));
        pq.add(new int[]{0, src});
        while (!pq.isEmpty()) {
            int[] cur = pq.poll();
            int d = cur[0], u = cur[1];
            if (d > dist[u]) continue;
            for (int[] nei : graph.get(u)) {
                int v = nei[0], w = nei[1];
                if (dist[u] + w < dist[v]) {
                    dist[v] = dist[u] + w;
                    pq.add(new int[]{dist[v], v});
                }
            }
        }
        System.out.println("Shortest distances from source node " + src);
        for (int i = 0; i < n; i++) System.out.println(i + " → " + dist[i]);
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
        int src = sc.nextInt();
        dijkstra(graph, src, n);
    }
}

