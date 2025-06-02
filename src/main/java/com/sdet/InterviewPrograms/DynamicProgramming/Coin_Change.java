    package com.sdet.InterviewPrograms.DynamicProgramming;

    public class Coin_Change {

        public static int CoinChange(int[] coin , int amt){

            int[] dp = new int[amt+1];
            dp[0]=1;
            for (int i = 0; i <coin.length ; i++) {
                for (int j = coin[i]; j <dp.length ; j++) {
                    dp[j]+=dp[j-coin[i]];
                }

            }
            return dp[amt];
        }
        public static void main(String[] args) {
            int[] coin = {1,2,5};
            int amt = 11;
          int res =  CoinChange(coin,amt);
          System.out.println(res);
        }
    }
