package com.sdet.InterviewPrograms.MediumPrograms_Level1;

public class SecondHighestElement_15 {

    public static void main(String[] args) {
        int[] arr = {12, 35, 1, 10, 34, 1};
        
        int first= Integer.MIN_VALUE;
        int second = Integer.MIN_VALUE;
        int firstMin = Integer.MAX_VALUE;
        int secondMin = Integer.MAX_VALUE;
        
        for (int num :arr){

            if(num>first){;
                second =first;
                first=num;
            } else if (num>second && first!=num) {
                second =num;

            }
        }


        for (int num1 :arr){

            if(num1<firstMin){;
                secondMin =firstMin;
                firstMin=num1;
            } else if (num1<secondMin && num1!=firstMin) {
                secondMin =num1;

            }
        }
        if (secondMin == Integer.MAX_VALUE) {
            System.out.println("No second lowest element found.");
        } else {
            System.out.println("Second Lowest element is: " + secondMin);
        }


        if (second == Integer.MIN_VALUE) {
            System.out.println("No second highest element found.");
        } else {
            System.out.println("Second Highest element is: " + second);
        }
      }
}
