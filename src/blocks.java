/*
ID: liulawr1
LANG: JAVA
TASK: blocks
 */

import java.io.*;
import java.util.StringTokenizer;

public class blocks {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new FileReader("blocks.in"));
        PrintWriter out = new PrintWriter(new FileWriter("blocks.out"));
        int n = Integer.parseInt(reader.readLine());
        int[] freq = new int[26];
        for (int i = 0; i < n; i++) {
            StringTokenizer st = new StringTokenizer(reader.readLine());
            String first = st.nextToken();
            String second = st.nextToken();
            int[] freq1 = wordFreq(first);
            int[] freq2 = wordFreq(second);
            for (int j = 0; j < 26; j++) {
                freq[j] = Math.max(freq1[j], freq2[j]);
            }
        }
        for (int i = 0; i < 26; i++) {
            out.println(freq[i]);
        }
        out.close();
    }
    public static int[] wordFreq(String a) {
        int[] count = new int[26];
        for (int i = 0; i < a.length(); i++) {
            count[a.charAt(i) - 'a']++;
        }
        return count;
    }
}