/*
ID: liulawr1
LANG: JAVA
TASK: friday
 */

import java.io.*;

public class friday {
    public static boolean isLeapYear (int year) {
        return year % 4 == 0 && (year % 100 != 0 || year % 400 == 0);
    }
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new FileReader("friday.in"));
        PrintWriter out = new PrintWriter(new FileWriter("friday.out"));
        int n = Integer.parseInt(reader.readLine());
        int mStart = 2;
        int[] mMap = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        int[] dMap = {0, 0, 0, 0, 0, 0, 0};
        for (int y = 1900; y < 1900 + n; y++) {
            for (int m = 0; m < 12; m++) {
                dMap[(mStart + 13 - 1) % 7]++;
                if (m == 1 && isLeapYear(y)) {
                    mStart = (mStart + mMap[m] + 1) % 7;
                } else {
                    mStart = (mStart + mMap[m]) % 7;
                }
            }
        }
        for (int i = 0; i < 7; i++) {
            if (i != 6) {
                out.print(dMap[i] + " ");
            } else {
                out.println(dMap[i]);
            }
        }
        out.close();
    }
}