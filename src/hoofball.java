import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.Scanner;

public class hoofball {
    public static void main(String[] args) throws IOException {
        Scanner scan = new Scanner(new FileReader("hoofball.in"));
        PrintWriter out = new PrintWriter(new FileWriter("hoofball.out"));
        int n = scan.nextInt();
        int[] pos = new int[n + 1];
        for (int i = 1; i <= n; i++) {
            pos[i] = scan.nextInt();
        }
        Arrays.sort(pos);
        int[] to = new int[n + 1];
        int[] fromCount = new int[n + 1];
        to[1] = 2;
        fromCount[2] = 1;
        to[n] = n - 1;
        fromCount[n - 1] = 1;
        for (int c = 2; c <= n - 1; c++) {
            if (pos[c] - pos[c - 1] > pos[c + 1] - pos[c]) {
                to[c] = c + 1;
                fromCount[c + 1]++;
            } else {
                to[c] = c - 1;
                fromCount[c - 1]++;
            }
        }
        int answer = 0;
        for (int c = 1; c <= n; c++) {
            if (fromCount[c] == 0) {
                answer++;
            } else if (fromCount[c] == 1 && to[to[c]] == c && fromCount[to[c]] == 1) {
                answer++;
                c++;
            }
        }
        out.println(answer);
        out.close();
    }
}