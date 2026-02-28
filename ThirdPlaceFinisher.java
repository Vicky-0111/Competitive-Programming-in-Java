import java.util.*;

public class ThirdPlaceFinisher {

    public static long finishingTime(long[] time, int n) {

        if (n < 3) {
            throw new IllegalArgumentException("At least 3 participants required");
        }

        // Insertion Sort
        for (int i = 1; i < n; i++) {
            long key = time[i];
            int j = i - 1;

            while (j >= 0 && time[j] > key) {
                time[j + 1] = time[j];
                j--;
            }

            time[j + 1] = key;
        }

        return time[2];   // third smallest
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter no. of finishing time : ");
        int n = sc.nextInt();

        long[] time = new long[n];

        System.out.print("Enter times : ");
        for (int i = 0; i < n; i++) {
            time[i] = sc.nextLong();
        }

        long result = finishingTime(time, n);
        System.out.println("Third smallest finishing time is : " + result);

        sc.close();
    }
}