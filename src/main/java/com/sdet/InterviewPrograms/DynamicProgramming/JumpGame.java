package com.sdet.InterviewPrograms.DynamicProgramming;

public class JumpGame {
    public static boolean canJump(int[] a){

        int reach=0;
        for (int i = 0; i <=reach ; i++) {
            reach = Math.max(reach,i+a[i]);
            System.out.println("reach   "+reach);
            if (reach>=a.length-1){
                return true;
            }
        }
        return false;

    }
    public static void main(String[] args) {
        int[] a = {2,2,1,1,4};
        System.out.println(canJump(a));;
    }
}
