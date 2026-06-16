class Solution {
    public String reverseWords(String s) {

       
        String[] words=s.split("\\ ");
                StringBuilder result=new StringBuilder();
        for(int i=0;i<words.length;i++){
             StringBuilder sb=new StringBuilder();
            sb.append(words[i]);
            sb.reverse();
            if(i<words.length-1){
            sb.append(" ");
            }
            if(i<words.length){
                result.append(sb);
            }
        }
        return result.toString();
    }
}