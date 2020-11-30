import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;

public class crosswords {
    public static void main(String[] args) throws IOException {
        Scanner scan = new Scanner(new FileReader("crosswords.in"));
        PrintWriter out = new PrintWriter(new FileWriter("crosswords.out"));
        int n = scan.nextInt();
        int m = scan.nextInt();
        char [][] puzzle = new char[n][m];
        for (int i = 0; i < n; i++) {
            String line = scan.next();
            for (int j = 0; j < m; j++) {
                puzzle[i][j] = line.charAt(j);
            }
        }
        ArrayList<Integer> clue_r = new ArrayList<>();
        ArrayList<Integer> clue_c = new ArrayList<>();
        for (int r = 0; r < n; r++) {
            for (int c = 0; c < m; c++) {
                char ch = puzzle[r][c];
                if (ch == '.' && (c == 0 || puzzle[r][c - 1] == '#') && (c < m - 2 && puzzle[r][c + 1] == '.' && puzzle[r][c + 2] == '.')) {
                    clue_r.add(r + 1);
                    clue_c.add(c + 1);
                } else {
                    if (ch == '.' && (r == 0 || puzzle[r - 1][c] == '#') && (r < n - 2 && puzzle[r + 1][c] == '.' && puzzle[r + 2][c] == '.')) {
                        clue_r.add(r + 1);
                        clue_c.add(c + 1);
                    }
                }
            }
        }
        out.println(clue_r.size());
        for (int i = 0; i < clue_r.size(); i++) {
            out.println(clue_r.get(i) + " " + clue_c.get(i));
        }
        out.close();
    }
}