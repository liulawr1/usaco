/*
ID: liulawr1
LANG: JAVA
TASK: lostcow
 */

import java.io.*;
import java.util.StringTokenizer;

public class lostcow {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new FileReader("lostcow.in"));
        PrintWriter out = new PrintWriter(new FileWriter("lostcow.out"));
        StringTokenizer st = new StringTokenizer(reader.readLine());
        int x = Integer.parseInt(st.nextToken());
        int y = Integer.parseInt(st.nextToken());
        int distance = 0;
        int move = 1;
        while (true) {
            if ((x + move >= y && y >= x) || (x + move <= y && y < x)) {
                distance += Math.abs(y - x);
                break;
            } else {
                distance += 2 * Math.abs(move);
                move = -1 * 2 * move;
            }
        }
        out.println(distance);
        out.close();
    }
}