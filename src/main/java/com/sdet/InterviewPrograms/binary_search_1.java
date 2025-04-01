package com.sdet.InterviewPrograms;

public class binary_search_1 {

    public  static int binarySearch(int[] arr ,int key){
        int low=0;
        int high=arr.length-1;
        while (low<=high){

            int mid = (low+high)/2;
            if(arr[mid]==key){
                return mid;
            } else if (arr[mid]<key) {

                 low = mid+1;
            }
            else {
                high = mid-1;
            }

        }

        return -1;
    }

    public static void main(String[] args) {
        int[] arr ={-1,-2,0,4,6,7,9};
        int key =9;
        int index =binarySearch(arr,key);
        if(index != -1){
            System.out.println("element " + key + " found at index  " + index);
        }
        else{
            System.out.println("Not found in array");
        }
    }
}
