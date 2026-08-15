class Solution {
    public int longestSubsequence(int[] nums) {
        
        int xor=0;
        int ans=nums.length;
        int non_zero=0;
        for(int num:nums){
            xor=xor^num;
            if(num!=0) non_zero++;
        }
        if(xor!=0)return ans;
        if(non_zero==0) return 0;
        return ans-1;
    }
}