import java.util.*;

public class ModularMultiplication {
	public static void ModMul(long a, long b, long m, long k) {
		
		long result = (((a % m) * (b % m)) % m);
		
		if(result % k == 0) 
		{
			System.out.print("Divisible");
		}
		else 
		{
			System.out.print("Not Divisible");
		}
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter first no. : ");
		long a = sc.nextLong();
		
		System.out.print("Enter second no. : ");
		long b = sc.nextLong();
		
		System.out.print("Enter modulo no. : ");
		long m = sc.nextLong();
		
		System.out.print("Enter divisor no. : ");
		long k = sc.nextLong();
		
		ModMul(a,b,m,k);
	}

}
