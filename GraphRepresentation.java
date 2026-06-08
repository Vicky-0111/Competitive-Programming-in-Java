
import java.util.*;

public class GraphRepresentation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Read number of nodes and edges
        int N = sc.nextInt();
        int E = sc.nextInt();

        // Adjacency Matrix
        int[][] matrix = new int[N][N];

        // Adjacency List
        List<List<Integer>> adjList = new ArrayList<>();
        for (int i = 0; i < N; i++) adjList.add(new ArrayList<>());

        // Read edges
        for (int i = 0; i < E; i++) {
            int u = sc.nextInt();
            int v = sc.nextInt();
            matrix[u][v] = matrix[v][u] = 1; // undirected
            adjList.get(u).add(v);
            adjList.get(v).add(u);
        }

        // Print Adjacency Matrix
        System.out.println("Adjacency Matrix");
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }

        // Print Adjacency List
        System.out.println("Adjacency List");
        for (int i = 0; i < N; i++) {
            System.out.print(i + " → ");
            for (int v : adjList.get(i)) System.out.print(v + " ");
            System.out.println();
        }
    }
}
