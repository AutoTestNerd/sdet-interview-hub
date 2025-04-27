package com.sdet.InterviewPrograms.StringProgams;

public class RemoveOccurence_9 {

    public  static  String removeOccurence(String str ,String part){
        int n = str.length();
        int m= part.length();
        StringBuilder sb = new StringBuilder();
        for (char ch :str.toCharArray())
        {
            sb.append(ch);
            if(sb.length()>=m){
                System.out.println("Length " +sb.length());

                String sub= sb.substring(sb.length()-m);
                System.out.println(sub);

                if(sub.equals(part)){
                    sb.setLength(sb.length()-m);
                    System.out.println("SB=== " +sb.toString());
                }
            }
        }
        return sb.toString();
    }
    public static void main(String[] args) {
        String str = "daabcbaabcbc";
        String part= "abc";
        // op - dab
        String result = removeOccurence(str,part);
        System.out.println("Final String -- " +result);

    }
}
