import java.util.*;
import java.io.*;

public class FileSystemStructure {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine().trim());

        Map<String, List<String>> tree = new LinkedHashMap<>();
        Set<String> allNodes = new HashSet<>(), childNodes = new HashSet<>();

        // Build tree structure
        for (int i = 0; i < n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            String dir = st.nextToken(), file = st.nextToken();
            tree.computeIfAbsent(dir, k -> new ArrayList<>()).add(file);
            allNodes.add(dir);
            allNodes.add(file);
            childNodes.add(file);
        }

        String search = br.readLine().trim();
        StringBuilder sb = new StringBuilder("File System Structure\n");

        // Find root (directory not listed as a child)
        Deque<String> queue = new ArrayDeque<>();
        tree.keySet().stream().filter(d -> !childNodes.contains(d)).findFirst().ifPresent(queue::add);

        // BFS traversal
        while (!queue.isEmpty()) {
            String cur = queue.poll();
            List<String> children = tree.get(cur);
            if (children != null) {
                sb.append(cur).append(" →");
                for (String child : children) {
                    sb.append(' ').append(child);
                    if (tree.containsKey(child)) queue.add(child);
                }
                sb.append('\n');
            }
        }

        // Search result
        sb.append("\nSearch Result\n")
          .append(allNodes.contains(search) ? "File Found" : "File Not Found");

        System.out.print(sb);
    }
}