package com.sdet.InterviewPrograms.MediumPrograms_Level2;

import java.util.HashMap;
import java.util.Map;

public class SubArray_sum_EqualsToK {

    public static void SumEqualstoKFun(int[] arr ,int k){

        int sum=0;
        int ans=0;

        Map<Integer,Integer> map = new HashMap<>();
        map.put(0,1);
        for (int i = 0; i <arr.length ; i++) {
            sum = sum+arr[i];
            int rem = sum-k;
            if(!map.containsKey(rem)){
                map.put(sum,1);
            }
            else {
                map.put(sum,map.get(rem)+1);
                ans+= map.get(rem);
            }
        }
        System.out.println("Answwer " +ans);
    }


    public static void main(String[] args) {
        int[] a = {3, 9, -2, 4, 1, -7, 2, 6, -5, 8, -3, -7, 6, 2, 1};
        int k=10;
        SumEqualstoKFun(a,k);
    }
}
