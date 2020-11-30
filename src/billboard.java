/*
ID: liulawr1
LANG: JAVA
TASK: billboard
 */

import java.io.*;
import java.util.StringTokenizer;

class Rect {
    public int x1;
    public int y1;
    public int x2;
    public int y2;
    public Rect(int x1, int y1, int x2, int y2) {
        this.x1 = x1;
        this.x2 = x2;
        this.y1 = y1;
        this.y2 = y2;
    }
}
public class billboard {
    public static int visibleArea(Rect r1, Rect r2) {
        int width = Math.max(0, Math.min(r2.x2, r1.x2) - Math.max(r2.x1, r1.x1));
        int height = Math.max(0, Math.min(r2.y2, r1.y2) - Math.max(r2.y1, r1.y1));
        int boarArea = (r1.x2 - r1.x1) * (r1.y2 - r1.y1);
        return boarArea - width * height;
    }
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new FileReader("billboard.in"));
        PrintWriter out = new PrintWriter(new FileWriter("billboard.out"));
        int[][] rectPoints = new int[3][4];
        for (int i = 0; i < 3; i++) {
            StringTokenizer st = new StringTokenizer(reader.readLine());
            for (int j = 0; j < 4; j++) {
                rectPoints[i][j] = Integer.parseInt(st.nextToken());
            }
        }
        Rect r1 = new Rect(rectPoints[0][0], rectPoints[0][1], rectPoints[0][2], rectPoints[0][3]);
        Rect r2 = new Rect(rectPoints[1][0], rectPoints[1][1], rectPoints[1][2], rectPoints[1][3]);
        Rect truck = new Rect(rectPoints[2][0], rectPoints[2][1], rectPoints[2][2], rectPoints[2][3]);
        out.println(visibleArea(r1, truck) + visibleArea(r2, truck));
        out.close();
    }
}