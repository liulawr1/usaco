/*
ID: liulawr1
LANG: JAVA
TASK: word
 */

import java.io.*;
import java.util.StringTokenizer;

public class word {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new FileReader("word.in"));
        PrintWriter out = new PrintWriter(new FileWriter("word.out"));
        StringTokenizer st = new StringTokenizer(reader.readLine());
        int n = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());
        String essay = reader.readLine();
        String[] words = essay.split(" ");
        int wordLen = words[0].length();
        out.print(words[0]);
        for (int i = 1; i < words.length; i++) {
            if (wordLen + words[i].length() <= k) {
                out.print(" " + words[i]);
                wordLen += words[i].length();
            } else {
                out.print("\n" + words[i]);
                wordLen = words[i].length();
            }
        }
        out.println();
        out.close();
    }
}