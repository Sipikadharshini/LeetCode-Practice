class Solution {
    public int findShortestSubArray(int[] nums) {
        Map<Integer,Integer> count=new HashMap<>();
        Map<Integer,Integer> first=new HashMap<>();
        Map<Integer,Integer> last=new HashMap<>();

        for(int i=0;i<nums.length;i++){
            count.put(nums[i],count.getOrDefault(nums[i],0)+1);
            if(!first.containsKey(nums[i])){
                  first.put(nums[i],i);
            }
            last.put(nums[i],i);
        }

            int maxfreq=Collections.max(count.values());
            int minLength = nums.length;
            for(int num:nums){
                if(count.get(num)==maxfreq){
                    int length = last.get(num) - first.get(num) + 1;
                    minLength = Math.min(minLength, length);
                }
            }
            return minLength;
    }
}