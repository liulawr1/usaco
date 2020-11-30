/*
ID: liulawr1
LANG: JAVA
TASK: records
 */

import java.io.*;
import java.util.Arrays;
import java.util.Scanner;

public class records {
    public static void main(String[] args) throws IOException {
        Scanner scan = new Scanner(new FileReader("records.in"));
        PrintWriter out = new PrintWriter(new FileWriter("records.out"));
        int n = scan.nextInt();
        String[] groups = new String[n];
        for (int i = 0; i < n; i++) {
            String[] aLine = new String[3];
            aLine[0] = scan.next();
            aLine[1] = scan.next();
            aLine[2] = scan.next();
            Arrays.sort(aLine);
            String aGroup = aLine[0] + " " + aLine[1] + " " + aLine[2];
            groups[i] = aGroup;
        }
        Arrays.sort(groups);
        int maxCount = 1;
        int curCount = 1;
        for (int i = 1; i < n; i++) {
            if (groups[i].equals(groups[i - 1])) {
                curCount++;
            } else {
                maxCount = Math.max(maxCount, curCount);
                curCount = 1;
            }
        }
        out.println(maxCount);
        out.close();
    }
}