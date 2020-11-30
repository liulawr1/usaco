import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class blist {
    public static void main(String[] args) throws IOException {
        Scanner scan = new Scanner(new FileReader("blist.in"));
        PrintWriter out = new PrintWriter(new FileWriter("blist.out"));
        int n = scan.nextInt();
        int[] bucketNeedChange = new int[1001];
        for (int i = 0; i < n; i++) {
            int start = scan.nextInt();
            int end = scan.nextInt();
            int bucket = scan.nextInt();
            bucketNeedChange[start] += bucket;
            bucketNeedChange[end] -= bucket;
        }
        int currInUse = 0, maxInUse = 0;
        for (int i = 0; i <= 1000; i++) {
            currInUse += bucketNeedChange[i];
            maxInUse = Math.max(maxInUse, currInUse);
        }
        out.println(maxInUse);
        out.close();
    }
}