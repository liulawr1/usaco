/*
ID: liulawr
LANG: JAVA
TASK: paint
 */

import java.io.*;
import java.util.*;

public class paint {
    public static void main(String[] args) throws IOException {
        Scanner scan = new Scanner(new FileReader("paint.in"));
        PrintWriter out = new PrintWriter(new FileWriter("paint.out"));
        int a = scan.nextInt();
        int b = scan.nextInt();
        int c = scan.nextInt();
        int d = scan.nextInt();
        int FJ = b - a;
        int Bessie = d - c;
        int total = FJ + Bessie;
        int span = Math.max(b, d) - Math.min(a, c);
        int ans = Math.min(span, total);
        out.println(ans);
        out.close();
    }
}