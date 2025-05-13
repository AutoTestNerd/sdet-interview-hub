package com.sdet.InterviewPrograms.StringProgams;

public class CharacterReplacer {
    public static void main(String[] args) {
        String str = "BANANA";
        StringBuilder  result = new StringBuilder();
        for (int i = 0; i <str.length() ; i++) {

            char ch = str.charAt(i);
            if(ch=='A'){
                result.append('C');
            }
            else {
                result.append(ch);
            }

        }

            System.out.println("Character Replace --  " + result.toString());
    }
}
