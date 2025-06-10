package com.sdet.InterviewPrograms.MediumPrograms_Level2;
//YouTube - https://www.youtube.com/watch?v=bkJeA7LnJww
public class Find_Minimum_in_Rotated_Sorted_Array {
    public static int findMin_array(int[] nums){
//
        if(nums.length==1){
            return nums[0];
        }
//        else if(nums[0]<=nums[nums.length-1]){
//            return nums[0];
//        }
        int start=0;
        int end= nums.length-1;
        while(start<end){
            int mid = (start+end)/2;

            if(nums[mid]>nums[end]){
                start =mid+1;
            }
            else {
                end = mid;
            }
//            if(mid!=nums.length-1 && nums[mid+1]<nums[mid]){
//                return nums[mid+1];
//
//            } else if (mid!=0&& nums[mid]<nums[mid-1]) {
//                return nums[mid];
//            }
//            else if(nums[start]<=nums[mid]) {
//                start = mid + 1;
//
//            }
//            else {
//                end=mid-1;
//            }


        }
        return nums[start];
    }
    public static void main(String[] args) {
        int[] a ={3,4,5,-12,-11,0,1,2};
        System.out.println(findMin_array(a));;
    }
}
