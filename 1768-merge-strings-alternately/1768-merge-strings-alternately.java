class Solution {
    public String mergeAlternately(String word1, String word2) {
       StringBuilder sb=new StringBuilder();
        int i=word1.length();
        int j=word2.length();
        int w1=0;
        int w2=0;
        while(w1<i || w2<j){
            if(w1<i){
                sb.append(word1.charAt(w1));
                w1++;
             }
              if(w2<j){
                sb.append(word2.charAt(w2));
                w2++;
             }

        }
       return sb.toString(); 
    }
}