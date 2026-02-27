import java.util.*;

public class TeamSelectionCount {
	public static long Combination(int n, int k) {
		
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
		
		System.out.print("Enter total no. of Employee : ");
		int n = sc.nextInt();
		
		System.out.print("Enter no. of members of groups : ");
		int k = sc.nextInt();
		
		System.out.print("Total no. of team : " + Combination(n,k));
	}

}