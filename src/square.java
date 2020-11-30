/*
ID: liulawr1
LANG: JAVA
TASK: square
 */

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class square {
    public static void main(String[] args) throws IOException {
        Scanner scan = new Scanner(new FileReader("square.in"));
        PrintWriter out = new PrintWriter(new FileWriter("square.out"));
        int x1 = scan.nextInt();
        int y1 = scan.nextInt();
        int x2 = scan.nextInt();
        int y2 = scan.nextInt();
        int x3 = scan.nextInt();
        int y3 = scan.nextInt();
        int x4 = scan.nextInt();
        int y4 = scan.nextInt();
        int left = Math.min(x1, x3);
        int right = Math.max(x2, x4);
        int bottom = Math.min(y1, y3);
        int top = Math.max(y2, y4);
        int minWidth = right - left;
        int minHeight = top - bottom;
        int minSqLen = Math.max(minHeight, minWidth);
        out.println(minSqLen * minSqLen);
        out.close();
    }
}