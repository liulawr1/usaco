/*
ID: liulawr1
LANG: JAVA
TASK: cowfind
 */

import java.io.*;
import java.util.ArrayList;

public class cowfind {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new FileReader("cowfind.in"));
        PrintWriter out = new PrintWriter(new FileWriter("cowfind.out"));
        String parentheses = reader.readLine();
        ArrayList<Integer> hind = new ArrayList<>();
        ArrayList<Integer> front = new ArrayList<>();
        for (int i = 0; i < parentheses.length() - 1; i++) {
            if (parentheses.charAt(i) == '(' && parentheses.charAt(i + 1) == '(') {
                hind.add(i);
            } else if (parentheses.charAt(i) == ')' && parentheses.charAt(i + 1) == ')') {
                front.add(i);
            }
        }
        int count = 0;
        for (Integer x : hind) {
            for (Integer y : front) {
                if (y > x) {
                    count++;
                }
            }
        }
        out.println(count);
        out.close();
    }
}