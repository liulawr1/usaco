/*
ID: liulawr1
LANG: JAVA
TASK: buckets
 */

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class buckets {
    public static void main(String[] args) throws IOException {
        Scanner scan = new Scanner(new FileReader("buckets.in"));
        PrintWriter out = new PrintWriter(new FileWriter("buckets.out"));
        int barnX = 0, barnY = 0, lakeX = 0, lakeY = 0, rockX = 0, rockY = 0;
        for (int y = 0; y < 10; y++) {
            String line = scan.next();
            for (int x = 0; x < 10; x++) {
                char c = line.charAt(x);
                if (c == 'B') {
                    barnX = x;
                    barnY = y;
                } else if (c == 'L') {
                    lakeX = x;
                    lakeY = y;
                } else if (c == 'R') {
                    rockX = x;
                    rockY = y;
                }
            }
        }
        int dist = Math.abs(barnX - lakeX) + Math.abs(barnY - lakeY) - 1;
        if (rockX == lakeX && rockX == barnX && (rockY > Math.min(barnY, lakeY) && rockY < Math.max(barnY, lakeY))) {
            dist += 2;
        }
        if (rockY == lakeY && rockY == barnY && (rockX > Math.min(barnX, lakeX) && rockX < Math.max(barnX, lakeX))) {
            dist += 2;
        }
        out.println(dist);
        out.close();
    }
}