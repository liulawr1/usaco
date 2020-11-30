/*
ID: liulawr1
LANG: JAVA
TASK: ctiming
 */

import java.io.*;
import java.util.StringTokenizer;

public class ctiming {
    public static int solve(String inFile) throws IOException {
        BufferedReader reader = new BufferedReader(new FileReader(inFile));
        StringTokenizer st = new StringTokenizer(reader.readLine());
        int d = Integer.parseInt(st.nextToken());
        int h = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        int diff = (d - 11) * 24 * 60 + (h - 11) * 60 + m - 11;
        return diff >= 0? diff : -1;
    }
    static String DIRNAME = "ctiming/";
    public static void main(String[] args) throws IOException {
        for (int f = 1; f <= 10; f++) {
            System.out.print("Test # " + f + "...");
            solve(DIRNAME + "I." + f);
            compare(f);
        }
    }
    static void compare(int t) throws IOException {
        String inFile = DIRNAME + "I." + t;
        BufferedReader f2 = new BufferedReader(new FileReader(DIRNAME + "O." + t));
        int got = solve(inFile);
        int expected = Integer.parseInt(f2.readLine());
        if (!(got == expected)) {
            System.out.println("Failed (Got: " + got + ") (Expected: " + expected + ")");
        } else {
            System.out.println("Passed");
        }
    }
}