package com.sdet.InterviewPrograms.DynamicProgramming;
//youtube = https://www.youtube.com/watch?v=VT4bZV24QNo

public class HouseRobber_1 {
    public static void main(String[] args) {
         int[] nums = {1,2,3,1};
         int incl =nums[0];
         int excl =0;
        for (int i = 1; i <nums.length ; i++) {
           int nincl = excl+nums[i];
           int nexcl= Math.max(incl,excl);
           incl=nincl;
           excl=nexcl;

        }
        int ans = Math.max(incl,excl);
System.out.println(ans);    }
}
