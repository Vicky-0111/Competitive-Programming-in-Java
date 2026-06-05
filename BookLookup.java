import java.util.*;

public class BookLookup {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();              // number of books
        HashMap<String, Integer> map = new HashMap<>();

        for (int i = 0; i < n; i++) {
            String title = sc.next();      // book title
            int id = sc.nextInt();         // book ID
            map.put(title, id);            // store in hash table
        }

        int q = sc.nextInt();              // number of queries
        for (int i = 0; i < q; i++) {
            String query = sc.next();
            if (map.containsKey(query)) {
                System.out.println(map.get(query));
            } else {
                System.out.println("Book Not Found");
            }
        }

        sc.close();
    }
}
