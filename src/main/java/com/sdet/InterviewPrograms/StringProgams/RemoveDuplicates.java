package com.sdet.InterviewPrograms.StringProgams;

import java.util.HashSet;
import java.util.Set;

public class RemoveDuplicates {
    public static void main(String[] args) {
        String str = "my Name is Vikash";
        StringBuilder result= new StringBuilder();
        Set<Character> st = new HashSet<>();
        for (int i = 0; i < str.length(); i++) {

            char ch = str.charAt(i);
            if(!st.contains(ch)){
                st.add(ch);
                result.append(ch);
            }
        }

        System.out.println(result.toString());
    }
}
