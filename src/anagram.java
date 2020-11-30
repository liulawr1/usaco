import java.io.*;
import java.util.Arrays;

public class anagram {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new FileReader("anagram.in"));
        PrintWriter out = new PrintWriter(new FileWriter("anagram.out"));
        String a = reader.readLine();
        String b = reader.readLine();
        out.println(isAnagram(a, b));
        out.close();
    }
    public static boolean isAnagram(String a, String b) {
        if (a.length() != b.length()) {
            return false;
        }
        char[] charArrayA = a.toCharArray();
        char[] charArrayB = b.toCharArray();
        Arrays.sort(charArrayA);
        Arrays.sort(charArrayB);
        for (int i = 0; i < a.length(); i++) {
            if (charArrayA[i] != charArrayB[i]) {
                return false;
            }
        }
        return true;
    }
}