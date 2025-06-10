package com.sdet.InterviewPrograms.DynamicProgramming;
//yotube- https://www.youtube.com/watch?v=bUSaenttI24&t=1s
public class knapsackProlem {
    public static void main(String[] args) {
        int[] wt ={2,5,1,3,4};
        int[] vals ={15,14,10,45,30};
        int cap=7;

        int[][] dp = new int[wt.length+1][cap+1];
        for (int i = 1; i <dp.length ; i++) {

            for (int j = 1; j <dp[0].length ; j++) {
                if(j>=wt[i-1]){
                    int rcap = j-wt[i-1];
                    if(dp[i-1][rcap]+vals[i-1]>dp[i-1][j]){
                        dp[i][j] =dp[i-1][rcap]+vals[i-1];
                    }
                    else {
                        dp[i][j] = dp[i-1][j];
                    }
                }
                else {
                    dp[i][j] = dp[i-1][j];;
                }

            }
        }

        System.out.println(dp[wt.length][cap]);
    }
}
