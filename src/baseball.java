/*
ID: liulawr1
LANG: JAVA
TASK: baseball
 */

import java.io.*;
import java.util.Arrays;

public class baseball {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new FileReader("baseball.in"));
        PrintWriter out = new PrintWriter(new FileWriter("baseball.out"));
        int n = Integer.parseInt(reader.readLine());
        int[] position = new int[n];
        for (int i = 0; i < n; i++) {
            position[i] = Integer.parseInt(reader.readLine());
        }
        Arrays.sort(position);
        int count = 0;
        for (int i = 0; i < n - 2; i++) {
            for (int j = i + 1; j < n - 1; j++) {
                for (int k = j + 1; k < n; k++) {
                    int firstThrow = position[j] - position[i];
                    int secondThrow = position[k] - position[j];
                    if (secondThrow >= firstThrow && secondThrow <= 2 * firstThrow) {
                        count++;
                    }
                }
            }
        }
        out.println(count);
        out.close();
    }
}