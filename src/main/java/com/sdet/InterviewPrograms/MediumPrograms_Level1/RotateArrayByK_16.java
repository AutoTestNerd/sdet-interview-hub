package com.sdet.InterviewPrograms.MediumPrograms_Level1;

public class RotateArrayByK_16 {


    public static void reverseArray(int[] arr ,int i, int j){
        while (i<=j){

            int temp = arr[i];
            arr[i] =arr[j];
            arr[j]= temp;
            i++;
            j--;
        }
    }
    public static void rotateArray(int a[],int k){

        int i=0;
        int j=0;
        int n= a.length-1;
         k = k % n;
         if(k<0){
             k= n+k;
         }
        // rotate 1st 0- n-k

        reverseArray(a,0,n-k);

        reverseArray(a,n-k+1 ,n);

        reverseArray(a,0,n);

    }
    public static void printArray(int[] a){
        for (int i = 0; i <a.length ; i++) {
            System.out.print(" " + a[i]);
        }
    }
    public static void main(String[] args) {
            int[] arr = {1,2,3,4,5,6,7};
            int k=3;
        int n =arr.length;
        rotateArray(arr,k);
        printArray(arr);
    }
}
