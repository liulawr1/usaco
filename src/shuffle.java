import java.io.*;
import java.util.Scanner;

public class shuffle {
    public static void main(String[] args) throws IOException {
        Scanner scan = new Scanner(new FileReader("shuffle.in"));
        PrintWriter out = new PrintWriter(new FileWriter("shuffle.out"));
        int n = scan.nextInt();
        int[] newPos = new int[n + 1];
        for (int i = 1; i <= n; i++) {
            int to = scan.nextInt();
            newPos[to] = i;
        }
        String[] lineup = new String[n + 1];
        for (int i = 1; i <= n; i++) {
            lineup[i] = scan.next();
        }
        for (int j = 1; j <= 3; j++) {
            String[] nextPos = new String[n + 1];
            for (int k = 1; k <= n; k++) {
                nextPos[newPos[k]] = lineup[k];
            }
            lineup = nextPos;
        }
        for (int l = 1; l <= n; l++) {
            out.println(lineup[l]);
        }
        out.close();
    }
}