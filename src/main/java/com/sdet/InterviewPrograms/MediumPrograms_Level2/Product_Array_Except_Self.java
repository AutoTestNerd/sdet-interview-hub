package com.sdet.InterviewPrograms.MediumPrograms_Level2;

public class Product_Array_Except_Self {

    public static int[] ProductArray(int[] a){
        int[] suffix = new int[a.length];
        int[] prefix = new int[a.length];

        prefix[0]=1;
        for (int i = 1; i <a.length ; i++) {
            prefix[i]=a[i-1]*prefix[i-1];
        }
        suffix[suffix.length-1]=1;
        for (int i = a.length-2; i >=0 ; i--) {
            suffix[i]=a[i+1]*suffix[i+1];
        }

        int[] ans = new int[a.length];
        for (int i = 0; i <a.length ; i++) {
            ans[i]= prefix[i]*suffix[i];
        }

        return ans;
    }
    public static void main(String[] args) {

        int[] a= {1,2,3,4};
        //o/p = {24,12,8,6}
       int[] and = ProductArray(a);
       for (int an:and){
           System.out.println(an +" " );
       }


    }
}
