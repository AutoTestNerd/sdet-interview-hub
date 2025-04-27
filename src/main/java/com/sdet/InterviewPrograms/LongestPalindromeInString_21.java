package com.sdet.InterviewPrograms;

import java.util.HashSet;

public class LongestPalindromeInString_21 {
    public static void main(String[] args) {
        String str= "abcdccd";
        int n = str.length();
        int res=0;
        int start=0;
        HashSet<String> Unique = new HashSet<>();
        boolean[][] dp = new boolean[n][n];
        for (int g = 0; g <n ; g++) {
            for (int j =g ,i=0; j <n ; j++,i++) {


                if(g==0){
                    dp[i][j]= true;
                } else if (g==1) {

                    if(str.charAt(i)==str.charAt(j)){
                        dp[i][j]= true;
                    }
                    else {
                        dp[i][j]= false;
                    }
                }
                else{
                    if(str.charAt(i)==str.charAt(j) && dp[i+1][j-1]==true){
                        dp[i][j]=true;
                    }
                    else {
                        dp[i][j] =false;
                    }
                }

                if(dp[i][j]==true){

                    res =g+1;
                    start =i;
                }
                if (dp[i][j]){
                    Unique.add(str.substring(i,j+1));
                }
            }


        }
        System.out.println("Unique Palindromic Substrings:");
        for (String palindrome : Unique){
            System.out.println(palindrome);

        }

        System.out.println("Longest Palindrom substtring  ---   "+ str.substring(start,start+res) + "   and  length is  " +res);

    }
}
