class Solution {
    public int findGCD(int[] nums) {
        
        Arrays.sort(nums);
        int first=0;
        int last=nums.length-1;

        for(int i=Math.max(nums[first],nums[last]);i>=1;i--){
            if(nums[first]%i==0 && nums[last]%i==0) return i;
        }
        return 1;
    }
}