/* The isBadVersion API is defined in the parent class VersionControl.
      boolean isBadVersion(int version); */

public class Solution extends VersionControl {
    public int firstBadVersion(int n) {
        int fp=0,lp=n,mid=0, ans=-1;
        while(fp<=lp){
            mid=fp+(lp-fp)/2;
            if(isBadVersion(mid)){
                ans=mid;
                lp=mid-1;
            }
            else{
                fp=mid+1;
            }
        }
        return ans;
    }
}