package com.sdet.InterviewPrograms.MediumPrograms_Level2;

public class Buy_Sell_Stock1_30 {

    public static int maxProfit(int[] prices){

        int lsf= Integer.MAX_VALUE;
        int pist =0;
        int op=0;
        for (int i = 0; i < prices.length; i++) {

            if(prices[i]<lsf){
                lsf=prices[i];
            }

            pist = prices[i]-lsf;
            if(pist>op){
                op =pist;
            }

        }
return op;
    }
    public static void main(String[] args) {
        int[] prices = {7, 1, 5, 3, 6, 4};
        System.out.println("Max Profit: " + maxProfit(prices));
    }
}
