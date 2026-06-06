import java.util.*;

public class CountSubstring {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String text = sc.nextLine().trim();
        String pattern = sc.nextLine().trim();

        int n = text.length(), m = pattern.length(), count = 0;

        for (int i = 0; i <= n - m; i++) {
            int j = 0;
            while (j < m && text.charAt(i + j) == pattern.charAt(j)) j++;
            if (j == m) count++;
        }

        System.out.println(count);
        sc.close();
    }
}