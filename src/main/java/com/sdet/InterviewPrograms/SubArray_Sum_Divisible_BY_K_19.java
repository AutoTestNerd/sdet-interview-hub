package com.sdet.InterviewPrograms;

import java.util.HashMap;
import java.util.Map;

public class SubArray_Sum_Divisible_BY_K_19 {
    public static void main(String[] args) {
        int[] arr = {2,3,5,4,5,3,4};
        int k = 7;
        int sum =0;
        int rem=0;
        int ans=0;

        Map<Integer,Integer> map = new HashMap<>();
        map.put(0,1);
        for (int i = 0; i <arr.length ; i++) {
            sum = sum+arr[i];
            rem = sum % k;
            if(rem<0){
                rem =rem+k;
            }
            if(!map.containsKey(rem)){
                map.put(rem,1);
            }
            else {
                ans = ans + map.get(rem);
                map.put(rem,map.get(rem)+1);
            }

        }
        System.out.println("Total Subarray " + ans );

    }
}
