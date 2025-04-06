package com.sdet.InterviewPrograms;

public class LongestRepeatingSequence_24 {

    public static int lcs(String str){

        int len = str.length();
        int[][] dp = new int[len+1][len+1];
        for (int i = dp.length-1; i >=0; i--) {
            for (int j = dp[0].length-1; j >=0 ; j--) {

                if(i== dp.length-1  && j== dp[0].length-1){
                    dp[i][j]=0;
                } else if (i==dp.length-1) {
                    dp[i][j]=0;

                } else if (j==dp[0].length-1) {
                    dp[i][j]=0;
                }
                else{
                    if(str.charAt(i)==str.charAt(j) && i!=j){
                        dp[i][j] = dp[i+1][j+1]+1;
                    }
                    else {
                        dp[i][j] = Math.max(dp[i+1][j],dp[i][j+1]);
                    }
                }
            }
        }

        return dp[0][0];
    }
    public static void main(String[] args) {
        String str ="abacbc";

        int res = lcs(str);
        System.out.println("Longest Repeating Subsequence: " + res);
    }
}
