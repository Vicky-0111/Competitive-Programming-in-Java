import java.util.*;
import java.io.*;

public class ShoppingCartDiscount {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine().trim());
        Map<String, Integer> cart = new LinkedHashMap<>(); // item → price

        // Read items
        for (int i = 0; i < n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            String item = st.nextToken();
            int price = Integer.parseInt(st.nextToken());
            cart.put(item, price);
        }

        int d = Integer.parseInt(br.readLine().trim());
        Map<String, Integer> discount = new HashMap<>(); // item → discount %

        // Read discount rules
        for (int i = 0; i < d; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            discount.put(st.nextToken(), Integer.parseInt(st.nextToken()));
        }

        int total = 0;
        // Apply discounts
        for (var entry : cart.entrySet()) {
            String item = entry.getKey();
            int price = entry.getValue();
            if (discount.containsKey(item)) {
                price -= price * discount.get(item) / 100;
            }
            System.out.println(item + " " + price);
            total += price;
        }

        System.out.println("Total Price = " + total);
    }
}
