/*
ID: liulawr1
LANG: JAVA
TASK: cowtip
 */

import java.io.*;

public class cowtip {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new FileReader("cowtip.in"));
        PrintWriter out = new PrintWriter(new FileWriter("cowtip.out"));
        int n = Integer.parseInt(reader.readLine());
        char[][] grid = new char[n][n];
        for (int i = 0; i < n; i++) {
            String s = reader.readLine();
            for (int j = 0; j < n; j++) {
                grid[i][j] = s.charAt(j);
            }
        }
        int tips = 0;
        for (int i = n - 1; i >= 0; i--) {
            for (int j = n - 1; j >= 0; j--) {
                if (grid[i][j] == '1') {
                    tips++;
                    for (int k = 0; k <= i; k++) {
                        for (int l = 0; l <= j; l++) {
                            if (grid[k][l] == '0') {
                                grid[k][l] = '1';
                            } else {
                                grid[k][l] = '0';
                            }
                        }
                    }
                }
            }
        }
        out.println(tips);
        out.close();
    }
}