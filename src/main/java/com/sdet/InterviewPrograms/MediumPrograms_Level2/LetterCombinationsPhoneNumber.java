package com.sdet.InterviewPrograms.MediumPrograms_Level2;
//YouTube - https://www.youtube.com/watch?v=nBe_Ych7XUY&t=668s
import java.util.ArrayList;
import java.util.List;
//Youtube - https://www.youtube.com/watch?v=nBe_Ych7XUY&t=697s
public class LetterCombinationsPhoneNumber {

    public static List<String> letterCombination(String digits){
        if(digits.length()==0){
            return new ArrayList<>();
        }



        return getCombinationLetter(digits,0);
    }

    static String[] codes= {"","","abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};
    public static List<String>  getCombinationLetter(String digit, int idx){
        if (idx==digit.length()){
            ArrayList<String> resbase = new ArrayList<>();
            resbase.add("");
            return resbase;
        }
        List<String> myResults = new ArrayList<>();
        List<String> recResults = getCombinationLetter(digit,idx+1);
        char ch = digit.charAt(idx);
        String chCode=  codes[ch-'0'];
        System.out.println("CHcode-- " +chCode);
        for (String recString:recResults){

            for (int i = 0; i <chCode.length() ; i++) {
                   char code = chCode.charAt(i);
                   myResults.add(code+recString);
                System.out.println("Manish-- " +myResults);


            }
        }
        return myResults;

    }
    public static void main(String[] args) {
        String digit = "2334";
        List<String> result =letterCombination(digit);
        System.out.println("Letter Combinations for " + digit + ":");
        for (String s : result) {
            System.out.println(s);
        }
    }
}
