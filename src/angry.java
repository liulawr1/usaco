import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.Scanner;

public class angry {
    public static void main(String[] args) throws IOException {
        Scanner scan = new Scanner(new FileReader("angry.in"));
        PrintWriter out = new PrintWriter(new FileWriter("angry.out"));
        int n = scan.nextInt();
        haybale = new int[n];
        for (int i = 0; i < n; i++)
            haybale[i] = scan.nextInt();
        Arrays.sort(haybale);
        int maxBurned = 0;
        for (int i = 0; i < n; i++)
            maxBurned = Math.max(maxBurned, calculate(i));
        out.println(maxBurned + 1);
        out.close();
    }
    static int[] haybale;
    static int calculate (int hay) {
        int counter = 0;
        int radius = 1;
        int origHay = hay;
        while (true) {
            int r = hay + 1;
            while (r < haybale.length && haybale[r] <= haybale[hay] + radius)
                r++;
            if ((r - hay) - 1 == 0) break;
            counter += (r - hay) - 1;
            radius++;
            hay = r - 1;
        }
        hay = origHay;
        radius = 1;
        while (true) {
            int r = hay - 1;
            while (r >= 0 && haybale[r] >= haybale[hay] - radius)
                r--;
            if ((hay - r) - 1 == 0) break;
            counter += (hay - r) - 1;
            radius++;
            hay = r + 1;
        }
        return counter;
    }
}