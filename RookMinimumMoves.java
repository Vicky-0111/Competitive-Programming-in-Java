import java.util.*;

public class RookMinimumMoves {
    static class Cell {
        int r, c, moves;
        Cell(int r, int c, int moves) {
            this.r = r; this.c = c; this.moves = moves;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();              // Chessboard size
        int sr = sc.nextInt(), scCol = sc.nextInt(); // Start position
        int tr = sc.nextInt(), tc = sc.nextInt();    // Target position

        boolean[][] visited = new boolean[n][n];
        Queue<Cell> queue = new LinkedList<>();
        queue.add(new Cell(sr, scCol, 0));
        visited[sr][scCol] = true;

        while (!queue.isEmpty()) {
            Cell cur = queue.poll();

            // If target reached, print moves and exit
            if (cur.r == tr && cur.c == tc) {
                System.out.println(cur.moves);
                return;
            }

            // Generate all horizontal moves
            for (int i = 0; i < n; i++) {
                if (!visited[cur.r][i]) {
                    visited[cur.r][i] = true;
                    queue.add(new Cell(cur.r, i, cur.moves + 1));
                }
            }

            // Generate all vertical moves
            for (int i = 0; i < n; i++) {
                if (!visited[i][cur.c]) {
                    visited[i][cur.c] = true;
                    queue.add(new Cell(i, cur.c, cur.moves + 1));
                }
            }
        }
    }
}

