/*
ID: liulawr1
LANG: JAVA
TASK: teleport
 */

import java.io.*;
import java.lang.*;
import java.util.StringTokenizer;

public class teleport {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new FileReader("teleport.in"));
        PrintWriter out = new PrintWriter(new FileWriter("teleport.out"));
        StringTokenizer st = new StringTokenizer(reader.readLine());
        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());
        int x = Integer.parseInt(st.nextToken());
        int y = Integer.parseInt(st.nextToken());
        if ((y > x && b > a) || (y < x && b < a))
            out.println(Math.min(Math.abs(b - a), Math.abs(b-y) + Math.abs(a-x)));
        else
            out.println(Math.min(Math.abs(b - a), Math.abs(b-x) + Math.abs(a-y)));
        out.close();
    }
}