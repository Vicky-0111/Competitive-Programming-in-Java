import java.util.Scanner;

public class MinimumElement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Step 1: Read number of elements
        int n = sc.nextInt();

        // Step 2: Store elements in an array
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        // Step 3: Initialize minimum with first element
        int min = arr[0];

        // Step 4: Traverse array to find minimum
        for (int i = 1; i < n; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
        }

        // Step 5: Print minimum element
        System.out.println(min);

        sc.close();
    }
}