package com.sdet.InterviewPrograms;

public class IsPrime_12 {
    public static void main(String[] args) {
        int n = 17;
        int count =0;
        for (int div = 2; div*div < n ; div++) {
            if(n%div==0){
            count= count+1;
            break;
            }

        }
        if(count==1){
            System.out.println("Number " +n + "is not prime number");
        }
        else {
            System.out.println("Number " +n + "is  prime number");

        }
    }
}
