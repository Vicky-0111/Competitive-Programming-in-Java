import java.util.*;

public class SuspicousAccess {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();              // number of access IDs
        int[] ids = new int[n];
        for (int i = 0; i < n; i++) {
            ids[i] = sc.nextInt();         // read access IDs
        }

        int x = sc.nextInt();              // access ID to search
        int k = sc.nextInt();              // limit for valid access

        boolean found = false;

        for (int i = 0; i < n; i++) {
            if (ids[i] == x) {
                found = true;
                if (i < k) {
                    System.out.println("Valid Access");
                } else {
                    System.out.println("Late Access");
                }
                break;
            }
        }

        if (!found) {
            System.out.println("Access ID Not Found");
        }

        sc.close();
    }
}