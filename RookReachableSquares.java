import java.util.*;

public class RookReachableSquares {
    static class Cell {
        int r, c;
        Cell(int r, int c) {
            this.r = r; this.c = c;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();             // Chessboard size
        int sr = sc.nextInt(), scCol = sc.nextInt(); // Start position

        boolean[][] visited = new boolean[n][n];
        Queue<Cell> queue = new LinkedList<>();
        queue.add(new Cell(sr, scCol));
        visited[sr][scCol] = true;

        System.out.println("Reachable Squares");

        while (!queue.isEmpty()) {
            Cell cur = queue.poll();

            // Horizontal moves
            for (int i = 0; i < n; i++) {
                if (!visited[cur.r][i]) {
                    visited[cur.r][i] = true;
                    queue.add(new Cell(cur.r, i));
                    System.out.println(cur.r + " " + i);
                }
            }

            // Vertical moves
            for (int i = 0; i < n; i++) {
                if (!visited[i][cur.c]) {
                    visited[i][cur.c] = true;
                    queue.add(new Cell(i, cur.c));
                    System.out.println(i + " " + cur.c);
                }
            }
        }
    }
}
