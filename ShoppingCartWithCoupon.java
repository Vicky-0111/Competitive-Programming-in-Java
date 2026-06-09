import java.util.*;
import java.io.*;

public class ShoppingCartWithCoupon {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine().trim());
        Map<String, Integer> cart = new LinkedHashMap<>();

        // Read items
        for (int i = 0; i < n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            cart.put(st.nextToken(), Integer.parseInt(st.nextToken()));
        }

        int d = Integer.parseInt(br.readLine().trim());
        Map<String, Integer> discount = new HashMap<>();

        // Read discount rules
        for (int i = 0; i < d; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            discount.put(st.nextToken(), Integer.parseInt(st.nextToken()));
        }

        // Read coupon info
        StringTokenizer st = new StringTokenizer(br.readLine());
        int couponValue = Integer.parseInt(st.nextToken());
        int threshold = Integer.parseInt(st.nextToken());

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

        System.out.println("Price After Discount = " + total);

        // Apply coupon if eligible
        if (total >= threshold) {
            total -= couponValue;
        }

        System.out.println("Final Cart Price = " + total);
    }
}
