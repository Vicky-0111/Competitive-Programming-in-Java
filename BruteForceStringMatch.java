import java.util.*;

public class BruteForceStringMatch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String text = sc.nextLine().trim();
        String pattern = sc.nextLine().trim();

        int n = text.length(); 
        	int m = pattern.length();
        boolean found = false;

        for (int i = 0; i <= n - m; i++) {
            int j = 0;
            while (j < m && text.charAt(i + j) == pattern.charAt(j)) j++;
            if (j == m) { found = true; break; }
        }

        System.out.println(found ? "Pattern Found" : "Pattern Not Found");
        sc.close();
    }
}
