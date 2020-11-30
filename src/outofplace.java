import java.io.*;
import java.util.Arrays;

public class outofplace {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new FileReader("outofplace.in"));
        PrintWriter out = new PrintWriter(new FileWriter("outofplace.out"));
        int n = Integer.parseInt(reader.readLine());
        int[] line = new int[n];
        for (int i = 0; i < n; i++) {
            line[i] = Integer.parseInt(reader.readLine());
        }
        int[] sorted = line.clone();
        Arrays.sort(line);
        int incorrectCount = 0;
        for (int i = 0; i < n; i++) {
            if (line[i] != sorted[i]) {
                incorrectCount++;
            }
        }
        out.println(incorrectCount - 1);
        out.close();
    }
}