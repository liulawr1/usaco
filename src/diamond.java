/*
ID: liulawr1
LANG: JAVA
TASK: diamond
 */

import java.io.*;
import java.util.StringTokenizer;

public class diamond {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new FileReader("diamond.in"));
        PrintWriter out = new PrintWriter(new FileWriter("diamond.out"));
        StringTokenizer st = new StringTokenizer(reader.readLine());
        int n = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());
        int[] diamonds = new int[n];
        for (int i = 0; i < n; i++) {
            diamonds[i] = Integer.parseInt(reader.readLine());
        }
        int maxCount = Integer.MIN_VALUE;
        for (int i = 0; i < n; i++) {
            int count = 0;
            for (int j = 0; j < n; j++) {
                if (diamonds[j] >= diamonds[i] && diamonds[j] <= diamonds[i] + k) {
                    count++;
                }
            }
            maxCount = Math.max(maxCount, count);
        }
        out.println(maxCount);
        out.close();
    }
}