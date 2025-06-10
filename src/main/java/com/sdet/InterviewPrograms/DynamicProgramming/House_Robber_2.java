package com.sdet.InterviewPrograms.DynamicProgramming;
//YouTube - https://www.youtube.com/watch?v=ucmqYGVGQK8

public class House_Robber_2 {
    public static  int robber(int[] House){

        int incl = House[0];
        int excl =0;
        for (int i = 1; i <House.length ; i++) {
            int nIncl = excl+House[i];
            int nExcl = Math.max(incl,excl);
                    incl=nIncl;
            excl=nExcl;
        }

        return Math.max(incl,excl);
    }
    public static void main(String[] args) {
        int[] house = {2,7,3,1,4,2,1,8};

        int[] skipLastHouse = new int[house.length-1];
        int[] skipFirstHouse = new int[house.length-1];

        for (int i = 0; i <house.length-1 ; i++) {
            skipLastHouse[i] = house[i];
            skipFirstHouse[i] =house[i+1];
        }
        int lootSkippingLast= robber(skipLastHouse);
        int lootSkippingFirst= robber( skipFirstHouse);

        System.out.println("Max Loot-- " + Math.max(lootSkippingLast,lootSkippingFirst));


    }
}
