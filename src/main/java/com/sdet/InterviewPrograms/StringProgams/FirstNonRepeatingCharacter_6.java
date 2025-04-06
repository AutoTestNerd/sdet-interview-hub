package com.sdet.InterviewPrograms.StringProgams;

import java.util.LinkedHashMap;
import java.util.Map;

public class FirstNonRepeatingCharacter_6 {
    public static Character findFirstNonRepeated(String str){
        //user LinkedHashMap yo maintain the insertion order
        Map<Character,Integer> map = new LinkedHashMap<>();
        for (int i = 0; i <str.length()-1 ; i++) {
            char ch = str.charAt(i);
            map.put(ch,map.getOrDefault(ch,0)+1);

        }

        for (Map.Entry<Character,Integer> entry :map.entrySet()){
            if(entry.getValue()==1){
                return entry.getKey();
            }
        }
        return null;
    }

    public static void main(String[] args) {
        String str = "oskwissr";
        Character result = findFirstNonRepeated(str);
        if(result!=null){
            System.out.println("First non-repeated character: " + result);
        } else {
            System.out.println("No non-repeated character found.");
        }


    }
}
