import java.util.*;

public class FinalCost {

    // Method to performs calculation
    public static double calculateCost(int[] price, int[] discountPercent) {

        double subTotal = 0;

        // Calculate subtotal after item discounts
        for (int i = 0; i < price.length; i++) {
            subTotal += price[i] - (price[i] * discountPercent[i] / 100.0);
        }

        double percentageDiscount = 0;
        int fixedDiscount = 0;

        if (subTotal > 500) {
            percentageDiscount = subTotal * 0.10;
        }

        if (subTotal > 1000) {
            fixedDiscount = 150;
        }

        double discount = Math.max(percentageDiscount, fixedDiscount);

        return subTotal - discount;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter no. of items : ");
        int n = sc.nextInt();

        System.out.print("Enter price & discount percent : ");
        int[] price = new int[n];
        
        
        int[] discountPercent = new int[n];

        
        for (int i = 0; i < n; i++) {
            price[i] = sc.nextInt();
            discountPercent[i] = sc.nextInt();
        }

        double finalCost = calculateCost(price, discountPercent);

        System.out.println("Final cost: " + finalCost);


    }
}