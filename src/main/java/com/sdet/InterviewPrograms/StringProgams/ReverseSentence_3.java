package com.sdet.InterviewPrograms.StringProgams;

public class ReverseSentence_3 {
    public static void main(String[] args) {
        String str = "I LOVE PROGRAMMING";
        String reversedString = "";

        String[] words = str.split(" ");
        for (int i = words.length-1; i >=0 ; i--) {
            reversedString += words[i] + " ";
        }
        System.out.println("Reversed Senetnce -- " +reversedString );
    }
}
