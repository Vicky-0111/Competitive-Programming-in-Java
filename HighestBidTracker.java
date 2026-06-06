import java.util.*;

public class HighestBidTracker {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Read number of bids
        int N = sc.nextInt();
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());

        // Insert bids into priority queue
        for (int i = 0; i < N; i++) {
            pq.add(sc.nextInt());
        }

        // Retrieve highest bid
        if (!pq.isEmpty()) {
            System.out.println(pq.peek()); // peek() gives highest without removing
        }

        sc.close();
    }
}
