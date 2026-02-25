import java.util.*;
public class SumOfLargeNumber {
	public static long Modulo(long arr[], long m ) {
		
		long total = 0;
		
		for(int i = 0; i < arr.length; i++) 
		{
			total = (total + (arr[i] % m)) % m; 
		}
		
		return total;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter no. of elements : ");
		int n = sc.nextInt();
		
		System.out.print("Enter modulo no. : ");
		long m = sc.nextLong();
		
		long arr[] = new long[n];
		
		System.out.print("Enter elements : ");
		
		for(int i = 0; i < n; i++) 
		{
			arr[i] = sc.nextLong();
		}
		
		long result = Modulo(arr,m);
		
		System.out.print("Result is : " + result);
		
	}

}