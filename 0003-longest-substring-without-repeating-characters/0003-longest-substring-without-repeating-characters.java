class Solution {
    public int lengthOfLongestSubstring(String s) {
        int n=s.length();
        Set<Character>set=new HashSet<>();
        int i=0, j=0,max=0;
        while(j<n){
            while(set.contains(s.charAt(j))){
                set.remove(s.charAt(i));
                i++;
            }
            set.add(s.charAt(j));
            max=Math.max(max,j-i+1);
            j++;

        }
        return max;
    }
}