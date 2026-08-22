class Solution {
    public boolean checkDivisibility(int n) {
        
        int copy=n;
        int digitSum=0;
        int digitpro=1;
        while(n>0){
            int digit=n%10;
            digitSum+=digit;
            digitpro*=digit;
            n=n/10;
        }
        int fin=digitpro+digitSum;

        if(copy%fin!=0) return false;
        return true;

    }
}