package com.sdet.InterviewPrograms;

public class PrintAllPalindrome_22 {

public static boolean isPalindrome(String str){

int i=0;
int j= str.length()-1;
while(i<j){
if(str.charAt(i)!=str.charAt(j)){
    return false;
}
else {
    i++;
    j--;
}
}
return true;
}


    public static void main(String[] args) {
        String str = "abccbc";

        for (int i = 0; i < str.length(); i++) {
            for (int j = i+1; j < str.length(); j++) {

                String substring = str.substring(i,j);
//                System.out.println(substring);
                if(isPalindrome(substring)){
                    System.out.println("Palindrome - " +substring);

                }
            }
        }
    }
    ;

}
