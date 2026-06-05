import java.util.*;

public class LinearSearch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();              // number of elements
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();         // read array elements
        }

        int x = sc.nextInt();              // element to search
        boolean found = false;

        for (int i = 0; i < n; i++) {
            if (arr[i] == x) {
                System.out.println(i);     // print index if found
                found = true;
                break;
            }
        }

        if (!found) {
            System.out.println("Not Found");
        }

        sc.close();
    }
}