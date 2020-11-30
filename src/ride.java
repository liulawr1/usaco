/*
ID: liulawr1
LANG: JAVA
TASK: ride
 */

import java.io.*;

public class ride {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new FileReader("ride.in"));
        PrintWriter out = new PrintWriter(new FileWriter("ride.out"));
        String cometName = reader.readLine();
        String groupName = reader.readLine();
        int cometNumber = 1;
        int groupNumber = 1;
        for (int i = 0; i < cometName.length(); i++) {
            cometNumber *= cometName.charAt(i) - 'A' + 1;
        }
        for (int i = 0; i < groupName.length(); i++) {
            groupNumber *= groupName.charAt(i) - 'A' + 1;
        }
        if (cometNumber % 47 == groupNumber % 47) {
            out.println("GO");
        } else {
            out.println("STAY");
        }
        out.close();
    }
}