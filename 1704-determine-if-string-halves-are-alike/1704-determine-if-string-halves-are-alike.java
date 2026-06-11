class Solution {
    public boolean isVowel(char ch){
        return ch=='a' ||ch=='e' ||ch=='i' ||ch=='o' ||ch=='u';
    }
    public boolean halvesAreAlike(String s) {
        
        String sb =s.toLowerCase();
        int first=sb.length()/2;
        int second=sb.length();

        int count=0;
        int count2=0;
        for(int i=0;i<first;i++){
            if(isVowel(sb.charAt(i))) count++;
        }

      for(int i=first;i<second;i++){
            if(isVowel(sb.charAt(i))) count2++;
        }

        if(count==count2) return true;
        return false;
    }
}