package com.sdet.InterviewPrograms.MediumPrograms_Level2;

import java.util.HashMap;
import java.util.Map;

public class LongestSubStringWithoutRepeatingCharcter_25 {


    public static String longestSubstring(String str){
        Map<Character ,Integer> map = new HashMap<>();

        int i=-1;
        int j=-1;
        int ans=0;
        int start =0;
        int len=0;

        while(true){
            boolean f1 = false;
            boolean f2 =false;

        //accquire
        while(i<str.length()-1){
            i++;
            f1=false;
            char ch = str.charAt(i);
            map.put(ch,map.getOrDefault(ch,0)+1);
            if(map.get(ch)==2){
                break;
            }
            else {
                len = i-j;
                if(ans<len){
                    ans=len;
                    start=j+1;
                }
            }
        }

        //release
        while(j<i){
            j++;
            f2=true;
            char ch =str.charAt(j);
            map.put(ch,map.get(ch)-1);
            if(map.get(ch)==1){
                break;
            }
        }

            if (f1==false && f2== false){
                break;
            }

        }

        return str.substring(start,start+ans);
    }
    public static void main(String[] args) {
        String str= "abbacbcdbadbdbbdcb";

        String result = longestSubstring(str);
        System.out.println("Result   " +result + "   Length -- >   " +result.length());
    }
}
