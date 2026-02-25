import java.util.*;
public class DiscountCalculator {
	public static double Calculator(double amount) {
		
		double finalAmount;
		
		if(amount < 1000)
		{
			finalAmount = amount;
		}
		else if(amount >= 1000 && amount < 5000) 
		{
			finalAmount = amount - (amount * 0.1);
		}
		else if(amount >= 5000 && amount < 10000) 
		{
			finalAmount = amount - (amount * 0.2);
		}
		else 
		{
			finalAmount = amount - (amount * 0.25) - 500;
		}
		
		return finalAmount;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter the Amount : ");
		double amount = sc.nextDouble();
		
		double discountAmount = Calculator(amount);
		System.out.print("Final Amount to be paid : " + discountAmount);
	}

}
