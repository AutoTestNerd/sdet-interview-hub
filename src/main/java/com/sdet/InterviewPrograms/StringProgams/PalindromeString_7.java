package com.sdet.InterviewPrograms.StringProgams;

public class PalindromeString_7 {
    public static void main(String[] args) {
        String str = "MADAM";
        int low=0;
        int high = str.length()-1;
        boolean isPalindrome =true;
        char[] ch = str.toCharArray();
        while(low<=high){
            if((ch[low]!=ch[high])){
                isPalindrome =false;
                break;
            }
           else {
               low++;
               high--;
            }
        }

        if (isPalindrome) {
            System.out.println("String is a palindrome");
        } else {
            System.out.println("Not a palindrome");
        }
    }
}
