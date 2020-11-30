/*
ID: liulawr1
LANG: JAVA
TASK: gymnastics
 */

import java.io.*;
import java.util.Scanner;

public class gymnastics {
    public static void main(String[] args) throws IOException {
        Scanner scan = new Scanner(new FileReader("gymnastics.in"));
        PrintWriter out = new PrintWriter(new FileWriter("gymnastics.out"));
        int k = scan.nextInt();
        int n = scan.nextInt();
        int[][] lineup = new int[k][n+1];
        for (int i = 0; i < k; i++) {
            for (int j = 0; j < n; j++) {
                int cow = scan.nextInt();
                lineup[i][cow] = j;
            }
        }
        int count = 0;
        for (int c1 = 1; c1 <= n; c1++) {
            apair:for (int c2 = c1 + 1; c2 <= n; c2++) {
                boolean order = lineup[0][c1] < lineup[0][c2];
                for (int l = 1; l < k; l++) {
                    if (lineup[l][c1] < lineup[l][c2] != order) {
                        continue apair;
                    }
                }
                count++;
            }
        }
        out.println(count);
        out.close();
    }
}