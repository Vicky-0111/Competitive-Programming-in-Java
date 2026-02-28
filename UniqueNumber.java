import java.util.*;

public class UniqueNumber {
	public static int unique(int arr[]) {
		
		int result = 0;
		
		for(int i = 0; i < arr.length; i++) 
		{
			result = result ^ arr[i];
		}
		
		return result;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter size of array : ");
		int n = sc.nextInt();
		
		int arr[] = new int[n];
		
		System.out.print("Enter array : ");
		for(int i = 0; i < n; i++) 
		{
			arr[i] = sc.nextInt();
		}
		
		System.out.print("Unique number is : " + unique(arr));
		
	}

}