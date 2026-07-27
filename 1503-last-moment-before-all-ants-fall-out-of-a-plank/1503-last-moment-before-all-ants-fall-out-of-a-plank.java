class Solution {
    public int getLastMoment(int n, int[] left, int[] right) {

        int lastTime=0;

        for(int leftpos:left){
             lastTime=Math.max(leftpos,lastTime);
        }

          for(int rightpos:right){
             lastTime=Math.max(n-rightpos,lastTime);
        }
        
        return lastTime;
    }
}