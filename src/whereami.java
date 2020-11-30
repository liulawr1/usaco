/*
ID: liulawr1
LANG: JAVA
TASK: whereami
 */

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class whereami {
    public static void main(String[] args) throws IOException {
        Scanner scan = new Scanner(new FileReader("whereami.in"));
        PrintWriter out = new PrintWriter(new FileWriter("whereami.out"));
        int n = scan.nextInt();
        String houses = scan.next();
        tryK: for (int k = 1; k <= n; k++) {
            for (int start = 0; start <= n - k; start++) {
                String see = houses.substring(start, start + k);
                int repeat = houses.indexOf(see, start + 1);
                if (repeat != -1) {
                    continue tryK;
                }
            }
            out.println(k);
            out.close();
            return;
        }
    }
}