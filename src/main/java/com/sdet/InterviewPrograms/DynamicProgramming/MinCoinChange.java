package com.sdet.InterviewPrograms.DynamicProgramming;
//youtube- https://www.youtube.com/watch?v=NNcN5X1wsaw
public class MinCoinChange {
    public static void main(String[] args) {
        int[] coins = {1,5,6,9};
        int amt =11;
        int[] minCoinChange= new int[amt+1];

        for (int i = 1; i <=amt ; i++) {
            minCoinChange[i] = Integer.MAX_VALUE;

            for (int coin:coins){
                if(coin<=i) {
                    minCoinChange[i] = Math.min(minCoinChange[i], 1 + minCoinChange[i - coin]);
                }
            }
        }
        System.out.println(minCoinChange[amt]);
    }
}
