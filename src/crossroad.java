/*
ID: liulawr1
LANG: JAVA
TASK: crossroad
 */

import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;

public class crossroad {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new FileReader("crossroad.in"));
        PrintWriter out = new PrintWriter(new FileWriter("crossroad.out"));
        int n = Integer.parseInt(reader.readLine());
        int[] cowPosition = new int[11];
        int totalCrossings = 0;
        Arrays.fill(cowPosition, -1);
        for (int i = 0; i < n; i++) {
            StringTokenizer st = new StringTokenizer(reader.readLine());
            int cowID = Integer.parseInt(st.nextToken());
            int side = Integer.parseInt(st.nextToken());
            if (cowPosition[cowID] >= 0 && cowPosition[cowID] != side) {
                totalCrossings++;
            }
            cowPosition[cowID] = side;
        }
        out.println(totalCrossings);
        out.close();
    }
}