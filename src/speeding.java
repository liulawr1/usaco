import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class speeding {
    public static void main(String[] args) throws IOException {
        Scanner scan = new Scanner(new FileReader("speeding.in"));
        PrintWriter out = new PrintWriter(new FileWriter("speeding.out"));
        int n = scan.nextInt();
        int[] rSpeed = new int[n];
        int[] rPos = new int[n + 1];
        int m = scan.nextInt();
        int[] bSpeed = new int[m];
        int[] bPos = new int[m + 1];
        for (int r = 0; r < n; r++) {
            int len = scan.nextInt();
            rSpeed[r] = scan.nextInt();
            rPos[r + 1] = rPos[r] + len;
        }
        for (int b = 0; b < m; b++) {
            int len = scan.nextInt();
            bSpeed[b] = scan.nextInt();
            bPos[b + 1] = bPos[b] + len;
        }
        int maxOver = 0, r = 0, b = 0, pos = 0;
        while (pos < 100) {
            maxOver = Math.max(maxOver, bSpeed[b] - rSpeed[r]);
            pos = Math.min(bPos[b + 1], rPos[r + 1]);
            if (pos == bPos[b + 1])
                b++;
            if (pos == rPos[r + 1])
                r++;
        }
        out.println(maxOver);
        out.close();
    }
}