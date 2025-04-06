package com.sdet.InterviewPrograms.StringProgams;

public class ReverseStringWithoutSpecialChar_5 {

    public static void main(String[] args) {
        String str = "M@d$AL&";
        int left =0;
        int right = str.length()-1;
        char[] ch = str.toCharArray();
        while (left<right){

            if(!Character.isAlphabetic(ch[left])){
                left++;
            } else if (!Character.isAlphabetic(ch[right])) {
                right--;
            }
            else {
                char temp = ch[left];
                ch[left] = ch[right];
                ch[right]=temp;
                left++;
                right--;
            }
        }

        String op=  new String(ch);
        System.out.println(op);
    }
}
