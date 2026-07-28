class Solution {
    public int waysToSplitArray(int[] nums) {
        
      long totalSum=0;
        long prefixSum=0;
        int count=0;
        for(int num:nums) totalSum+=num;
        for(int i=0;i<nums.length-1;i++){
             prefixSum+=nums[i];
             
             if(i!=nums.length-2){
             totalSum-=nums[i];
             }
             else{
                totalSum=nums[nums.length-1];
             }
           
            if(prefixSum>=totalSum){
             count++;
             }
        }

        return count;
    }
}