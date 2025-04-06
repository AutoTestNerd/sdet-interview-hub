package com.sdet.InterviewPrograms;

public class MaximumSum_In_Subarray_20 {
    public static void main(String[] args) {
        int [] a = {-2,-4,1,3,1,4,5,6};
        int MaxSum =0;
        int Cusum =0;
        for (int i = 0; i <a.length ; i++) {
            Cusum =Cusum+a[i];

            if (MaxSum <Cusum){
                MaxSum= Cusum;
            }

            if (Cusum< 0){
                Cusum=0;
            }
        }

        System.out.println("MAx SUm == "  + MaxSum);

    }
}
