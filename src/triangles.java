/*
ID: liulawr1
LANG: JAVA
TASK: triangles
 */

import java.io.*;
import java.util.StringTokenizer;

public class triangles {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new FileReader("triangles.in"));
        PrintWriter out = new PrintWriter(new FileWriter("triangles.out"));
        int n = Integer.parseInt(reader.readLine());
        int[] x = new int[n];
        int[] y = new int[n];
        int maxArea = 0;
        for (int i = 0; i < n; i++) {
            StringTokenizer st = new StringTokenizer(reader.readLine());
            x[i] = Integer.parseInt(st.nextToken());
            y[i] = Integer.parseInt(st.nextToken());
        }
        for (int centerV = 0; centerV < n; centerV++) {
            for (int v1 = 0; v1 < n; v1++) {
                for (int v2 = 0; v2 < n; v2++) {
                    if (x[v1] == x[centerV] && y[v2] == y[centerV]) {
                        int height = y[v1] - y[centerV];
                        int width = x[v2] - x[centerV];
                        int area = Math.abs(height * width);
                        maxArea = Math.max(maxArea, area);
                    }
                }
            }
        }
        out.println(maxArea);
        out.close();
    }
}