package com.sdet.InterviewPrograms.MediumPrograms_Level1;

import java.util.HashMap;
import java.util.Map;

public class IsAngram_23 {

    public static boolean isAnagram(String str1,String str2){
        if(str1.length()!=str2.length()){
              return  false;
        }

        Map<Character ,Integer> map = new HashMap<>();
        for (int i = 0; i <str1.length() ; i++) {
            char ch = str1.charAt(i);
            map.put(ch,map.getOrDefault(ch,0)+1);
        }
        for(char ch : str2.toCharArray()){
            if(!map.containsKey(ch)){
                return false;
            }
            else{
                map.put(ch,map.get(ch)-1);
                if(map.get(ch)<0){
                    return false;
                }
            }
        }
        return true;
    }
    public static void main(String[] args) {
        String str1= "silent";
        String str2 ="listen";
        boolean istru = isAnagram(str1,str2);
        if(istru){
            System.out.println("Strings are anagram");
        }
        else {
            System.out.println("Strings are not anagram");

        }


    }
}
