package com.sdet.InterviewPrograms.StringProgams;

public class occurrencesIncludingOverlapping {
    public static void main(String[] args) {
        String str = "manish is manishkumar of manishmanish";
        String target = "manish";

         System.out.println("Str -- >>  " +str.length());
        System.out.println("target -- >>  " +target.length());
        int count = 0;
        for (int i = 0; i <= str.length() - target.length(); i++) {
            System.out.println("subString-- >>  " + str.substring(i, i + target.length()));
            if (str.substring(i, i + target.length()).equals(target)) {
                count++;
            }
        }

        System.out.println("Occurrences of '" + target + "': " + count);
    }
}
