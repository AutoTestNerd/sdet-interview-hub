package com.sdet.InterviewPrograms.MediumPrograms_Level1;

import java.util.HashMap;
import java.util.Map;

public class A1B2C3Pattern_10 {
    public static void main(String[] args) {
        String str ="ABCCBDCAAA";
        Map<Character,Integer> map = new HashMap<>();
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            map.put(ch,map.getOrDefault(ch,0)+1);





        }

//        map.forEach((key,value)-> System.out.print(key+""+value));


        for (Map.Entry<Character,Integer> entry : map.entrySet()){

            if(entry.getValue()>=1){
                System.out.print(entry.getKey()+"" +entry.getValue());

            }
        }
    }
}
