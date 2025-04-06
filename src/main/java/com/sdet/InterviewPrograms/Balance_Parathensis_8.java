package com.sdet.InterviewPrograms;

import java.util.Stack;

public class Balance_Parathensis_8 {

    public static  boolean isbalnced(String str){

        Stack<Character> st = new Stack<>();
        int low=0;
        int high= str.length();

        for (int i = 0; i < high ; i++) {
            char ch= str.charAt(i);
            if(isOpening(ch)){
              st.push(ch);
            }
            else {

                if(str.isEmpty()){
                    return  false;
                } else if (ifMatchingPattern(st.peek(),ch)) {
                    st.pop();

                }
                else {
                    return false;
                }
            }

        }


        return st.isEmpty();

    }

    public static boolean isOpening(char ch){
        return ch== '{' || ch =='(' || ch=='[';
    }

    public static boolean ifMatchingPattern(char ch1 ,char ch2){
        return (ch1== '{' && ch2=='}') ||(ch1== '(' && ch2==')') || (ch1== '[' && ch2==']');
    }
    public static void main(String[] args) {
        String str = "(({}))[]";
        boolean istru =  isbalnced(str);
        if(istru){
            System.out.println("Balanced");
        }
        else {
            System.out.println("NOt Balanced");
        }
    }
}
