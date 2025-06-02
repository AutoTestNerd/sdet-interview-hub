package com.sdet.InterviewPrograms.MediumPrograms_Level1;

public class ClimbingStairs {
    public static int countWays(int n) {
        if (n == 0 || n == 1) return 1;

        int[] dp = new int[n + 1];
        dp[0] = 1;
        dp[1] = 1;

        for (int i = 2; i <= n; i++) {
            dp[i] = dp[i - 1] + dp[i - 2];
        }

        // Print the array for visualization
        System.out.print("DP Array: ");
        for (int i = 0; i <= n; i++) {
            System.out.print("Step " + i + ": " + dp[i] + "  ");
        }
        System.out.println();

        return dp[n];
    }

    public static void printAllWays(int n, String path) {
        if (n == 0) {
            System.out.println(path);
            return;
        }
        if (n >= 1) {
            printAllWays(n - 1, path + "1 ");
        }
        if (n >= 2) {
            printAllWays(n - 2, path + "2 ");
        }
    }

    public static void main(String[] args) {
        int n = 5;
        System.out.println("Ways to climb " + n + " stairs: " + countWays(n)); // Output: 8
        System.out.println("All possible ways:");
        printAllWays(n, "");
    }


}
