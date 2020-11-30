/*
ID: liulawr1
LANG: JAVA
TASK: balancing
 */

import java.io.*;
import java.util.Scanner;

public class balancing {
    public static void main(String[] args) throws IOException {
        Scanner scan = new Scanner(new FileReader("balancing.in"));
        PrintWriter out = new PrintWriter(new FileWriter("balancing.out"));
        int n = scan.nextInt();
        int b = scan.nextInt();
        int[] x = new int[n];
        int[] y = new int[n];
        for (int i = 0; i < n; i++) {
            x[i] = scan.nextInt();
            y[i] = scan.nextInt();
        }
        int minMax = n;
        for (int i = 0; i < n; i++) {
            int fy = y[i] - 1;
            for (int j = 0; j < n; j++) {
                int fx = x[j] - 1;
                int topleft = 0, topright = 0, bottomleft = 0, bottomright = 0;
                for (int k = 0; k < n; k++) {
                    if (x[k] > fx && y[k] > fy) {
                        topright++;
                    } else if (x[k] < fx && y[k] > fy) {
                        topleft++;
                    } else if (x[k] > fx && y[k] < fy) {
                        bottomright++;
                    } else {
                        bottomleft++;
                    }
                }
                int maxRegion = Math.max(Math.max(topleft, topright), Math.max(bottomleft, bottomright));
                minMax = Math.min(minMax, maxRegion);
            }
        }
        out.println(minMax);
        out.close();
    }
}