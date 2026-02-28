import java.util.*;

public class QualityInspectionProbability {
	public static double combination(int n, int k ) {
		
		if(k > n)
		{
			return 0;
		}
		
		k = Math.min(n, n-k);
		
		double result = 1.0;
		
		for(int i = 1; i <= k; i++)
		{
			result = result * (double)(n -i + 1) / i;
		}
		
		return result;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter total no. of components : ");
		int n = sc.nextInt();
		
		System.out.print("Enter total no. of defective components : ");
		int d = sc.nextInt();
		
		System.out.print("Enter selected K components no. : ");
		int k = sc.nextInt();
		
		System.out.print("Enter no. of R defective components : ");
		int r = sc.nextInt();
		
		double favourable = combination(d,r) * combination(n-d, k-r);
		
		double total = combination(n,k);
		
		double probability = favourable / total;
		
		System.out.printf("Probability of drawing exactly R cards : " + "%.6f\n", probability);
		
	}

}
