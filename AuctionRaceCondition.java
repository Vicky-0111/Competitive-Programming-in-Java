import java.util.Scanner;

class AuctionRaceCondition {
    static int highestBid = 0; // shared variable

    static class BidThread extends Thread {
        int bid;
        BidThread(int bid) {
            this.bid = bid;
        }
        public void run() {
            // Race condition: multiple threads may update simultaneously
            if (bid > highestBid) {
                highestBid = bid;
            }
        }
    }

    public static void main(String[] args) throws InterruptedException {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        Thread[] threads = new Thread[N];

        for (int i = 0; i < N; i++) {
            int bid = sc.nextInt();
            threads[i] = new BidThread(bid);
            threads[i].start();
        }

        // Wait for all threads to finish
        for (int i = 0; i < N; i++) {
            threads[i].join();
        }

        System.out.println("Highest Bid = " + highestBid);
        sc.close();
    }
}

