import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class slowdown {
    public static void main(String[] args) throws IOException {
        Scanner scan = new Scanner(new FileReader("slowdown.in"));
        PrintWriter out = new PrintWriter("slowdown.out");
        int totalNumOfEvents = scan.nextInt();
        ArrayList<Integer> T = new ArrayList<>();
        ArrayList<Integer> D = new ArrayList<>();
        for (int i = 0; i < totalNumOfEvents; i++) {
            char type = scan.next().charAt(0);
            int value  = scan.nextInt();
            if (type == 'T')
                T.add(value);
            else
                D.add(value);
        }
        Collections.sort(T);
        D.add(1000);
        Collections.sort(D);
        double currTime = 0, currPos = 0, speed = 1, eventCount = 0;
        while (!D.isEmpty()) {
            char nextEvent;
            if (T.isEmpty())
                nextEvent = 'D';
            else
                nextEvent = (currPos + (T.get(0) - currTime) * speed < D.get(0)) ? 'T' : 'D';
            if (nextEvent == 'T') {
                currPos += (T.get(0) - currTime) * speed;
                currTime = T.get(0);
                T.remove(0);
            } else {
                currTime += (D.get(0) - currPos) / speed;
                currPos = D.get(0);
                D.remove(0);
            }
            eventCount++;
            speed = 1 / (eventCount + 1);
        }
        out.println((int) (currTime + 0.5));
        out.close();
    }
}