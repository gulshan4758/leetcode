class Solution {
    public int[] sortedSquares(int[] nums) {
        int n=nums.length;
        for(int i=0;i<n;i++){
            nums[i]=nums[i]*nums[i];

        }
        int []ans=new int [nums.length];
        int i=nums.length-1;
        int fp=0;
        int lp=nums.length-1;
        while(fp<=lp){
            if (nums[lp]==nums[fp]){
                ans[i]=nums[fp];
                fp++;
                i--;
            }
            else if(nums[lp]>nums[fp]){
                ans[i]=nums[lp];
                lp--;
                i--;

            }
            else{
                ans[i]=nums[fp];
                fp++;
                i--;
            }
        }
    return ans;

    }
}