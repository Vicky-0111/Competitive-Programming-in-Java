import java.util.*;

public class HighestBid {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Read number of bids
        int N = sc.nextInt();
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());

        // Insert bids into priority queue
        for (int i = 0; i < N; i++) {
            pq.add(sc.nextInt());
        }

        // Extract highest bid
        if (!pq.isEmpty()) {
            int highest = pq.poll();
            System.out.println("Highest Bid: " + highest);

            // Extract next highest bid
            if (!pq.isEmpty()) {
                int nextHighest = pq.poll();
                System.out.println("Next Highest Bid: " + nextHighest);
            }
        }

        sc.close();
    }
}