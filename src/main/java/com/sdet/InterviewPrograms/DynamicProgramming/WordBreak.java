package com.sdet.InterviewPrograms.DynamicProgramming;

import java.util.*;
//YouTube- https://www.youtube.com/watch?v=2NaaM_z_Jig&t=1819s

public class WordBreak {
    public  static boolean WordBreakProblem(String s , List<String> list){

        Set<String> set = new HashSet<>(list);
        int[] dp = new int[s.length()];
        for (int i = 0; i < dp.length; i++) {
            for (int j = 0; j <=i ; j++) {
                 String w2check = s.substring(j,i+1);
                 System.out.println(w2check);
                 if(set.contains(w2check)){
                     if(j>0){
                         dp[i] += dp[j-1];
                     }
                     else {
                         dp[i] +=1;
                     }
                 }
            }
        }
        System.out.println(dp[s.length()-1]);
        return dp[s.length()-1]>0;
    }
    public static void main(String[] args) {
        String s = "leetcode";
        List<String> list = Arrays.asList("leet" ,"code");
        WordBreakProblem(s,list);
    }
}
