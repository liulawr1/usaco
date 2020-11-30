/*
ID: liulawr1
LANG: JAVA
TASK: cowsignal
 */

import java.io.*;
import java.util.Scanner;

public class cowsignal {
    public static void main(String[] args) throws IOException {
        Scanner scan = new Scanner(new FileReader("cowsignal.in"));
        PrintWriter out = new PrintWriter(new FileWriter("cowsignal.out"));
        int m = scan.nextInt();
        int n = scan.nextInt();
        int k = scan.nextInt();
        String[] lines = new String[m];
        for (int i = 0; i < m; i++) {
            lines[i] = scan.next();
        }
        for (String origLine: lines) {
            for (int km = 1; km <= k; km++) {
                for (int i = 0; i < origLine.length(); i++) {
                    char c = origLine.charAt(i);
                    for (int kc = 1; kc <= k; kc++) {
                        out.print(c);
                    }
                }
                out.println();
            }
        }
        out.close();
    }
}