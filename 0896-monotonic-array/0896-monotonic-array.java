class Solution {
    public boolean isMonotonic(int[] nums) {
        boolean isinc=true;
        boolean isdec=true;

        for(int i=1;i<nums.length;i++){
            if(!isinc && !isdec) return false;
            if(nums[i]<nums[i-1]) isinc=false;
             if(nums[i]>nums[i-1]) isdec=false;
        }

        return isinc||isdec;
    }
}