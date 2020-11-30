/*
ID: liulawr1
LANG: JAVA
TASK: haybales
 */

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class haybales {
    public static int solve(String inFile) throws IOException {
        BufferedReader reader = new BufferedReader(new FileReader(inFile));
        int n = Integer.parseInt(reader.readLine());
        int[] piles = new int[n];
        int moveTotal = 0;
        int moves = 0;
        for (int i = 0; i < n; i++) {
            piles[i] = Integer.parseInt(reader.readLine());
            moveTotal += piles[i];
        }
        int baleAverage = moveTotal / n;
        for (int i = 0; i < n; i++) {
            if (piles[i] < baleAverage) {
                moves += baleAverage - piles[i];
            }
        }
        return moves;
    }
    static String DIRNAME = "haybales/";
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