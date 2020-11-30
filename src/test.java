/*
ID: liulawr1
LANG: JAVA
TASK: test
 */

import java.io.*;
import java.util.StringTokenizer;

public class test {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new FileReader("test.in"));
        PrintWriter out = new PrintWriter(new FileWriter("test.out"));
        StringTokenizer st = new StringTokenizer(reader.readLine());
        int i1 = Integer.parseInt(st.nextToken());
        int i2 = Integer.parseInt(st.nextToken());
        out.println(i1 + i2);
        out.close();
    }
}