/*
ID: liulawr1
LANG: JAVA
TASK: cowroute
 */

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class cowroute {
    public static void main(String[] args) throws IOException {
        Scanner scan = new Scanner(new FileReader("cowroute.in"));
        PrintWriter out = new PrintWriter(new FileWriter("cowroute.out"));
        int a = scan.nextInt();
        int b = scan.nextInt();
        int numOfRoutes = scan.nextInt();
        int minCost = Integer.MAX_VALUE;
        for (int i = 0; i < numOfRoutes; i++) {
            int cost = scan.nextInt();
            int numOfCities = scan.nextInt();
            int[] citiesOnThisRoute = new int[numOfCities];
            boolean alreadySeenA = false;
            for (int j = 0; j < numOfCities; j++) {
                int aCity = scan.nextInt();
                if (aCity == a) {
                    alreadySeenA = true;
                } else if (aCity == b) {
                    if (alreadySeenA) {
                        minCost = Math.min(minCost, cost);
                    }
                }
            }
        }
        if (minCost == Integer.MAX_VALUE) {
            minCost = -1;
        }
        out.println(minCost);
        out.close();
    }
}