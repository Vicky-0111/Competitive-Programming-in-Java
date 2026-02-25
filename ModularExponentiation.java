import java.util.*;
public class ModularExponentiation {
	public static long modulo(long a, long m, long p) {
		
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
		
		System.out.print("Enter a : ");
		long a = sc.nextInt();
		
		System.out.print("Enter m : ");
		long m = sc.nextInt();
		
		System.out.print("Enter p : ");
		long p = sc.nextInt();
		
		System.out.print(modulo(a,m,p));
		
		
	}

}