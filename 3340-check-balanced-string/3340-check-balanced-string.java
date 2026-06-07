class Solution {
    public boolean isBalanced(String num) {
         int esum=0;
        for(int i=0;i<num.length();i+=2){
          esum+=num.charAt(i)-'0';
        }
            int osum=0;
        for(int i=1;i<num.length();i+=2){
          osum+=num.charAt(i)-'0';
        }
         if(esum==osum)
         return true;

return false;
    }
}