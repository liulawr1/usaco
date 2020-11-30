/*
ID: liulawr1
LANG: JAVA
TASK: marathon
 */

import java.io.*;
import java.util.StringTokenizer;

public class marathon {
    public static int solve(String inFile) throws IOException {
        BufferedReader reader = new BufferedReader(new FileReader(inFile));
        int n = Integer.parseInt(reader.readLine());
        int[] x = new int[n];
        int[] y = new int[n];
        int totalDist = 0;
        for (int i = 0; i < n; i++) {
            StringTokenizer st = new StringTokenizer(reader.readLine());
            x[i] = Integer.parseInt(st.nextToken());
            y[i] = Integer.parseInt(st.nextToken());
            if (i > 0) {
                totalDist += Math.abs(x[i] - x[i - 1]) + Math.abs(y[i] - y[i - 1]);
            }
        }
        int maxSkip = Integer.MIN_VALUE;
        for (int i = 1; i < n - 1; i++) {
            int withoutSkipDist = Math.abs(x[i + 1] - x[i]) + Math.abs(x[i] - x[i - 1]) + Math.abs(y[i + 1] - y[i]) + Math.abs(y[i] - y[i - 1]);
            int skipDist = Math.abs(x[i + 1] - x[i - 1]) + Math.abs(y[i + 1] - y[i - 1]);
            maxSkip = Math.max(maxSkip, withoutSkipDist - skipDist);
        }
        return totalDist - maxSkip;
    }
    static String DIRNAME = "marathon_bronze/";
    public static void main(String[] args) throws IOException {
        for (int f = 1; f <= 10; f++) {
            System.out.print("Test # " + f + "...");
            solve(DIRNAME + f + ".in");
            compare(f);
        }
    }
    static void compare(int t) throws IOException {
        String inFile = DIRNAME + t + ".in";
        BufferedReader f2 = new BufferedReader(new FileReader(DIRNAME + t + ".out"));
        int got = solve(inFile);
        int expected = Integer.parseInt(f2.readLine());
        if (!(got == expected)) {
            System.out.println("Failed (Got: " + got + ") (Expected: " + expected + ")");
        } else {
            System.out.println("Passed");
        }
    }
}