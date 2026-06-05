import java.util.Scanner;

public class ProductPrices {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Step 1: Read number of products
        int n = sc.nextInt();

        // Step 2: Store prices in an array
        int[] prices = new int[n];

        // Step 3: Read prices
        for (int i = 0; i < n; i++) {
            prices[i] = sc.nextInt();
        }

        // Step 4: Initialize total
        int total = 0;

        // Step 5: Iterate and print each price while summing
        for (int i = 0; i < n; i++) {
            System.out.print(prices[i] + " ");
            total += prices[i];
        }

        // Step 6: Print total
        System.out.println("\nTotal Price = " + total);

        sc.close();
    }
}