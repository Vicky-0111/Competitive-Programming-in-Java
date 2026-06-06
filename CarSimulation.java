import java.util.Scanner;

public class CarSimulation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Read number of cars
        int N = sc.nextInt();
        int[] cars = new int[N];

        // Read car distances
        for (int i = 0; i < N; i++) {
            cars[i] = sc.nextInt();
        }

        // Two-pointer initialization
        int left = 0;
        int right = N - 1;

        // Process cars alternately from left and right
        while (left <= right) {
            System.out.print(cars[left] + " ");
            left++;
            if (left <= right) {
                System.out.print(cars[right] + " ");
                right--;
            }
        }

        sc.close();
    }
}