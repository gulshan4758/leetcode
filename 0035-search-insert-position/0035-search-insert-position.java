class Solution {
    public int searchInsert(int[] nums, int target) {
        int fp=0,mid=0,lp=nums.length-1;
        while(fp<=lp){
            mid=(fp+lp)/2;
            if(nums[mid]==target){
                return mid;
            }
            else if(nums[mid]>target){
                lp=mid-1;
            }
            else{
                fp=mid+1;
            }
        }
        return fp;
    }
}