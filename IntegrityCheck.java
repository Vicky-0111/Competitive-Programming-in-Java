import java.util.*;

public class IntegrityCheck {
	public static int networkPacket(int arr[]) {
		
		int result = 0;
		
		for(int i = 0; i < arr.length; i++)
		{
			result = result ^ arr[i];
		}
		
		return result;
		
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter no. of packets : ");
		int n = sc.nextInt();
		
		int arr[] = new int[n];
		
		System.out.print("Enter packets value : ");
		
		for(int i = 0; i < n; i++) 
		{
			arr[i] = sc.nextInt();
		}
		
		System.out.print("Enter checksum value : ");
		int k = sc.nextInt();
		
		int value = networkPacket(arr);
		
		if(value == k) 
		{
			System.out.print("OK");
		}
		else 
		{
			System.out.print("ANOMALY");
		}
		
	}

}