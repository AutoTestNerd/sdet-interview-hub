package com.sdet.InterviewPrograms;

public class RomanToInteger_14 {

    //MCDLXVI
    public static  int romanToInteger(String str){
        int num=0;
        int i=0;
        int j = str.length()-1;
        while (i<=j){

            if(str.charAt(i)=='M'){
                num+=1000;
            } else if (str.charAt(i)=='D') {
                num+=500;
            }
            else if (str.charAt(i)=='C' && str.charAt(i+1)=='M') {
                num-=100;
            }
            else if (str.charAt(i)=='C'&& str.charAt(i+1)=='C') {
                num-=100;
            }
            else if (str.charAt(i)=='C') {
                num+=100;
            }
            else if (str.charAt(i)=='L') {
                num+=50;
            }
            else if (str.charAt(i)=='X'&& str.charAt(i+1)=='C') {
                num-=10;
            }
            else if (str.charAt(i)=='X' && str.charAt(i+1)=='L') {
                num-=10;
            }
            else if (str.charAt(i)=='X') {
                num+=10;
            }
            else if (str.charAt(i)=='V') {
                num+=5;
            }
            else if (str.charAt(i)=='I'&& str.charAt(i+1)=='X') {
                num-=1;
            }
            else if (str.charAt(i)=='I' && str.charAt(i+1)=='V') {
                num-=1;
            }
            else if (str.charAt(i)=='I') {
                num+=1;
            }

            i++;


        }

        return num;
    }
    public static void main(String[] args) {
        String s = "MCMIV";

        int num=  romanToInteger(s);
        System.out.println("Roman to INteger --  " +num);
    }
}
