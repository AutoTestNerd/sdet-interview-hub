package com.sdet.InterviewPrograms.StringProgams;

public class shiftCharacters {


    public  static  String shiftCharacters(String input){
        StringBuilder result = new StringBuilder();

        for (int i = 0; i < input.length(); i++) {

            char ch = input.charAt(i);
            result.append(ch);
            System.out.println(ch);
            if(i+1<input.length() && Character.isDigit(input.charAt(i+1))){
                int shift = Character.getNumericValue(input.charAt(i+1));
                System.out.println("value ::  "+shift);
                char shiftedChar = (char) (ch+shift);
                System.out.println("shiftedChar ::  "+shiftedChar);
                result.append(shiftedChar);
                i++;


            }

        }

        return result.toString();
    }

    public static void main(String[] args) {
        String input = "A1C2F3";
        String output = shiftCharacters(input);
        System.out.println("Output: " + output);
    }
}
