package com.sdet.InterviewPrograms.MediumPrograms_Level2;
//youtube- https://www.youtube.com/watch?v=RiNzHfoA2Lo
public class LongestPalindromeSequence {

    public static void lps(String str) {
        int n = str.length();
        int[][] dp = new int[n][n];

        // Fill the table
        for (int g = 0; g < n; g++) {
            for (int i = 0, j = g; j < n; i++, j++) {
                if (g == 0) {
                    dp[i][j] = 1;
                } else if (str.charAt(i)==str.charAt(j))
                {
                    if(g==1){
                        dp[i][j]=2;
                    }
                    else {
                        dp[i][j] = 2+ dp[i+1][j-1];
                    }

                }
                else {
                    dp[i][j] = Math.max(dp[i][j-1],dp[i+1][j]);
                }
//                else if (str.charAt(i) == str.charAt(j)) {
//                    dp[i][j] = (g == 1) ? 2 : 2 + dp[i + 1][j - 1];
//                } else {
//                    dp[i][j] = Math.max(dp[i + 1][j], dp[i][j - 1]);
//                }
            }
        }

        int i = 0, j = n - 1;
        StringBuilder left = new StringBuilder();
        StringBuilder right = new StringBuilder();

        while (i <= j) {
            if (str.charAt(i) == str.charAt(j)) {
                if (i == j) {
                    left.append(str.charAt(i)); // Middle character (only once)
                } else {
                    left.append(str.charAt(i));
                    right.insert(0, str.charAt(j)); // Prepend
                }
                i++;
                j--;
            } else if (dp[i + 1][j] > dp[i][j - 1]) {
                i++;
            } else {
                j--;
            }
        }

        String result = left.toString() + right.toString();
        System.out.println("Longest Palindromic Subsequence: " + result);
        System.out.println("Length: " + dp[0][n - 1]);      }

    public static void main(String[] args) {
        String str = "bbabcbcab";
        lps(str);
    }
}
