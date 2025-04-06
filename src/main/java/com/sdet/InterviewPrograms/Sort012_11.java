package com.sdet.InterviewPrograms;

public class Sort012_11 {

    public static void main(String[] args) {
        int[] a = {0,1,2,1,2,0,1,2,1,0,1,2,0,1};
        int low=0;
        int high = a.length-1;
        int mid =0;
        while (mid<=high){

            switch (a[mid]){

                case 0:

                    int temp= a[low];
                     a[low]= a[mid];
                     a[mid] =temp;
                     low++;
                    mid++;
                    break;
                case 1:
                     mid++;
                    break;


                case 2:
                    int temp1= a[mid];
                    a[mid]= a[high];
                    a[high] =temp1;
                    high--;
                    break;




            }

        }
        for (int i = 0; i <a.length ; i++) {

            System.out.print(a[i]);

        }
    }
}
