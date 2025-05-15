package com.sdet.InterviewPrograms.MediumPrograms_Level1;

public class RainTippingWater_26 {

    public static  int RainWaterFun(int[] a){
        int[] left = new int[a.length];
        int[] right = new int[a.length];
            int len =a.length;
            int ans=0;
            left[0]=a[0];
            right[len-1] =a[len-1];
        for (int i = 1; i <len ; i++) {
            left[i]   = Math.max(left[i-1] ,a[i]);

        }
        for (int j = len-2; j >=0 ; j--) {
            right[j]   = Math.max(right[j+1] ,a[j]);

        }

        for (int i = 0; i <len ; i++) {
            ans +=  Math.min(left[i],right[i])-a[i];
        }

        return ans;


    }
    public static void main(String[] args) {


        int[] a= {3,1,2,4,0,1,3,2};
        int answer =  RainWaterFun(a);
        System.out.println("resut--- ?   " +answer);

    }
}
