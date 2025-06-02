package com.sdet.InterviewPrograms.MediumPrograms_Level2;

public class Find_Minimum_in_Rotated_Sorted_Array {
    public static int findMin_array(int[] nums){

        if(nums.length==1){
            return nums[0];
        }
        else if(nums[0]<=nums[nums.length-1]){
            return nums[0];
        }
        int start=0;
        int end= nums.length-1;
        while(start<=end){
            int mid = (start+end)/2;
            if(mid!=nums.length-1 && nums[mid+1]<nums[mid]){
                return nums[mid+1];

            } else if (mid!=0&& nums[mid]<nums[mid-1]) {
                return nums[mid];
            }
            else if(nums[start]<=nums[mid]) {
                start = mid + 1;

            }
            else {
                end=mid-1;
            }


        }
        return -1;
    }
    public static void main(String[] args) {
        int[] a ={3,4,5,1,2};
        findMin_array(a);
    }
}
