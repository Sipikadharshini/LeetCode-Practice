class Solution {
    public boolean isPalindrome(int x) {
       if(x<0){ return false;}
       int rev=0;
       int num=x;
       int digit=0;
       while(num!=0){
          digit=num%10;
          rev=rev*10+digit;
          num=num/10;
       }
       if(rev==x) return true;
       else return false;
    }
}