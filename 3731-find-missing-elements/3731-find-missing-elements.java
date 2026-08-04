class Solution {
    public List<Integer> findMissingElements(int[] nums) {
        List<Integer> result=new ArrayList<>();
        int minn=Integer.MAX_VALUE;
        int maxx=Integer.MIN_VALUE;
        for(int num:nums){
            minn=Math.min(minn,num);
            maxx=Math.max(maxx,num);
        }
        HashSet<Integer> set=new HashSet<>();
        for(int i=0;i<nums.length;i++){
            set.add(nums[i]);
        }

        for(int i=minn;i<=maxx;i++){
           if(!set.contains(i)){
                result.add(i);
           }
        }

        return result;
}
}