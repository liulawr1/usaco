/*
ID: liulawr1
LANG: JAVA
TASK: breedflip
 */

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class breedflip {
    public static void main(String[] args) throws IOException {
        Scanner scan = new Scanner(new FileReader("breedflip.in"));
        PrintWriter out = new PrintWriter(new FileWriter("breedflip.out"));
        int n = scan.nextInt();
        String a = scan.next();
        String b = scan.next();
        int count = 0;
        boolean prevSame = true;
        for (int i = 0; i < a.length(); i++) {
            if (a.charAt(i) == b.charAt(i)) {
                prevSame = true;
            } else {
                if (prevSame) {
                    count++;
                }
                prevSame = false;
            }
        }
        out.println(count);
        out.close();
    }
}