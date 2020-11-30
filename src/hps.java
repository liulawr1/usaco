/*
ID: liulawr1
LANG: JAVA
TASK: hps
 */

import java.io.*;
import java.util.StringTokenizer;

public class hps {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new FileReader("hps.in"));
        PrintWriter out = new PrintWriter(new FileWriter("hps.out"));
        int n = Integer.parseInt(reader.readLine());
        char[][] rules = {{'h', 'p', 's'}, {'h', 's', 'p'}, {'s', 'h', 'p'}, {'s', 'p', 'h'}, {'p', 'h', 's'}, {'p', 's', 'h'}};
        int[][] games = new int[n][2];
        for (int i = 0; i < n; i++) {
            StringTokenizer st = new StringTokenizer(reader.readLine());
            games[i][0] = Integer.parseInt(st.nextToken());
            games[i][1] = Integer.parseInt(st.nextToken());
        }
        int maxWins = 0;
        for (char[] c : rules) {
            int curWins = 0;
            for (int[] game : games) {
                char c1 = c[game[0] - 1];
                char c2 = c[game[1] - 1];
                if ((c1 == 'h' && c2 == 's') || (c1 == 's' && c2 == 'p') || (c1 == 'p' && c2 == 'h')) {
                    curWins++;
                }
            }
            maxWins = Math.max(maxWins, curWins);
        }
        out.println(maxWins);
        out.close();
    }
}