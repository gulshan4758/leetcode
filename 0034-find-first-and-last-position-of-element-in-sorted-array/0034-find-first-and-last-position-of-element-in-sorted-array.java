class Solution {
    public int[] searchRange(int[] nums, int target) {
        int arr[]=new int[2];
        arr[0]=ft(nums,target);
        arr[1]=lt(nums,target);
        return arr;

    }
     public int ft(int []nums,int target){
        int fp=0,lp=nums.length-1,ans=-1;
        while(fp<=lp){
             int mid=(fp+lp)/2;
            if(nums[mid]==target){
                ans=mid;
                lp=mid-1;
            }
            else if(nums[mid]>target){
                lp=mid-1;
            }
            else{
                fp=mid+1;
            }
        }
        return ans;
     }
      public int lt(int []nums,int target){
        int fp=0,lp=nums.length-1,ans=-1;
        while(fp<=lp){
             int mid=(fp+lp)/2;
            if(nums[mid]==target){
                ans=mid;
                fp=mid+1;
            }
            else if(nums[mid]>target){
                lp=mid-1;
            }
            else{
                fp=mid+1;
            }
        }
        return ans;
     }
}
     