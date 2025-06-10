package com.sdet.InterviewPrograms.DynamicProgramming;

public class BulbSwitcher_II {
    public static void main(String[] args) {
        int numBulb=10;
        int numPress=3;
        boolean[] bulbs = new boolean[numBulb]; // intitally false

        for (int press = 1; press <=numPress ;press++) {
            for (int i = 0; i <numBulb ; i++) {
                if((i+1)%press==0){
                    bulbs[i]=!bulbs[i];
                    System.out.println(" "+ i + "--->>" +bulbs[i]);
                }

            }

        }
        int count=0;
        for (int i = 0; i <numBulb ; i++) {
          if (bulbs[i]){
              count++;
              System.out.print((i+1) +" ");
          }
        }
        System.out.print("No of bullbs to be ON-  " +count);


    }
}
