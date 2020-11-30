import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class mixmilk {
    public static void main(String[] args) throws IOException {
        Scanner scan = new Scanner(new FileReader("mixmilk.in"));
        PrintWriter out = new PrintWriter(new FileWriter("mixmilk.out"));
        int[] capacity = new int[3];
        int[] milk = new int[3];
        for (int i = 0; i < 3; i++) {
            capacity[i] = scan.nextInt();
            milk[i] = scan.nextInt();
        }
        for (int i = 0; i < 100; i++) {
            int from = i % 3;
            int to = (from + 1) % 3;
            int pourAmount = Math.min(capacity[to] - milk[to], milk[from]);
            milk[from] -= pourAmount;
            milk[to] += pourAmount;
        }
        for (int i = 0; i < 3; i++) {
            out.println(milk[i]);
        }
        out.close();
    }
}