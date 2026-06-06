import java.util.*;

public class KMPMatch {
    static int[] buildLPS(String pat) {
        int m = pat.length();
        int[] lps = new int[m];
        int len = 0, i = 1;
        while (i < m) {
            if (pat.charAt(i) == pat.charAt(len)) {
                lps[i++] = ++len;
            } else {
                if (len != 0) len = lps[len - 1];
                else lps[i++] = 0;
            }
        }
        return lps;
    }

    static void kmpSearch(String text, String pat) {
        int n = text.length(), m = pat.length();
        int[] lps = buildLPS(pat);
        int i = 0, j = 0;
        boolean found = false;

        while (i < n) {
            if (text.charAt(i) == pat.charAt(j)) {
                i++; j++;
                if (j == m) {
                    System.out.println(i - j);
                    j = lps[j - 1];
                    found = true;
                }
            } else {
                if (j != 0) j = lps[j - 1];
                else i++;
            }
        }
        if (!found) System.out.println("Pattern Not Found");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String text = sc.nextLine().trim();
        String pattern = sc.nextLine().trim();
        kmpSearch(text, pattern);
        sc.close();
    }
}
