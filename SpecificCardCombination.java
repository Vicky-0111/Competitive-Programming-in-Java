import java.util.*;

public class SpecificCardCombination {
	public static long combination(int n, int k) {
		
		if(k > n)
		{
			return 0;
		}
		
		k = Math.min(n, n-k);
		
		long result = 1;
		
		for(int i = 1; i <= k; i++) 
		{
			result = result * (n - i + 1) / i;
		}
		
		return result;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter no. of cards drawn from deck : ");
		int k = sc.nextInt();
		
		System.out.print("Enter no. of cards drawn from specific suit : ");
		int r = sc.nextInt();
		
		double Favourable = (double)combination(13,r) * combination(39, k-r);
		
		double total = combination(52,k);
		
		double probability = Favourable / total;
		
		System.out.printf("%.6f\n", probability);
	}

}
