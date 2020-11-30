/*
ID: liulawr1
LANG: JAVA
TASK: pails
 */

import java.io.*;
import java.util.StringTokenizer;

public class pails {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new FileReader("pails.in"));
        PrintWriter out = new PrintWriter(new FileWriter("pails.out"));
        StringTokenizer st = new StringTokenizer(reader.readLine());
        int x = Integer.parseInt(st.nextToken());
        int y = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        int totalMax = 0;
        for (int i = 0; i <= m / x; i++) {
            int j = (m - i * x) / y;
            int curMax = i * x + j * y;
            totalMax = Math.max(curMax, totalMax);
        }
        out.println(totalMax);
        out.close();
    }
}