import java.util.Scanner;

public class TotalCost {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Step 1: Read number of products
        int n = sc.nextInt();

        // Step 2: Store product prices
        int[] prices = new int[n];
        for (int i = 0; i < n; i++) {
            prices[i] = sc.nextInt();
        }

        // Step 3: Store product quantities
        int[] quantities = new int[n];
        for (int i = 0; i < n; i++) {
            quantities[i] = sc.nextInt();
        }

        // Step 4: Initialize total cost
        int total = 0;

        // Step 5: Traverse arrays and calculate cost
        for (int i = 0; i < n; i++) {
            // Multiply price × quantity for each product
            int cost = prices[i] * quantities[i];
            total += cost;
        }

        // Step 6: Print final total
        System.out.println(total);

        sc.close();
    }
}
