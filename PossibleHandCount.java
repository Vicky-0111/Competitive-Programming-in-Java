import java.util.*;

public class PossibleHandCount {
	public static long handCount(int n) {
		
		long fact = 1;
		for(int i = 1; i <= n; i++) 
		{
			fact = fact * i;
		}
		
		return fact;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter total no. of cards : ");
		int n = sc.nextInt();
		
		System.out.print("Enter no. of distinct cards : ");
		int k = sc.nextInt();
		
		long result = handCount(n) / (handCount(k) * handCount(n-k));
		
		System.out.print("Total no. of Possible hands : " + result);
		
	}

}