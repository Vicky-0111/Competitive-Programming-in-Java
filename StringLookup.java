import java.util.*;

public class StringLookup {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();              // number of strings
        HashSet<String> set = new HashSet<>();

        for (int i = 0; i < n; i++) {
            set.add(sc.next());            // store strings in hash table
        }

        int q = sc.nextInt();              // number of queries
        for (int i = 0; i < q; i++) {
            String query = sc.next();
            if (set.contains(query)) {
                System.out.println("Found");
            } else {
                System.out.println("Not Found");
            }
        }

        sc.close();
    }
}