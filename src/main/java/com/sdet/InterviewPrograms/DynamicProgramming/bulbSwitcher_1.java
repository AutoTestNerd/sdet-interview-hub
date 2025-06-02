package com.sdet.InterviewPrograms.DynamicProgramming;

public class bulbSwitcher_1 {
    public static void main(String[] args) {
        int n=100;
        System.out.println("Bulbs that will be ON:");
        for (int i = 1; i*i <= n; i++) {
            System.out.print(i*i+ " " );

        }
        System.out.println("No of bulbs to be on->  " + (int) Math.sqrt(n));
    }
}
