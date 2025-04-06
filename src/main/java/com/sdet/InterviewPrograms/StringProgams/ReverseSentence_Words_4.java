package com.sdet.InterviewPrograms.StringProgams;

public class ReverseSentence_Words_4 {

    public static void main(String[] args) {
        String str = "Java is Awesome";

        String reverseSentence ="";

        String[] words = str.split(" ");
        for (String word :words){
            int j = word.length()-1;
            String reverseWord ="";

            for (int i = j; i >=0 ; i--) {
                  char ch = word.charAt(i);
                reverseWord =  reverseWord+ch;

            }
            System.out.println("Reversed words ----   " +reverseWord );


            reverseSentence =  reverseWord + " "+reverseSentence;



        }

        System.out.println("Reversed Sentence and words ----   " +reverseSentence );
    }
}
