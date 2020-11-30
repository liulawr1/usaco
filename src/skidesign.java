/*
ID: liulawr1
LANG: JAVA
TASK: skidesign
 */

import java.io.*;

public class skidesign {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new FileReader("skidesign.in"));
        PrintWriter out = new PrintWriter(new FileWriter("skidesign.out"));
        int n = Integer.parseInt(reader.readLine());
        int[] hills = new int[n];
        for (int i = 0; i < n; i++) {
            hills[i] = Integer.parseInt(reader.readLine());
        }
        int minCost = Integer.MAX_VALUE;
        for (int i = 0; i < n; i++) {
            int cost = 0;
            for (int j = 0; j < n; j++) {
                if (hills[j] < i) {
                    cost += (i - hills[j]) * (i - hills[j]);
                } else if (hills[j] > i + 17) {
                    cost += (hills[j] - (i + 17)) * (hills[j] - (i + 17));
                }
            }
            minCost = Math.min(minCost, cost);
        }
        out.println(minCost);
        out.close();
    }
}