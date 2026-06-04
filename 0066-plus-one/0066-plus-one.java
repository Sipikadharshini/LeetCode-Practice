class Solution {
    public int[] plusOne(int[] digits) {
          for(int i=digits.length-1;i>=0;i--){
            if(digits[i]<9){
                digits[i]++;
                return digits;
            }
            digits[i]=0;
          }
          digits=new int[digits.length+1];
          digits[0]=1;
          return digits;

        /*int lastdigit=digits.length-1;
        int newdigit=digits[lastdigit]+1;
        if(newdigit/10==1){
              digits[digits.length]=0;
               digits[digits.length-1]=1;

        }
        digits[lastdigit]=newdigit;
        return digits;*/
    }
}