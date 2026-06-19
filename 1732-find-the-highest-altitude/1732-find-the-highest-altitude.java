class Solution {
    public int largestAltitude(int[] gain) {
        if(gain.length<0) return 0;

        int max=0;
        int prefixSum=0;
        for(int x:gain){
            prefixSum+=x;
            max=Math.max(prefixSum,max);
        }
        
        return max; 
    }
}