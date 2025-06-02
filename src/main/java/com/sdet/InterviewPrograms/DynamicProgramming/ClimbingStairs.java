package com.sdet.InterviewPrograms.DynamicProgramming;
//youtube- https://www.youtube.com/watch?v=A6mOASLl2Dg&t=293s
public class ClimbingStairs {
    public static void main(String[] args) {
        int n=4;
        int[] dp = new int[n+1];
        dp[0]=1;
        for (int i = 1; i <=n ; i++) {
            if(i==1){
                dp[i]=dp[i-1];
            }
            else {
                dp[i] = dp[i - 1] + dp[i - 2];
            }

        }
System.out.print(dp[n]);
    }
}
