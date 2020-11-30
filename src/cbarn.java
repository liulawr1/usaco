/*
ID: liulawr1
LANG: JAVA
TASK: cbarn
 */

import java.io.*;

public class cbarn {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new FileReader("cbarn.in"));
        PrintWriter out = new PrintWriter(new FileWriter("cbarn.out"));
        int n = Integer.parseInt(reader.readLine());
        int[] rooms = new int[n];
        for (int i = 0; i < n; i++) {
            rooms[i] = Integer.parseInt(reader.readLine());
        }
        int minDistance = Integer.MAX_VALUE;
        for (int i = 0; i < n; i++) {
            int distance = 0;
            for (int j = 0; j < n; j++) {
                if ((j - i) < 0) {
                    distance += rooms[j] * (n + (j - i));
                } else {
                    distance += rooms[j] * (j - i);
                }
            }
            minDistance = Math.min(minDistance, distance);
        }
        out.println(minDistance);
        out.close();
    }
}