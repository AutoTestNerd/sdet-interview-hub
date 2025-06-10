package com.sdet.InterviewPrograms.MediumPrograms_Level2;

import java.util.Arrays;

public class Merge2SortedArray_31 {


    public static void Merge_WithoutExtraSpace(int[] arr1 ,int[] arr2){
        int i=0;
        int j=0;
        int k = arr1.length-1;
        while (i<=k){

             if(arr1[i]>arr2[j]){
                 int temp= arr2[j];
                 arr2[j]=arr1[k];
                 arr1[k]=temp;
                 k--;
                 j++;
             }
             else {
                 i++;
                 continue;
             }

        }
        Arrays.sort(arr1);
        Arrays.sort(arr2);



    }
    public static void merge(int[] arr1 ,int[] arr2){
        int n = arr1.length;
        int m= arr2.length;
        int len = n+m;
        int gap = len/2 +(len%2);
        while(gap>0){
            int left=0;
            int right = left+gap;
            while(right< len){

                if(left< n && right >=n){
                   swapIfGrater(arr1,arr2,left ,right-n);
                }
                else if (left>=n){
                    swapIfGrater(arr2,arr2,left-n,right-n);
                }else {

                    swapIfGrater(arr1,arr1,left,right);
                }
                left++;
                right++;

            }
            if(gap==1) {
                break;

            }
            gap = (gap/2)+(gap%2);
        }
    }
   public static void swapIfGrater(int[] arr1 ,int[] arr2 ,int i ,int j){
        if(arr1[i]>arr2[j]){
            int temp = arr1[i];
            arr1[i] = arr2[j];
            arr2[j] = temp;
        }
   }
    public static void printMerged(int[] arr1, int[] arr2) {
        for (int i = 0; i < arr1.length; i++) {
            System.out.print(arr1[i] + " ");
        }
        for (int i = 0; i < arr2.length; i++) {
            System.out.print(arr2[i] + " ");
        }
        System.out.println(); // for new line
    }
    public static void main(String[] args) {

        int[] arr1 ={1,3,5,7};
        int[] arr2 = {0,2,6,8,9};
//        merge(arr1,arr2);
        Merge_WithoutExtraSpace(arr1,arr2);
        printMerged(arr1, arr2);
    }
}
