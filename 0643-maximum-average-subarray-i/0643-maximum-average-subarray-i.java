class Solution {
    public double findMaxAverage(int[] nums, int k) {
        int n=nums.length;
        int sum=0,i=0, j=0,maxsum=Integer.MIN_VALUE;
        while(n>j){
            if (j-i+1<=k){
            sum=sum + nums[j];
            }
            else{
                sum=sum+nums[j];
                sum-=nums[i];
                i++;

            }
            if(j-i+1==k){
                maxsum=Math.max(sum,maxsum);
            }
              j++;
        }
     
     
       return (double) maxsum/k;
    }
}