class Solution {
    public int thirdMax(int[] nums) {
       long max3=Long.MIN_VALUE;
       long max2=Long.MIN_VALUE;
       long max1=Long.MIN_VALUE;

       for(int n:nums){
          long val=n;

          if(max3==val ||max2==val || max1==val) continue;

          if(val>max1){
            max3=max2;
            max2=max1;
            max1=val;
          }
           else if(val>max2){
            max3=max2;
            max2=val;
          }
          else if(val>max3){
            max3=val;
          }
       }
       return (max3==Long.MIN_VALUE)?(int)max1 :(int)max3;
   /* Arrays.sort(nums);
    int count=1;
    int n=nums.length;
    for(int i=1;i<nums.length;i++){
        if(nums[i]!=nums[i-1]){
             count++;
             if(count==3)return nums[0];

        }
    }
  return nums[n-1];*/
    
    }
}