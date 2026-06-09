import java.util.*;
import java.io.*;

public class FileSystemOperations {
    static Map<String, Set<String>> directoryMap = new HashMap<>();
    static Map<String, String> fileIndex = new HashMap<>();
    static StringBuilder output = new StringBuilder();

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine().trim());

        while (n-- > 0) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            String command = st.nextToken();

            switch (command) {
                case "CREATE" -> {
                    String dir = st.nextToken();
                    String file = st.nextToken();
                    directoryMap.computeIfAbsent(dir, k -> new LinkedHashSet<>()).add(file);
                    fileIndex.put(file, dir);
                    output.append("File Created\n");
                }
                case "DELETE" -> {
                    String file = st.nextToken();
                    String dir = fileIndex.remove(file);
                    if (dir != null && directoryMap.containsKey(dir)) {
                        directoryMap.get(dir).remove(file);
                        output.append("File Deleted\n");
                    } else {
                        output.append("File Not Found\n");
                    }
                }
                case "FIND" -> {
                    String file = st.nextToken();
                    output.append(fileIndex.containsKey(file) ? "File Exists\n" : "File Not Found\n");
                }
            }
        }

        System.out.print(output);
    }
}
