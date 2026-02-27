import java.util.*;

public class ModularPowerSum {
	public static long ModPow(long a, long m, long p) {
		
		long result = 1;
		a = a % p;
		
		while(m > 0) 
		{
			if((m & 1) == 1) 
			{
				result = (result * a) % p;
			}
			a = (a * a) % p;
			m = m >> 1;
		}
		
		return result;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter no. of pairs : ");
		int n = sc.nextInt();
		
		System.out.print("Enter modulo : ");
		long p = sc.nextLong();
		
		long total = 0;  // Initialize final value 
		
		for(int i = 0; i < n; i++) 
		{
			long a = sc.nextLong();
			long m = sc.nextLong();
			total = (total + ModPow(a,m,p) % p);
		}
		
		System.out.print("Modular power sum is : " + total);
	}

}
