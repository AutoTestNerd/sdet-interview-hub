package com.sdet.InterviewPrograms;

public class BubbleSort_2 {

    public static void main(String[] args) {
        int[] a = {4,3,7,1,5};
        for (int i = 0; i < a.length-1 ; i++) {
            for (int j = 0; j <a.length-1-i ; j++) {

              if(a[j]>a[j+1]){
                  int temp = a[j];
                  a[j] = a[j+1];
                  a[j+1]=temp;
              }

            }

        }
        printArray(a);
    }
    public static void printArray(int[] arr){
        for (int a :arr){
            System.out.println(a + " ");

        }
    }
}
