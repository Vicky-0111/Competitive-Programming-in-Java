import java.util.Scanner;

public class SlowestCar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Step 1: Read number of cars
        int n = sc.nextInt();

        // Step 2: Store car speeds
        int[] speeds = new int[n];
        for (int i = 0; i < n; i++) {
            speeds[i] = sc.nextInt();
        }

        // Step 3: Read distance
        int distance = sc.nextInt();

        // Step 4: Find minimum speed
        int minSpeed = speeds[0];
        for (int i = 1; i < n; i++) {
            if (speeds[i] < minSpeed) {
                minSpeed = speeds[i];
            }
        }

        // Step 5: Compute maximum time (distance / minSpeed)
        double time = (double) distance / minSpeed;

        // Step 6: Print results
        System.out.println("Minimum Speed = " + minSpeed);
        System.out.printf("Maximum Time = %.2f hours%n", time);

        sc.close();
    }
}