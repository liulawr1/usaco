/*
ID: liulawr1
LANG: JAVA
TASK: gift1
 */

import java.io.*;
import java.util.HashMap;
import java.util.StringTokenizer;

public class gift1 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new FileReader("gift1.in"));
        PrintWriter out = new PrintWriter(new FileWriter("gift1.out"));
        int np = Integer.parseInt(reader.readLine());
        String[] names = new String[np];
        HashMap<String, Integer> map = new HashMap<>();
        for (int i = 0; i < names.length; i++) {
            names[i] = reader.readLine();
            map.put(names[i], 0);
        }
        String name = reader.readLine();
        while (name != null) {
            StringTokenizer st = new StringTokenizer(reader.readLine());
            int amount = Integer.parseInt(st.nextToken());
            int ng = Integer.parseInt(st.nextToken());
            if (ng == 0) {
                name = reader.readLine();
                continue;
            }
            for (int i = 0; i < ng; i++) {
                String toName = reader.readLine();
                int prevMoney = map.get(toName);
                map.put(toName, amount / ng + prevMoney);
            }
            map.put(name, map.get(name) - amount + amount % ng);
            name = reader.readLine();
        }
        for (int i = 0; i < np; i++) {
            out.println(names[i] + " " + map.get(names[i]));
        }
        out.close();
    }
}