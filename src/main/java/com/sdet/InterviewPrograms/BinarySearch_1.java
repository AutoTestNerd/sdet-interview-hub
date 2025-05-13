package com.sdet.InterviewPrograms;

public class BinarySearch_1 {


    public static int binarySearh(int[] arr ,int k){

        int low =0;
        int high = arr.length-1;
        System.out.println("Sise -- " + arr.length);

        while (low<=high){

            int mid = (low+high)/2;

            if(arr[mid]==k){
                return mid;
            } else if (arr[mid]>k) {
                high = mid-1;

            }
            else {
                low =mid+1;

            }

        }

        return -1;
    }
    public static void main(String[] args) {
        int[] arr ={-2,-1,0,4,6,7,9};
        int key =-1;
       int pos = binarySearh(arr,key);
       if(pos != -1){
           System.out.println(key +" element  found at  " + pos);

       }
       else {
           System.out.println("Element not found in Array");

       }
    }
}
